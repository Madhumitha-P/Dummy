package pack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Sample6{
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,6,7,7,9};
		List<Integer> b = new LinkedList<Integer>() ;
		List<Integer> c = new ArrayList<Integer>() ;

		int count=0;
		for(int i= 0; i<a.length-1;i+=3){
			for(int j =0; j<3;j++ ){
				b.add(a[count]);
				count++;
			}
			ListIterator<Integer> list = b.listIterator(b.size());
			while(list.hasPrevious()){
				c.add(list.previous());
			}
			b.clear();	
		}
		System.out.println(c);
	}
}