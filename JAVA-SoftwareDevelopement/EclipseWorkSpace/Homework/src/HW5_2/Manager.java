package HW5_2;

public class Manager extends Person{
	public void beResponsibleFor(Project p) {
		projects.add(p.toString());
		p.setManager(this);
	}
	public void assignDeparment(Department d) {
		deparment = d.toString();
		d.setManager(this);
	}
	public String deparment() {
		return deparment;
	}
	public String deparment;
}
