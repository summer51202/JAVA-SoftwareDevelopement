package HW5_2;

import java.util.ArrayList;

public class Project {
	public ArrayList<String> workBy(){
		workers.add(0, manager);
		return workers;
	}
	public void setManager(Manager m) {
		manager = m.toString();
	}
	public void setWorker(Worker w) {
		workers.add(w.toString());
	}
	
	public String name, manager;
	public int budget, priority;
	public ArrayList<String> workers;
}	
