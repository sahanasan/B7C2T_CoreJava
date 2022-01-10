package Day28;

public class Variable1Demo {
//class variable
	final static int a=1024;
		int b;

		void func1() {
			int c;
			c = 10;
			System.out.println("class variabe" + a + " " + b);
			System.out.println("local variable" + c);
			//a = 7890;
			b = 56;
			System.out.println("class variable" + a + " " + b);
		}

		void func2() {
			System.out.println("class Variable" + a + " " + b);
		}

		public static void main(String args[]) {
			Variable1Demo obj = new Variable1Demo();
			System.out.println(obj.b);
			System.out.println(Variable1Demo.a);
		}
	}
		



	


