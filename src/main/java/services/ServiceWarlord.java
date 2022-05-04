package services;

import java.util.LinkedList;
import java.util.function.Predicate;

import characters.Warlord;

public class ServiceWarlord {
LinkedList<Warlord> listWarlord = new LinkedList<>();
	
	
	public void addWarlord (Warlord warlord) {
		listWarlord.add(warlord);
    }
	
	public void printListWarlords () {
		listWarlord.forEach(System.out::println);
    }
	
	public void printListWarlordsByMissions() {
		listWarlord.stream()
                .sorted((p1,p2) -> p1.getMissionsDone() - p2.getMissionsDone())
                .forEach(System.out::println);
    }
	
	public void removeWarlordByIndex(int i) {
		listWarlord.remove(i);
    }
    public void removelistWarlordByName(String name) {
        Predicate<Warlord> filter = (Warlord wr) -> (wr.getName().equalsIgnoreCase(name));
        listWarlord.removeIf(filter);
    }
    
    public LinkedList<Warlord> getArrayOfWarlord(){
    	return listWarlord;
    }
}
