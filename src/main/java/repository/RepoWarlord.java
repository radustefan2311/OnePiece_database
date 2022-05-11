package repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import characters.Warlord;

public class RepoWarlord {
	private TreeSet<Warlord> warlords = new TreeSet<>();
	
	public void save(Warlord warlord) {
		warlords.add(warlord);
	}
	
	public void remove(Warlord warlord) {
		warlords.remove(warlord);
    }
	
	public void update(int index, String attribute, String newValue) {
		  List<Warlord> wars = new ArrayList<Warlord> (warlords);;
		
		switch(attribute) {
		
		case "missionsDone":
			wars.get(index).setMissionsDone(Integer.parseInt(newValue));
			break;
		case "yearsOfService":
			wars.get(index).setYearsOfService(Integer.parseInt(newValue));;
			break;
		default:
			System.out.println("There is nothing to update!");
			break;
		}
		this.warlords = new TreeSet<Warlord>(wars);
	}
    
    public TreeSet<Warlord> getAll(){
    	return warlords;
    }
}
