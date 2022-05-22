package repository;

import java.util.ArrayList;

import specialAbilities.Haki;

public class RepoHaki {
private ArrayList<Haki> hakis = new ArrayList<>();
	
	public void save(Haki haki) {
		hakis.add(haki);
	}
	
	public void remove(int i) {
		hakis.remove(i);
    }
	
	public void update(int index) {
		hakis.get(index).isAdvanced();
	}
    
    public ArrayList<Haki> getAll(){
    	return hakis;
    }
}
