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
		repoEmperor.getAll().forEach(System.out::println);
    }
	
	public void printListEmperorsByKingdoms() {
		repoEmperor.getAll().stream()
                .sorted((p1,p2) -> p1.getKingdomsProtection() - p2.getKingdomsProtection())
                .forEach(System.out::println);
    }
	
	public void removeEmperorByIndex(int i) {
		repoEmperor.remove(i);
    }
	
	public void removeEmperorByName(String name) {
		ArrayList<Emperor> emperors = repoEmperor.getAll();
    	for(Emperor emperor : emperors)
        	if(emperor.getName().equals(name))
        		repoEmperor.remove(emperors.indexOf(emperor));
    }
	
	 public void updateKingdomsProtectionByName(String name, int newKingdomsProtection) {
		   ArrayList<Emperor> emperors = repoEmperor.getAll();
	  		for(Emperor emperor : emperors)
	  			if(emperor.getName().equals(name))
	  				repoEmperor.update(emperors.indexOf(emperor), "KingdomsProtection", Integer.toString(newKingdomsProtection));
	  }
	  
	  public void updateBaseByName(String name, String newBase) {
		  ArrayList<Emperor> emperors = repoEmperor.getAll();
	  		for(Emperor emperor : emperors)
	  			if(emperor.getName().equals(name))
	  				repoEmperor.update(emperors.indexOf(emperor), "base", newBase);	
	  }		
  
    public ArrayList<Emperor> getArrayOfEmperor(){
    	return repoEmperor.getAll();
    }
}
