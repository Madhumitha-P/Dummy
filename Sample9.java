package pack;

import java.util.Scanner;

public class Sample9 {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int count = scan.nextInt();
//		for(int i=0;i<count;i++){
//			for(int j=0;j<=i;j++){
//				System.out.print("*"+"\t");
//			}
//			System.out.println("\n");
//		}
		int count=1;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(count+"\t");
				count++;
			}
			System.out.println("\n");
		}
	}

}
