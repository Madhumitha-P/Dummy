package pack;

import java.util.ArrayList;
import java.util.List;

public class Sample5 {
	static List<String> lastList= new ArrayList<String>();
	public static void main(String[] args) {
		String text = "This is sample text";
		String final_text = "";
		String[] strList =text.split(" ");
		for (String string : strList) {
			StringBuffer text1 = new StringBuffer(string);
			lastList.add(text1.reverse().toString());
		}
		System.out.println(lastList);
		for (String lastString : lastList) {
			System.out.println(lastString);
			final_text += lastString + " ";
			
		}
		System.out.println(final_text);
	}

}
