package Day06;

public class Employee {
	int id;
	String name;
	String email;
	String Salary;

	public Employee() {
	}

	public Employee(int id, String name, String email, String Salary) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.Salary = Salary;
	}

	public String toString() {
		String Str = "(" + id + "," + name + "," + email + "," + Salary + ")";
		return Str;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.id = 101;
		e1.name = "sahana";
		e1.email = "@sahna123";
		e1.Salary = "31.42f";
		System.out.println(e1.toString());
		Employee e2 = new Employee(102, "priya", "@priya123", "47,63");
		System.out.println(e2.toString());
	}
}	


