package models;

	public class Employee {
	    private int empNo;
	    private String eName;
	    private double salary;
	   Department department;
	    public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
		public int getEmpNo() {
	        return empNo;
	    }
	    public void setEmpNo(int empNo) {
	        this.empNo = empNo;
	    }
	    public String geteName() {
	        return eName;
	    }
	    public void seteName(String eName) {
	        this.eName = eName;
	    }
	    public double getSalary() {
	        return salary;
	    }
	    public void setSalary(double salary) {
	        this.salary = salary;
	    }
	    Employee(){
	    }
	    public void displayInfo(){  
	        System.out.println("Employee Details@ \n ID : " + empNo + " Name: " + eName + " Department : " + department +
	        		"Salary : " + salary );
	    }    
	}