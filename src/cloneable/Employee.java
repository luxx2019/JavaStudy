package cloneable;


public class Employee implements Cloneable {
	private String name;
	private int age;
	public Department dept;
	private String address;

	@Override
	public Employee clone() throws CloneNotSupportedException {
		Employee emp = (Employee) super.clone();
		Department dept = new Department(this.dept.getId(), this.dept.getName());
		emp.dept = dept;
		return emp;
	}
	
	public Employee() {}

	public Employee(String name, int age, Department dept, String address) {
		this.name = name;
		this.age = age;
		this.dept = dept;
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
				"age'" + age + '\'' +
				", dept=" + dept +
				", address='" + address + '\'' +
				'}';
	}
}
