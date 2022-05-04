package repository;

import java.util.ArrayList;
import java.util.function.Predicate;

import characters.Warlord;

public class RepoWarlord {
	private ArrayList<Warlord> warlords = new ArrayList<>();
	
	public void save(Warlord warlord) {
		warlords.add(warlord);
	}
	
	public void removeWarlordByIndex(int i) {
		warlords.remove(i);
    }
    public void removeWarlordByName(String name) {
        Predicate<Warlord> filter = (Warlord wr) -> (wr.getName().equalsIgnoreCase(name));
        warlords.removeIf(filter);
    }
    
    public ArrayList<Warlord> getArrayOfWarlord(){
    	return warlords;
    }
}
