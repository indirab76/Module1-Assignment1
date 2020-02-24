package Assignment7;

import java.util.Collections;
import java.util.*;

public class Experiment7 {

	static int[] getSorted(int[]arr) {
		List<Integer> list=new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			StringBuffer string=new StringBuffer(arr[i]+"");
			string.reverse();
			String string2=string.toString();
			list.add(Integer.parseInt(string2));
		}
		Collections.sort(list);
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=list.get(i);
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		int []arr= {234,678,257,346,84,678};
		arr=Experiment7.getSorted(arr);
		System.out.println("Sorted array afeter reverse: ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
