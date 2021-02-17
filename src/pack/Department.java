package pack;

public class Department {
	private int id;
	private String name;
	//change1
	//change2 
	//change4
	//change branch2
<<<<<<< HEAD
	// amit
=======
>>>>>>> branch 'master' of https://github.com/LolaTechServer/git-test.git
	
	
	// WE are so stupid
	
	
	///11111111112222222222
	
	///3333333333444444444
		
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
