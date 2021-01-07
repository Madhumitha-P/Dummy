package pack;

public class Sample1 {
	public static void main(String[] args) {
		String finalVal = "";
		int count = 1;
		String input = "aabbccdef";
		char[] inputList = input.toCharArray();
		String LastVal = null;
		for(int i=0; i<inputList.length-1;i++){
			if(inputList[i] ==inputList[i+1]){
				count += 1;
			}
			else{
				finalVal = finalVal + inputList[i] + String.valueOf(count);
				count = 1;
			}
			LastVal = inputList[i+1] + String.valueOf(count);
		}
		System.out.println(finalVal+LastVal);
	}
}
