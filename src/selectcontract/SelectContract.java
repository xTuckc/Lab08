package selectcontract;
//test

import java.sql.SQLException;

public class SelectContract {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        ContractView theView = new ContractView();
        ContractModel theModel = new ContractModel();
        ContractController theController;
        theController = new ContractController(theView, theModel);
        theView.setVisible(true);
    }
}
