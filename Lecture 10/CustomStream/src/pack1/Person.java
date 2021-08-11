package pack1;

public class Person {
	private int pid;

	private int age;

	private String email;
	private String gender;

	private String city;

	public Person(int pid, int age, String email, String gender, String city) {
		super();
		this.pid = pid;
		this.age = age;
		this.email = email;
		this.gender = gender;
		this.city = city;
		
	}

	public int getPid() {
		return pid;
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	public String getGender() {
		return gender;
	}

	public String getCity() {
		return city;
	}
	

}
