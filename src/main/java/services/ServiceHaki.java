package services;

import java.util.ArrayList;
import repository.RepoHaki;
import special_abilities.Haki;

public class ServiceHaki {
	private RepoHaki repoHaki = new RepoHaki();
	
	
	public void addHaki (Haki haki) {
		repoHaki.save(haki);
    }
	
	public void printListHakis () {
		repoHaki.getArrayOfHaki().forEach(System.out::println);
    }
	
	public void removeHakiByIndex(int i) {
		repoHaki.removeHakiByIndex(i);
    }
    public void removeHakiByType(String type) {
    	repoHaki.removeHakiByType(type);
    }
    
    public ArrayList<Haki> getArrayOfHaki(){
    	return repoHaki.getArrayOfHaki();
    }
}

