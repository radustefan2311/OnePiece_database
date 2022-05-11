package repository;

import java.util.ArrayList;


import characters.WorstGeneration;

public class RepoWorstGeneration {
private ArrayList<WorstGeneration> worstgens = new ArrayList<>();
	
	public void save(WorstGeneration worsgeneration) {
		worstgens.add(worsgeneration);
	}
	
	public void remove(int i) {
		worstgens.remove(i);
    }
	
	public void update(int index, String attribute, String newValue) {
		switch(attribute) {
		
		case "agaistWorldG":
			worstgens.get(index).setAgaistWorldG(Integer.parseInt(newValue));
			break;
		case "status":
			worstgens.get(index).setStatus(newValue);
			break;
		default:
			System.out.println("There is nothing to update!");
			break;
		}
		
	}
    
    public ArrayList<WorstGeneration> getAll(){
    	return worstgens;
    }
}
