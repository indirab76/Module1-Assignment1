package Assignment7;

import java.util.*;

public class Experiment5 {

	static int getSecondSmallest(int[] arr) {
		
		List<Integer> list=new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}
		Collections.sort(list);
		
		return list.get(1);	
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter 5 Integers:");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		int result=Experiment5.getSecondSmallest(arr);
		
		System.out.println("The second smallest element is "+result);
	}
}
