package services;

import java.util.ArrayList;
import characters.Warlord;
import repository.RepoWarlord;

public class ServiceWarlord {
	private RepoWarlord repoWarlord = new RepoWarlord();
	
	
	public void addWarlord (Warlord warlord) {
		repoWarlord.save(warlord);
    }
	
	public void printListWarlords () {
		repoWarlord.getArrayOfWarlord().forEach(System.out::println);
    }
	
	public void printListWarlordsByMissions() {
		repoWarlord.getArrayOfWarlord().stream()
                .sorted((p1,p2) -> p1.getMissionsDone() - p2.getMissionsDone())
                .forEach(System.out::println);
    }
	
	public void removeWarlordByIndex(int i) {
		repoWarlord.removeWarlordByIndex(i);
    }
    public void removelistWarlordByName(String name) {
    	repoWarlord.removeWarlordByName(name);
    }
    
    public ArrayList<Warlord> getArrayOfWarlord(){
    	return repoWarlord.getArrayOfWarlord();
    }
}
