package pack;

public class Sample10 {

	public static void main(String[] args) {
		int[] arra ={54,32424,4252,6};
		int temp = arra[0];
		for(int i=0;i<arra.length;i++){
			if(temp>arra[i]){
				temp=arra[i];
			}
		}
		System.out.println(temp);
	}

}
