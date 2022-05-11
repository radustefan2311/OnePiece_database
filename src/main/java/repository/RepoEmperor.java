package repository;

import java.util.ArrayList;


import characters.Emperor;

public class RepoEmperor {
	private ArrayList<Emperor> emperors = new ArrayList<>();
	
	public void save(Emperor emperor) {
		emperors.add(emperor);
	}
	
	public void remove(int i) {
		emperors.remove(i);
    }
    
	public void update(int index, String attribute, String newValue) {
		switch(attribute) {
		
		case "kingdomsProtection":
			emperors.get(index).setKingdomsProtection(Integer.parseInt(newValue));
			break;
		case "base":
			emperors.get(index).setBase(newValue);
			break;
		default:
			System.out.println("There is nothing to update!");
			break;
		}
		
	}
    
	public ArrayList<Emperor> getAll() {
        return emperors;
    }
    
}
