package Day5;

class Emp1 {
	String name = "suresh";
	int age = 29;
	String sex = "M";
}

class Emp2 {
	String name = "priya";
	int age = 25;
	String sex = "F";
}

class Emp3 {
	String name = "nithin";
	int age = 24;
	String sex = "M";
}

class Emp4 {
	String name = "veena";
	int age = 26;
	String sex = "F";
}

class Emp5 {
	String name = "anil";
	int age = 27;
	String sex = "M";
}

public class EmployeDemo {
	public static void main(String args[]) {
		Emp1 E1 = new Emp1();
		System.out.println("the name of E1 is:" + E1.name + ",age is:" + E1.age + " and the sex is:" + E1.sex);
		Emp2 E2 = new Emp2();
		System.out.println("the name of E2 is:" + E2.name + ",age is:" + E2.age + " and the sex is:" + E2.sex);
		Emp3 E3 = new Emp3();
		System.out.println("the name of E3 is:" + E3.name + ",age is:" + E3.age + " and the sex is:" + E3.sex);
		Emp4 E4 = new Emp4();
		System.out.println("the name of E4 is:" + E4.name + ",age is:" + E4.age + " and the sex is:" + E4.sex);
		Emp5 E5 = new Emp5();
		System.out.println("the name of E5 is:" + E5.name + ",age is:" + E5.age + " and the sex is:" + E5.sex);
	}
}
