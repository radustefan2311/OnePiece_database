package services;

import java.util.TreeSet;

import characters.Warlord;
import repository.RepoWarlord;

public class ServiceWarlord {
	private RepoWarlord repoWarlord = new RepoWarlord();
	
	
	public void addWarlord (Warlord warlord) {
		repoWarlord.save(warlord);
    }
	
	public void printListWarlords () {
		repoWarlord.getAll().forEach(System.out::println);
    }
	
	public void printListWarlordsByMissions() {
		repoWarlord.getAll().stream()
                .sorted((p1,p2) -> p1.getMissionsDone() - p2.getMissionsDone())
                .forEach(System.out::println);
    }
	
	
	public void removeWarlordByName(String name) {
		TreeSet<Warlord> warlords = repoWarlord.getAll();
    	for(Warlord warlord : warlords)
        	if(warlord.getName().equals(name))
        		repoWarlord.remove(warlord);
    }
	
	public void updateMissionsDoneByName(String name, int newMissionsDone) {
		TreeSet<Warlord> warlords = repoWarlord.getAll();
		int k = 0;
    	for(Warlord warlord : warlords) {
        	if(warlord.getName().equals(name))
	  			repoWarlord.update(k , "missionsDone", Integer.toString(newMissionsDone));
	  		k++;	
    	}
	  }
	
	public void updateYearsOfService(String name, int newYearsOfService) {
		TreeSet<Warlord> warlords = repoWarlord.getAll();
		int k = 0;
    	for(Warlord warlord : warlords) {
        	if(warlord.getName().equals(name))
	  			repoWarlord.update(k , "yearsOfService", Integer.toString(newYearsOfService));
    		k++;
    	}
	  }	
    
    public TreeSet<Warlord> getArrayOfWarlord(){
    	return repoWarlord.getAll();
    }
}
