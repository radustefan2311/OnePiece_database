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
		repoDevilFruit.getAll().forEach(System.out::println);
    }
	
	public void printListDevilFruitsByName() {
		repoDevilFruit.getAll().stream()
                .sorted((p1,p2) -> p1.getName().compareToIgnoreCase(p2.getName()))
                .forEach(System.out::println);
    }
	
	public void removeDevilFruitByIndex(int i) {
		repoDevilFruit.remove(i);
    }
	
	public void removeDevilFruitByName(String name) {
		ArrayList<DevilFruit> devilfruits = repoDevilFruit.getAll();
    	for(DevilFruit devilfruit : devilfruits)
        	if(devilfruit.getName().equals(name))
        		repoDevilFruit.remove(devilfruits.indexOf(devilfruit));
    }
	

	public void updateTypeByName(String name, String newType) {
		ArrayList<DevilFruit> devilfruits = repoDevilFruit.getAll();
    	for(DevilFruit devilfruit : devilfruits)
        	if(devilfruit.getName().equals(name))
	  			repoDevilFruit.update(devilfruits.indexOf(devilfruit), "Type", newType);	
	  }		
  
    public ArrayList<DevilFruit> getArrayOfDevilFruit(){
    	return repoDevilFruit.getAll();
    }
}
