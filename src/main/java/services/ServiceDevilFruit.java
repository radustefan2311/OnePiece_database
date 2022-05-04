package services;

import java.util.LinkedList;
import java.util.function.Predicate;

import special_abilities.DevilFruit;

public class ServiceDevilFruit {
LinkedList<DevilFruit> listDevilFruits = new LinkedList<>();
	
	
	public void addDevilFruit (DevilFruit devilfruit) {
		listDevilFruits.add(devilfruit);
    }
	
	public void printListDevilFruits () {
		listDevilFruits.forEach(System.out::println);
    }
//	public void printListDevilFruitsByName() {
//		listDevilFruits.stream()
//                .sorted((p1,p2) -> p1.getName().equals(p2.getName()))
//                .forEach(System.out::println);
//    }
	public void removeDevilFruitByIndex(int i) {
		listDevilFruits.remove(i);
    }
    public void removelistlistDevilFruitByName(String name) {
        Predicate<DevilFruit> filter = (DevilFruit d) -> (d.getName().equalsIgnoreCase(name));
        listDevilFruits.removeIf(filter);
    }
    
    public LinkedList<DevilFruit> getArrayOfDevilFruit(){
    	return  listDevilFruits;
    }
}
