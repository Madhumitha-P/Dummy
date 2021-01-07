package pack;

public class Sample11 {

	public static void main(String[] args) {
		String text = "I Love Good";
		char a = 'o';
		text = text.toUpperCase();
		int len = text.length();
		System.out.println(len);
		text = text.replace(String.valueOf(a).toUpperCase(), "");
		int revLen= text.length();
		System.out.println(revLen);
		int diff = len-revLen;
		System.out.println(diff);
//		String[] textArray = text.split(" ");
//		String finalText="";
//		for(int i =textArray.length-1;i>=0 ;i--){
//			finalText = finalText.concat(textArray[i]);
//			finalText = finalText.concat(" ");
//		}
//		System.out.println(finalText);
	}

}
