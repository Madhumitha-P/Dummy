package pack;

public class Sample2 {
	
	public static void main(String[] args) {
		int number = 1234;
		int digit = 0;
		int reverse = 0;
		while(number != 0){
			digit = number%10;
			reverse = reverse *10+digit;
			number = number/10;
		}
		System.out.println(reverse);
	}
}
