package pack;

public class Sample4 {
		public static boolean checkPalindrome(int number){
		int reverse = 0;
		int digit = 0;
		int temp=number;
		while(number!=0){
			digit = number % 10;
			reverse = reverse * 10 +digit;
			number = number/10;
		}
		if(reverse!=temp){
			return false;
		}else
			return true;
	}
	public static void main(String[] args) {
		int number = 115;
		int i =0;
		int j =0;
		int inc =0;
		int dec = 0;
		int count =5;
		boolean firstRes = checkPalindrome(number);
		if(firstRes!=true){
			for(j=1;j<=10;j++){
				inc = number+j;
				boolean incRes = checkPalindrome(inc);
				dec = number-j;
				boolean decRes = checkPalindrome(dec);

				if(incRes==true){
					System.out.println(inc);
					break;
				}
				if(decRes==true){
					System.out.println(dec);
					break;
				}
			}
		}
	}
			
}


