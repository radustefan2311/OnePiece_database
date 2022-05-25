package jdbc;

import java.sql.SQLException;
import java.sql.Statement;
import characters.Emperor;
import characters.Warlord;
import specialAbilities.DevilFruit;
import specialAbilities.Haki;

public class WriteDataBase {
    private static WriteDataBase writeDB = null;
    private final DataBaseConnection dbcon = DataBaseConnection.getInstance();
    private Statement st = null;

    private WriteDataBase() {
    }

    public static WriteDataBase getInstance() {
        if(writeDB == null)
        	writeDB = new WriteDataBase();
        return writeDB;
    }

    public void Emperor(Emperor emperor) {
        if(dbcon.getConn() != null) {
            try {
                st = dbcon.getConn().createStatement();
                st.execute("INSERT INTO emperor VALUES(" +
                        "\"" + emperor.getName() + "\"" + "," +
                        "\"" + emperor.getSea() + "\"" + "," +
                        "\"" + emperor.getAge() + "\"" + "," +
                        "\"" + emperor.getStatus() + "\"" + "," +
                        "\"" + emperor.getThreatLevel() + "\"" + "," +
                        "\"" + emperor.getCrewSize() + "\"" + "," +
                        "\"" + emperor.getNotority() + "\"" + "," +
                        "\"" + emperor.getKingdomsProtection() + "\"" + "," +
                        "\"" + emperor.getBase() + "\"" + "," +
                        ")");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public void DevilFruit(DevilFruit dv) {
        if(dbcon.getConn() != null) {
            try {
                st = dbcon.getConn().createStatement();
                st.execute("INSERT INTO devilfruit VALUES(" +
                        "\"" + dv.getName() + "\"" + "," +
                        "\"" + dv.getType() + "\"" + "," +
                        "\"" + dv.isMythical() + "\"" +
                        ")");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public void Haki(Haki haki) {
        if(dbcon.getConn() != null) {
            try {
                st = dbcon.getConn().createStatement();
                st.execute("INSERT INTO haki VALUES(" +
                        "\"" + haki.getType() + "\"" + "," +
                        "\"" + haki.isAdvanced() + "\"" + "," +            
                        ")");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public void Warlord(Warlord war) {
        if(dbcon.getConn() != null) {
            try {
                st = dbcon.getConn().createStatement();
                st.execute("INSERT INTO warlord VALUES(" +
                		 "\"" + war.getName() + "\"" + "," +
                         "\"" + war.getSea() + "\"" + "," +
                         "\"" + war.getAge() + "\"" + "," +
                         "\"" + war.getStatus() + "\"" + "," +
                         "\"" + war.getThreatLevel() + "\"" + "," +
                         "\"" + war.getCrewSize() + "\"" + "," +
                         "\"" + war.getNotority() + "\"" + "," +
                         "\"" + war.getMissionsDone() + "\"" + "," +
                         "\"" + war.getYearsOfService() + "\"" + "," +
                         ")");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
}
