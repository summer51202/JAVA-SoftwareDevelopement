package HW5_2;

public class Worker extends Person{
	public void workOn(Project p) {
		projects.add(p.toString());
		p.setWorker(this);
	}

}