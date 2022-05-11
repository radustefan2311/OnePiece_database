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
		repoHaki.getAll().forEach(System.out::println);
    }
	
	public void printListHakisByType() {
		repoHaki.getAll().stream()
                .sorted((p1,p2) -> p1.getType().compareToIgnoreCase(p2.getType()))
                .forEach(System.out::println);
    }
	
	public void removeHakiByIndex(int i) {
		repoHaki.remove(i);
    }
	
	public void removeHakiByType(String type) {
		ArrayList<Haki> hakis = repoHaki.getAll();
    	for(Haki haki : hakis)
        	if(haki.getType().equals(type))
        		repoHaki.remove(hakis.indexOf(haki));
    }
	
	 public void updateByType(String type) {
		 ArrayList<Haki> hakis = repoHaki.getAll();
	    	for(Haki haki : hakis)
	        	if(haki.getType().equals(type))
	  				repoHaki.update(hakis.indexOf(haki));	
	  }	
    
    public ArrayList<Haki> getArrayOfHaki(){
    	return repoHaki.getAll();
    }
}

