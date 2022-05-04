package services;

import java.util.ArrayList;
import characters.WorstGeneration;
import repository.RepoWorstGeneration;



public class ServiceWorstGeneration {
	private RepoWorstGeneration repoWorstGeneration = new RepoWorstGeneration();
	
	
	public void addWorstGeneration(WorstGeneration worstgeneration) {
		repoWorstGeneration.save(worstgeneration);
    }
	
	public void printListWorstGenerations() {
		repoWorstGeneration.getArrayOfWorstGeneration().forEach(System.out::println);
    }
	
	public void printListWorstGenerationsByAg() {
		repoWorstGeneration.getArrayOfWorstGeneration().stream()
                .sorted((p1,p2) -> p1.getAgaistWorldG() - p2.getAgaistWorldG())
                .forEach(System.out::println);
    }
	
	public void removeWorstGenerationByIndex(int i) {
		repoWorstGeneration.removeWorstGenerationByIndex(i);
    }
	
    public void removeWorstGenerationsByName(String name) {
    	repoWorstGeneration.removeWorstGenerationByName(name);
    }
    
    public ArrayList<WorstGeneration> getArrayOfWorstGeneration(){
    	return repoWorstGeneration.getArrayOfWorstGeneration();   
    }
}
