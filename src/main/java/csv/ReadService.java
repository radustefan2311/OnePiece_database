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
import specialAbilities.DevilFruit;

public class ReadService {
	private static ReadService read = null;

    private ReadService() {
    }

    public static ReadService getInstance() {
    	if(read == null) 
    		read = new ReadService();
    	return read;
    }

    private void emperors(ServiceEmperor service) throws IOException {
        File file = new File("src/main/java/resources/emperor.csv");
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
    
    private void warlords(ServiceWarlord service) throws IOException {
        File file = new File("src/main/java/resources/warlord.csv");
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
    
    private void worstGen(ServiceWorstGeneration service) throws IOException {
        File file = new File("src/main/java/resources/worstGeneration.csv");
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
    
    private void devilFruit(ServiceDevilFruit service) throws IOException {
        File file = new File("src/main/java/resources/devilFruit.csv");
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

    public void loadC(ServiceEmperor serviceEmperor, ServiceWarlord serviceWarlord, ServiceWorstGeneration serviceWorstGen, ServiceDevilFruit serviceDevilFruit) {
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
