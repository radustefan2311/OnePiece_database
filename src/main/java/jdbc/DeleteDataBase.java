package jdbc;

import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDataBase {
    private static DeleteDataBase ddb = null;
    private final DataBaseConnection dbcon = DataBaseConnection.getInstance();

    public DeleteDataBase() {
    }

    public static DeleteDataBase getInstance() {
        if(ddb == null)
            ddb = new DeleteDataBase();
        return ddb;
    }

    public void delete(String cls, String pk) {
        if(dbcon.getConn() != null) {
            try {
                Statement st = dbcon.getConn().createStatement();
                st.execute("DELETE FROM " + cls +
                        " WHERE Name=" + "\"" + pk + "\"");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
