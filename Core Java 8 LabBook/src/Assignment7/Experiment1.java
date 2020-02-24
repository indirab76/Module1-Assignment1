package Assignment7;

import java.util.*;


public class Experiment1 {

	static List<Integer>getSorted(Map<Integer,Integer> hashmap){
		
		Set<Integer> set=hashmap.keySet();
		List<Integer> list=new ArrayList<Integer>();
		for(Integer i:set) {
			list.add(hashmap.get(i));
		}
		Collections.sort(list);
		System.out.println("Test");
		return list;
	}
	public static void main(String[] args) {
		
		System.out.println("Enter 5 integers: ");
		
		Scanner sc=new Scanner(System.in);
		Map<Integer,Integer> hashmap=new HashMap<Integer, Integer>();
		for(int i=0;i<5;i++) {
			hashmap.put(i,sc.nextInt());
		}
		List<Integer> list=Experiment1.getSorted(hashmap);
		
		System.out.println("After sorting: ");
		for(int i:list) {
			System.out.print(i+" ");
		}
	}
}
