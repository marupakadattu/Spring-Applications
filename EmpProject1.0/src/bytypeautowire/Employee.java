package bytypeautowire;

public class Employee {
	private int id;
	private String name;
	Department dept;
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	Employee(){
	
	}
	@Override
	public String toString() {
		return "Employee Details : id=" + id + ", name=" + name + ", dept=" + dept + " ";
	}
	
}

