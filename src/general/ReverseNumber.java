package general;

public class ReverseNumber {

	public static void main(String[] args) {
		int number =12345789, reverse = 3;
		for(int n=0;n<8;n++){
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		System.out.println("the reverse of the given number is:" + reverse);

	}

}


