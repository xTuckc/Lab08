package selectcontract;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;
import javax.sql.DataSource;
import oracle.jdbc.pool.OracleDataSource;


public class MyDataSourceFactory {

    public static DataSource getOracleDataSource() throws SQLException {

        Properties props = new Properties();
        FileInputStream fis = null;
        OracleDataSource oracleDS = null;
        try {
            fis = new FileInputStream("C:\\Users\\tuckw\\OneDrive\\ICS_WINTER_2020\\ICS125\\SelectContractLab08\\Lab08\\src\\selectcontract\\db.properties");
            props.load(fis);
            oracleDS = new OracleDataSource();
            oracleDS.setURL(props.getProperty("ORACLE_DB_URL"));
            oracleDS.setUser(props.getProperty("ORACLE_DB_USERNAME"));
            oracleDS.setPassword(props.getProperty("ORACLE_DB_PASSWORD"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return oracleDS;
    } // end getOracleDataSource
} // end class
