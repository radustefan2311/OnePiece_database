package csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import characters.Emperor;
import characters.Warlord;
import characters.WorstGeneration;
import services.ServiceDevilFruit;
import services.ServiceEmperor;
import services.ServiceWarlord;
import services.ServiceWorstGeneration;
import special_abilities.DevilFruit;

public class Read {
	private static final Read rw_csv = null;

    private Read() {
    }

    public static Read getInstance() {
        return rw_csv;
    }

    private static void emperors(ServiceEmperor service) throws IOException {
        File file = new File("src/main/java/csv/emperor.csv");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr,10 *1024);
        String line = null;
        String[] tempArray = null;
        line = br.readLine();
        line = null;
        while((line = br.readLine()) != null) {
            tempArray = line.split(",");
            service.addEmperor(new Emperor(tempArray[0], tempArray[1], Integer.parseInt(tempArray[2].trim()), tempArray[3], Integer.parseInt(tempArray[4].trim()), Integer.parseInt(tempArray[5].trim()), 
            		tempArray[6],Integer.parseInt(tempArray[7].trim()), tempArray[8]));      

        }
        br.close();
    }
    
    private static void warlords(ServiceWarlord service) throws IOException {
        File file = new File("src/main/java/csv/warlord.csv");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr,10 *1024);
        String line = null;
        String[] tempArray = null;
        line = br.readLine();
        line = null;
        while((line = br.readLine()) != null) {
            tempArray = line.split(",");
            service.addWarlord(new Warlord(tempArray[0], tempArray[1], Integer.parseInt(tempArray[2].trim()), tempArray[3], Integer.parseInt(tempArray[4].trim()), Integer.parseInt(tempArray[5].trim()), 
            		tempArray[6],Integer.parseInt(tempArray[7].trim()), Integer.parseInt(tempArray[8].trim()))); 

        }
        br.close();
    }
    
    private static void worstGen(ServiceWorstGeneration service) throws IOException {
        File file = new File("src/main/java/csv/worstGeneration.csv");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr,10 *1024);
        String line = null;
        String[] tempArray = null;
        line = br.readLine();
        line = null;
        while((line = br.readLine()) != null) {
            tempArray = line.split(",");
            service.addWorstGeneration(new WorstGeneration(tempArray[0], tempArray[1], Integer.parseInt(tempArray[2].trim()), tempArray[3], Integer.parseInt(tempArray[4].trim()), Integer.parseInt(tempArray[5].trim()), 
            		tempArray[6],Integer.parseInt(tempArray[7].trim()), Boolean.parseBoolean(tempArray[8].trim())));

        }
        br.close();
    }
    
    private static void devilFruit(ServiceDevilFruit service) throws IOException {
        File file = new File("src/main/java/csv/devilFruit.csv");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr,10 *1024);
        String line = null;
        String[] tempArray = null;
        line = br.readLine();
        line = null;
        while((line = br.readLine()) != null) {
            tempArray = line.split(",");
            service.addDevilFruit(new DevilFruit(tempArray[0], tempArray[1], Boolean.parseBoolean(tempArray[2].trim())));
                    
        }
        br.close();
    }

    public static void loadC(ServiceEmperor serviceEmperor, ServiceWarlord serviceWarlord, ServiceWorstGeneration serviceWorstGen, ServiceDevilFruit serviceDevilFruit) {
    	try {
    		Log.log("Loading emperors");
			emperors(serviceEmperor);
			Log.log("Loading warlords");
			warlords(serviceWarlord);
			Log.log("Loading worst generations");
			worstGen(serviceWorstGen);
			Log.log("Loading devil fruits");
			devilFruit(serviceDevilFruit);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    }

}
