package beans;

import java.util.Date;

public class Employee {
	private String name;
	private int age;
	public Date hireDay;
	private String address;
	
	public Employee() {}
	
	public Employee(String name, int age, Date hireDay, String address) {
		this.name = name;
		this.age = age;
		this.hireDay = hireDay;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"name='" + name + '\'' +
				", age=" + age +
				", hireDay=" + hireDay +
				", address='" + address + '\'' +
				'}';
	}
}
