package pack;

public class Employee {
	private int id;
	private String name;
	private String email;
	private String address;
	private int age;
	private String phone;
	private String workPhone  ;
	//hi noa
	
	
	
	/// what the fuck???
	
	


	public Employee(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	
	
	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Worker1 [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + "]";
	}
	
	public static void main(String[] args) {
		System.out.println("koral");
	}

	
}