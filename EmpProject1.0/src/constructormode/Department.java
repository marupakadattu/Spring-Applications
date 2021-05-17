package constructormode;

public class Department {
	private int id;
	private String Dname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDname() {
		return Dname;
	}
	public void setDname(String dname) {
		Dname = dname;
	}
	Department(){
	
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", Dname=" + Dname + "]";
	}
}
