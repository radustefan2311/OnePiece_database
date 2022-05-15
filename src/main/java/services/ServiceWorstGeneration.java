package services;

import java.io.IOException;
import java.util.ArrayList;

import characters.WorstGeneration;
import csv.Log;
import repository.RepoWorstGeneration;



public class ServiceWorstGeneration {
	private RepoWorstGeneration repoWorstGeneration = new RepoWorstGeneration();
	
	
	public void addWorstGeneration(WorstGeneration worstgeneration) throws IOException {
		Log.log("Adding worst generation: " + worstgeneration.getName());
		repoWorstGeneration.save(worstgeneration);
    }
	
	public void printListWorstGenerations() {
		repoWorstGeneration.getAll().forEach(System.out::println);
    }
	
	public void printListWorstGenerationsByAg() {
		repoWorstGeneration.getAll().stream()
                .sorted((p1,p2) -> p1.getAgaistWorldG() - p2.getAgaistWorldG())
                .forEach(System.out::println);
    }
	
	public void removeWorstGenerationByIndex(int i) {
		repoWorstGeneration.remove(i);
    }
	
	public void removeWorstGenByName(String name) throws IOException {
		Log.log("Removing worst generation: " + name);
		ArrayList<WorstGeneration> worstgens = repoWorstGeneration.getAll();
    	for(WorstGeneration worstgen : worstgens)
        	if(worstgen.getName().equals(name))
        		repoWorstGeneration.remove(worstgens.indexOf(worstgen));
    }
	
	public void updateAgaistWorldGByName(String name, int newAgaistWorld) {
		ArrayList<WorstGeneration> worstgens = repoWorstGeneration.getAll();
    	for(WorstGeneration worstgen : worstgens)
        	if(worstgen.getName().equals(name))
        		repoWorstGeneration.update(worstgens.indexOf(worstgen), "AgaistWorld", Integer.toString(newAgaistWorld));
	  }
	
	public void updateStatusByName(String name, String newStatus) {
		ArrayList<WorstGeneration> worstgens = repoWorstGeneration.getAll();
    	for(WorstGeneration worstgen : worstgens)
        	if(worstgen.getName().equals(name))
        		repoWorstGeneration.update(worstgens.indexOf(worstgen), "Status", newStatus);
	  }
    
    public ArrayList<WorstGeneration> getArrayOfWorstGeneration(){
    	return repoWorstGeneration.getAll();   
    }
}
