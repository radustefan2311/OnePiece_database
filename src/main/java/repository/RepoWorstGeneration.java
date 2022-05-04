package repository;

import java.util.ArrayList;
import java.util.function.Predicate;

import characters.WorstGeneration;

public class RepoWorstGeneration {
private ArrayList<WorstGeneration> worstgens = new ArrayList<>();
	
	public void save(WorstGeneration worsgeneration) {
		worstgens.add(worsgeneration);
	}
	
	public void removeWorstGenerationByIndex(int i) {
		worstgens.remove(i);
    }
    public void removeWorstGenerationByName(String name) {
        Predicate<WorstGeneration> filter = (WorstGeneration w) -> (w.getName().equalsIgnoreCase(name));
        worstgens.removeIf(filter);
    }
    
    public ArrayList<WorstGeneration> getArrayOfWorstGeneration(){
    	return worstgens;
    }
}
