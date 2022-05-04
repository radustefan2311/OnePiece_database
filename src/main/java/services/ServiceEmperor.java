package services;

import java.util.ArrayList;
import characters.Emperor;
import repository.RepoEmperor;

public class ServiceEmperor {
private RepoEmperor repoEmperor = new RepoEmperor();
	
	
	public void addEmperor(Emperor emperor) {
		repoEmperor.save(emperor);
    }
	
	public void printListEmperors() {
		repoEmperor.getArrayOfEmperor().forEach(System.out::println);
    }
	
	public void printListEmperorsByKingdoms() {
		repoEmperor.getArrayOfEmperor().stream()
                .sorted((p1,p2) -> p1.getKingdomsProtection() - p2.getKingdomsProtection())
                .forEach(System.out::println);
    }
	
	public void removeEmperorByIndex(int i) {
		repoEmperor.removeEmperorByIndex(i);
    }
    public void removeEmperorsByName(String name) {
       repoEmperor.removeEmperorsByName(name);
    }
    
    public ArrayList<Emperor> getArrayOfEmperor(){
    	return repoEmperor.getArrayOfEmperor();
    }
}
