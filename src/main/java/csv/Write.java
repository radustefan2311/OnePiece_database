package csv;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import characters.Emperor;
import services.ServiceEmperor;

public class Write {
	private static final Write wr_csv = null;

    private Write() {
    }

    public static Write getInstance() {
        return wr_csv;
    }
    
    
    private static void emperors(ServiceEmperor service) throws IOException {
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
    
    public static void writeToFiles(ServiceEmperor serviceEmp) {
    	try {
    		Log.log("Uploading emperors");
			emperors(serviceEmp);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    }

}