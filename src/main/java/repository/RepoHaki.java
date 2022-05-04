package repository;

import java.util.ArrayList;
import java.util.function.Predicate;

import special_abilities.Haki;

public class RepoHaki {
private ArrayList<Haki> hakis = new ArrayList<>();
	
	public void save(Haki haki) {
		hakis.add(haki);
	}
	
	public void removeHakiByIndex(int i) {
		hakis.remove(i);
    }
	public void removeHakiByType (String type) {
        Predicate<Haki> filter = (Haki h) -> (h.getType().equalsIgnoreCase(type));
        hakis.removeIf(filter);
    }
    
    public ArrayList<Haki> getArrayOfHaki(){
    	return hakis;
    }
}
