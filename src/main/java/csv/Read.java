package csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import characters.Emperor;
import services.ServiceEmperor;

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
        BufferedReader br = new BufferedReader(fr);
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

    public static void loadClasses(ServiceEmperor serviceEmp) {
        try {
            emperors(serviceEmp);
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
