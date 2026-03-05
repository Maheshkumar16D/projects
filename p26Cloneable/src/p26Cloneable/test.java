package p26Cloneable;

import java.util.Objects;

public class test {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee e1= new Employee("Mahesh", "nandura");
		System.out.println(e1.hashCode());
		
		
		Employee e2= (Employee)e1.clone();
		System.out.println(e2.hashCode());
	}
	
	
	
	
}


class Employee implements Cloneable {
	
	private String name;
	private String address;
	
	@Override
	  protected Object clone() throws CloneNotSupportedException{
		return (Employee)super.clone();
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(address, name);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(address, other.address) && Objects.equals(name, other.name);
	}



	public Employee(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}

interface EmployeeSevice {
	
	String SaveEmployee();
	String addEmployee();
	
}

class EmployeeServiceImpl implements EmployeeSevice{

	@Override
	public String SaveEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addEmployee() {
		// TODO Auto-generated method stub
		return null;
	}
	

}