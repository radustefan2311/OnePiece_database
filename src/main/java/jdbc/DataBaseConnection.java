package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    private static DataBaseConnection dbConn = null;
    private Connection conn = null;

    private DataBaseConnection() {
    }

    public static DataBaseConnection getInstance() {
        if(dbConn == null)
        	dbConn = new DataBaseConnection();
        return dbConn;
    }

    public void startConn() throws SQLException, ClassNotFoundException {
        if(conn == null) {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/one_piece_database";
            String user = "root";
            String pass = "root";

            conn = DriverManager.getConnection(url, user, pass);
        }
    }

    public Connection getConn() {
        return conn;
    }

    public void closeConn() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
