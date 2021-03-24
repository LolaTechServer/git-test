package pack;

public class Department {

	private int id1;
	private String name;
	
		
	public Department(int id, String name) {
		super();
		this.id1 = id;
		this.name = name;
		
	}
	
	public int getId() {
		return id1;
	}
	public void setId(int id) {
		this.id1 = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department [id=" + id1 + ", name=" + name + "]";
	}
}
