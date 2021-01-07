package pack;

public class Sample8 {

	public static void main(String[] args) {
		int a = 5000;
		int b = 2000;
		int c;
//		c=a;
//		a=b;
//		b=c;
//		System.out.println(a);
//		System.out.println(b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
		int num=54346346;
		int digit;
		int reverse=0;
		while(num!=0){
			digit=num%10;
			reverse = reverse*10+digit;
			num = num/10;
		}
		System.out.println(reverse);
	}

}
