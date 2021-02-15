package pack;

public class Department {
	private int id;
	private String name;
	//change1
	//change2
	//change4
	//change branch2
	
	
	// WE are so stupid
		
	public Department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
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

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
}
