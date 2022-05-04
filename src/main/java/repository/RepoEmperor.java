package repository;

import java.util.ArrayList;
import java.util.function.Predicate;

import characters.Emperor;

public class RepoEmperor {
	private ArrayList<Emperor> emperors = new ArrayList<>();
	
	public void save(Emperor emperor) {
		emperors.add(emperor);
	}
	
	public void removeEmperorByIndex(int i) {
		emperors.remove(i);
    }
    public void removeEmperorsByName(String name) {
        Predicate<Emperor> filter = (Emperor e) -> (e.getName().equalsIgnoreCase(name));
        emperors.removeIf(filter);
    }
    
    public ArrayList<Emperor> getArrayOfEmperor(){
    	return emperors;
    }
    
}
