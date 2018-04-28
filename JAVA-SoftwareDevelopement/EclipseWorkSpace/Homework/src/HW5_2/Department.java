package HW5_2;

import java.util.ArrayList;

public class Department {
	public ArrayList<String> products(){
		return products;
	}
	public void manufacture(Product p) {
		products.add(p.toString());
		p.setMaufacturer(this);
	}
	public void setManager(Manager m) {
		manager = m.toString();
	}
	public void setCompany(Company c) {
		company = c.toString();
	}
	
	public String name, manager, company;
	public ArrayList<String> products;
}
