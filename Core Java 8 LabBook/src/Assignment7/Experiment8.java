package Assignment7;
import java.util.*;
public class Experiment8 {

	static int[] modifyArray(int[]arr) {
		Set<Integer> set=new HashSet<Integer>();
		
		for(int i:arr) {
			set.add(i);
		}
		//System.out.println(set);
		List<Integer> list=new ArrayList<Integer>(set);
		
		 Collections.sort(list, Collections.reverseOrder());    //sorting in reversed order
		 
		int arr1[]=new int[list.size()];
		
		//System.out.println(list);
		for(int i=0;i<list.size();i++) {
			arr1[i]=list.get(i);
		}
		
		return arr1;
	}
	public static void main(String[] args) {
		
		int[]arr= {34,56,34,28,16,95,46,71,46,16};
		int[]arr1=Experiment8.modifyArray(arr);
		System.out.println("The modified array is: ");
		for(int i:arr1) {
			System.out.print(i+" ");
		}
	}
}
