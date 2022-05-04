package services;

import java.util.ArrayList;
import repository.RepoDevilFruit;
import special_abilities.DevilFruit;

public class ServiceDevilFruit {
	private RepoDevilFruit repoDevilFruit = new RepoDevilFruit();
	
	
	public void addDevilFruit (DevilFruit devilfruit) {
		repoDevilFruit.save(devilfruit);
    }
	
	public void printListDevilFruits () {
		repoDevilFruit.getArrayOfDevilFruit().forEach(System.out::println);
    }
//	public void printListDevilFruitsByName() {
//		listDevilFruits.stream()
//                .sorted((p1,p2) -> p1.getName().equals(p2.getName()))
//                .forEach(System.out::println);
//    }
	public void removeDevilFruitByIndex(int i) {
		repoDevilFruit.removeDevilFruitByIndex(i);
    }
    public void removeDevilFruitByName(String name) {
    	repoDevilFruit.removeDevilFruitByName(name);
    }
    
    public ArrayList<DevilFruit> getArrayOfDevilFruit(){
    	return repoDevilFruit.getArrayOfDevilFruit();
    }
}
