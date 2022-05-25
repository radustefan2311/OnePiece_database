package jdbc;

import java.io.IOException;
import java.sql.*;

import characters.Emperor;
import characters.Warlord;
import csv.Log;
import services.ServiceDevilFruit;
import services.ServiceEmperor;
import services.ServiceHaki;
import services.ServiceWarlord;
import specialAbilities.DevilFruit;
import specialAbilities.Haki;


public class ReadDataBase {
    private static ReadDataBase readDB = null;

    private ReadDataBase() {
    }

    public static ReadDataBase getInstance() {
        if(readDB == null)
        	readDB = new ReadDataBase();
        return readDB;
    }

    private void loadEmperor(ServiceEmperor service, Statement statement) {
        try {
            ResultSet rs = statement.executeQuery("SELECT * FROM emperor");
            while(rs.next()) {
                service.addEmperor(new Emperor(rs.getString("name"),
                								rs.getString("sea"),
                								rs.getInt("age"),
                								rs.getString("status"),
                								rs.getInt("threatLevel"),
                								rs.getInt("crewSize"),
                								rs.getString("notority"),
                								rs.getInt("kingdomsProtection"),
                								rs.getString("base")
                									));
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
    
    private void loadDevilFruit(ServiceDevilFruit service, Statement statement){
        try {
            ResultSet rs = statement.executeQuery("SELECT * FROM devilfruits");
            while(rs.next()) {
                service.addDevilFruit(new DevilFruit(rs.getString("name"),
                									rs.getString("type"),
                									rs.getBoolean("mythic")
                		                   ));
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
    private void loadHaki(ServiceHaki service, Statement statement) {
        try {
            ResultSet rs = statement.executeQuery("SELECT * FROM haki");
            while(rs.next()) {
                service.addHaki(new Haki(rs.getString("type"),
										rs.getBoolean("advanced")
								));
                       
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    private void loadWarlord(ServiceWarlord service, Statement statement) {
        try {
            ResultSet rs = statement.executeQuery("SELECT * FROM warlord");
            while(rs.next()) {
                service.addWarlord(new Warlord(rs.getString("name"),
                		rs.getString("sea"),
						rs.getInt("age"),
						rs.getString("status"),
						rs.getInt("threatLevel"),
						rs.getInt("crewSize"),
						rs.getString("notority"),
						rs.getInt("missionsDone"),
						rs.getInt("yearsOfService")
                		));
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
    
    public void loadObjects(ServiceEmperor serviceEmperor, ServiceDevilFruit serviceDevilFruit, ServiceHaki serviceHaki, ServiceWarlord serviceWarlord) {
        try {
            Log.log("Loading objects from MySQL database..");
            DataBaseConnection dbcon = DataBaseConnection.getInstance();
            Statement st = dbcon.getConn().createStatement();

            loadEmperor(serviceEmperor, st);
            loadDevilFruit(serviceDevilFruit, st);
            loadHaki(serviceHaki, st);
            loadWarlord(serviceWarlord, st);
            
            Log.log("Finished!");
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
}