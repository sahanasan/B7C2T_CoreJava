package Day_11_ExceptionHandling;

public class ExceptionHandlingDemo1 {

	public static void main(String[] args) {
		int[] arr=new int[4];
		try
		{			
			arr[3]=35;
			System.out.println("In try block");
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Exception in try block");
		}
		finally
		{
			System.out.println("In finally block");
		}
		System.out.println("In the class");
	}
}
