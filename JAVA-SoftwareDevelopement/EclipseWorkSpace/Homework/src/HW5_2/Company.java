package HW5_2;

import java.util.ArrayList;

public class Company {
	public void hire(Person person) {
		
	}
	public void fire(Person person) {
		
	} 
	public void addDepartment(Department d) {
		department.add(d);
		d.setCompany(this);
	}
	public ArrayList<String> products(){
		ArrayList<String> allProducts;
		for (Department department : department) {
			allProducts.addAll(department.products);
		}
		return allProducts;
	}
	
	public String name, address, phoneNumber, primaryProduct;
	public ArrayList<Department> department;
}
