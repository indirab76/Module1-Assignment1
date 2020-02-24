package Assignment7;
import java.util.*;
public class Experiment3 {

	static Map<Integer,Integer> getSquares(List<Integer> list){
		
		Map<Integer,Integer> map=new HashMap<Integer, Integer>();
		
		for(Integer i:list) {
			map.put(i, i*i);
		}
		return map;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 integers:");
		
		List<Integer> list=new ArrayList<Integer>();
		
		for(int i=0;i<5;i++) {
			list.add(sc.nextInt());
		}
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		map=Experiment3.getSquares(list);
		
		Set<Integer> keys=map.keySet();
		
		for(Integer i:keys) {
			System.out.println(i+"--"+map.get(i));
		}
	}
}
