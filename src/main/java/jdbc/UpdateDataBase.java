package jdbc;

import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDataBase {
    private static UpdateDataBase udb = null;
    private final DataBaseConnection dbcon = DataBaseConnection.getInstance();

    private UpdateDataBase() {
    }

    public static UpdateDataBase getInstance() {
        if(udb == null)
            udb = new UpdateDataBase();
        return udb;
    }

    public void update(String cls, String field, String value, String pk) {
        if(dbcon.getConn() != null) {
            try {
                Statement st = dbcon.getConn().createStatement();
                st.execute("UPDATE " + cls + " SET " +
                        field + "=" + value +
                        " WHERE Name=" + "\"" + pk + "\"");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}