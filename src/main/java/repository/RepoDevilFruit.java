package repository;

import java.util.ArrayList;


import special_abilities.DevilFruit;

public class RepoDevilFruit {
	private ArrayList<DevilFruit> devilfruits = new ArrayList<>();
	
	public void save(DevilFruit devilFruit) {
		devilfruits.add(devilFruit);
	}
	
	public void remove(int i) {
		devilfruits.remove(i);
    }
	
	public void update(int index, String attribute, String newValue) {
		switch(attribute) {
		
		case "name":
			devilfruits.get(index).setName(newValue);
			break;
		case "type":
			devilfruits.get(index).setType(newValue);
			break;
		default:
			System.out.println("There is nothing to update!");
			break;
		}
		
	}
    
    public ArrayList<DevilFruit> getAll(){
    	return devilfruits;
    }
}
