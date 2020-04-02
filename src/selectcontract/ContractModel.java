package selectcontract;
//test
import java.sql.Connection;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;
import javax.sql.DataSource;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;


class ContractModel {

    private ArrayList<Contract> theContracts;
    private int contractCounter;
    private ArrayList<Contract> theContractsAll;
    private SortedSet<String> originCityList;

    public ContractModel() throws SQLException {

        contractCounter = 0;
        theContracts = new ArrayList<Contract>();
        originCityList = new TreeSet<>();

        DataSource ds = MyDataSourceFactory.getOracleDataSource();
        Connection con = ds.getConnection();
        CallableStatement cstmt = con.prepareCall("BEGIN CAUDETTE_20W.PKGREC.CONTRACT_LIST(?); END;");
        cstmt.registerOutParameter(1, OracleTypes.CURSOR);
        cstmt.execute();
        ResultSet rs = ((OracleCallableStatement) cstmt).getCursor(1);

        try {
            while (rs.next()) {
                String contractID = rs.getString("CONTRACTID");
                String origCity = rs.getString("ORIGCITY");
                String destCity = rs.getString("DESTCITY");
                String orderItem = rs.getString("ORDERITEM");

                Contract dataContract = new Contract(contractID,
                        origCity,
                        destCity,
                        orderItem);
                theContracts.add(dataContract);
                originCityList.add(dataContract.getOriginCity());
            } // end while
        } catch (SQLException s) {
            System.out.println(s.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (cstmt != null) {
                    cstmt.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        originCityList.add("All");
        theContractsAll = theContracts;
    }

    public String[] getOriginCityList() {
        String[] a;
        a = originCityList.toArray(new String[originCityList.size()]);
        return a;
    }

    public void updateContractList(String city) {
        theContracts = new ArrayList<>(theContractsAll);
        if (!"All".equals(city)) {
            theContracts.removeIf(s -> !s.contains(city));
        }
        contractCounter = 0;
    }

    public boolean foundContracts() {
        return theContracts.size() >= 1;
    }

    public Contract getTheContract() {
        return theContracts.get(contractCounter);
    }

    public int getContractCount() {
        return theContracts.size();
    }

    public int getCurrentContractNum() {
        return contractCounter;
    }

    public void nextContract() {
        if (contractCounter < theContracts.size()) {
            contractCounter++;
        }
    }

    public void prevContract() {
        if (contractCounter > 0) {
            contractCounter--;
        }
    }
}
