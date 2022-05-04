package services;

import java.util.LinkedList;
import java.util.function.Predicate;

import special_abilities.Haki;

public class ServiceHaki {
LinkedList<Haki> listHakis = new LinkedList<>();
	
	
	public void addHaki (Haki haki) {
		listHakis.add(haki);
    }
	
	public void printListHakis () {
		listHakis.forEach(System.out::println);
    }
	
	public void removeHakiByIndex(int i) {
		listHakis.remove(i);
    }
    public void removelistlistHakisByType (String type) {
        Predicate<Haki> filter = (Haki h) -> (h.getType().equalsIgnoreCase(type));
        listHakis.removeIf(filter);
    }
    
    public LinkedList<Haki> getArrayOfHaki(){
    	return listHakis;
    }
}
