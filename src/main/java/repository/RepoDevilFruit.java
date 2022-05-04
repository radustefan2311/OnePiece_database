package repository;

import java.util.ArrayList;
import java.util.function.Predicate;

import special_abilities.DevilFruit;

public class RepoDevilFruit {
	private ArrayList<DevilFruit> devilfruits = new ArrayList<>();
	
	public void save(DevilFruit devilFruit) {
		devilfruits.add(devilFruit);
	}
	
	public void removeDevilFruitByIndex(int i) {
		devilfruits.remove(i);
    }
	public void removeDevilFruitByName(String name) {
        Predicate<DevilFruit> filter = (DevilFruit d) -> (d.getName().equalsIgnoreCase(name));
        devilfruits.removeIf(filter);
    }
    
    public ArrayList<DevilFruit> getArrayOfDevilFruit(){
    	return devilfruits;
    }
}
