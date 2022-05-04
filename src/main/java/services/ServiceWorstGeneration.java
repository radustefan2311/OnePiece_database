package services;

import java.util.LinkedList;
import java.util.function.Predicate;

import characters.WorstGeneration;



public class ServiceWorstGeneration {
LinkedList<WorstGeneration> listWorstGenerations = new LinkedList<>();
	
	
	public void addWorstGeneration(WorstGeneration worstgeneration) {
		listWorstGenerations.add(worstgeneration);
    }
	
	public void printListWorstGenerations() {
		listWorstGenerations.forEach(System.out::println);
    }
	
	public void printListWorstGenerationsByAg() {
		listWorstGenerations.stream()
                .sorted((p1,p2) -> p1.getAgaistWorldG() - p2.getAgaistWorldG())
                .forEach(System.out::println);
    }
	
	public void removeWorstGenerationByIndex(int i) {
		listWorstGenerations.remove(i);
    }
    public void removeWorstGenerationsByName(String name) {
        Predicate<WorstGeneration> filter = (WorstGeneration w) -> (w.getName().equalsIgnoreCase(name));
        listWorstGenerations.removeIf(filter);
    }
    
    public LinkedList<WorstGeneration> getArrayOfWorstGeneration(){
    	return  listWorstGenerations;
    }
}
