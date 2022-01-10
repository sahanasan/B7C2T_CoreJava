package Day5;

public class Student {
	int age;
	String name;
	String branch;
	String USN;
	public Student()
	{
	}
	public Student(int age,String name,String branch,String USN) {
		this.age=age;
		this.name=name;
		this.branch=branch;
		this.USN=USN;
	}
	public void Student2(int age,String name,String branch,String USN) {
		this.age=age;
		this.name=name;
		this.branch=branch;
		this.USN=USN;
	}
	public String toString() {
		String Str="("+ age +" ," + name+ "," + branch +" ,"+USN+")";
		return Str;
	}
		
	public static void main(String[] args) {
		Student S1=new Student();
		S1.age=22;
		S1.name="priya";
		S1.branch="computer science";
		S1.USN="15CS56";
		System.out.println(S1.toString());
		Student S2=new Student(21,"sahana","18CS407","information science");
		System.out.println(S2.toString());
		Student S3=new Student(23,"suresh","19EC407","electric communication");
		System.out.println(S3.toString());
	}
		

	}


