package pack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sample3 {

	public static void main(String[] args) {
		int i =0;
		List<Integer> list = new ArrayList<Integer>();
		int[] a = {1,2,3,4,5};
		for(i=0;i<a.length-1;i++){
			list.add(a[i]*a[i+1]);
		}
		Integer test = Collections.max(list);
		
		System.out.println(test);
	}

}
