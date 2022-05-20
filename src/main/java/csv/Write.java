package csv;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.TreeSet;

import characters.Emperor;
import characters.Warlord;
import characters.WorstGeneration;
import services.ServiceDevilFruit;
import services.ServiceEmperor;
import services.ServiceWarlord;
import services.ServiceWorstGeneration;
import special_abilities.DevilFruit;

public class Write {
	private static Write write = null;

    private Write() {
    }

    public static Write getInstance() {
    	if(write == null) 
    		write = new Write();
    	return write;
    }
    
    
    private void emperors(ServiceEmperor service) throws IOException {
    	try (PrintWriter writer = new PrintWriter("src/main/java/csv/emperor.csv")) {
			List<Emperor> list = service.getArrayOfEmperor();
			String header = "name, sea, age, status, threatLevel, crewSize, notority, kingdomsProtection, base";
			writer.println(header);
			
			for (Emperor emperor : list) {
			    writer.println(emperor.getName() + ", " + emperor.getSea() + ", " + emperor.getAge() + ", " + emperor.getStatus() + ", " + emperor.getThreatLevel() + ", " +
			    		emperor.getCrewSize() + ", " +  emperor.getNotority() + ", " + emperor.getKingdomsProtection() + ", " + emperor.getBase());
			}
		}
        
    }
    
    private void warlords(ServiceWarlord service) throws IOException {
    	try (PrintWriter writer = new PrintWriter("src/main/java/csv/warlord.csv")) {
			TreeSet<Warlord> list = service.getArrayOfWarlord();
			String header = "name, sea, age, status, threatLevel, crewSize, notority, missionsDone, yearsOfService";
			writer.println(header);
			
			for (Warlord warlord : list) {
			    writer.println(warlord.getName() + ", " + warlord.getSea() + ", " + warlord.getAge() + ", " + warlord.getStatus() + ", " + warlord.getThreatLevel() + ", " +
			    		warlord.getCrewSize() + ", " +  warlord.getNotority() + ", " + warlord.getMissionsDone() + ", " + warlord.getYearsOfService());
			}
		}
        
    }
    
    private void worstGens(ServiceWorstGeneration service) throws IOException {
    	try (PrintWriter writer = new PrintWriter("src/main/java/csv/worstGeneration.csv")) {
    		List<WorstGeneration> list = service.getArrayOfWorstGeneration();
			String header = "name, sea, age, status, threatLevel, crewSize, notority, agaistWorldG, supernova";
			writer.println(header);
			
			for (WorstGeneration worstgen : list) {
			    writer.println(worstgen.getName() + ", " + worstgen.getSea() + ", " + worstgen.getAge() + ", " + worstgen.getStatus() + ", " + worstgen.getThreatLevel() + ", " +
			    		worstgen.getCrewSize() + ", " +  worstgen.getNotority() + ", " +worstgen.getAgaistWorldG() + ", " + worstgen.isSupernova());
			}
		}
        
    }
    
    private void devilFruit(ServiceDevilFruit service) throws IOException {
    	try (PrintWriter writer = new PrintWriter("src/main/java/csv/devilFruit.csv")) {
			List<DevilFruit> list = service.getArrayOfDevilFruit();
			String header = "name, type, age, mythical";
			writer.println(header);
			
			for (DevilFruit devilFruit : list) {
			    writer.println(devilFruit.getName() + ", " + devilFruit.getType() + ", " + devilFruit.isMythical());
			}
		}
        
    }
    
    
    public void writeToFiles(ServiceEmperor serviceEmperor, ServiceWarlord serviceWarlord, ServiceWorstGeneration serviceWorstGen, ServiceDevilFruit serviceDevilFruit) {
    	try {
    		Log.log("Uploading emperors");
			emperors(serviceEmperor);
			Log.log("Uploading warlords");
			warlords(serviceWarlord);
			Log.log("Uploading worst generations");
			worstGens(serviceWorstGen);
			Log.log("Uploading devil fruits");
			devilFruit(serviceDevilFruit);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    }

}