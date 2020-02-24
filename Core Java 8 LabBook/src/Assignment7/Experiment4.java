package Assignment7;
import java.util.*;
public class Experiment4 {

	static Map<Integer,String> getStudents(Map<Integer,Integer> map){
		
		Map<Integer,String> resultMap=new HashMap<Integer, String>();
		Set<Integer> set= map.keySet();
		for(Integer i:set) {
			if(map.get(i)>=90)
				resultMap.put(i,"Gold");
			else if(map.get(i)>=80 && map.get(i)<90)
				resultMap.put(i,"Silver");
			else if(map.get(i)>=70 && map.get(i)<80)
				resultMap.put(i,"Bronze");
			else
				continue;}
		return resultMap;
		}
	public static void main(String[] args) {
		
		System.out.println("Student marks recorded: ");
		Map<Integer, Integer> map=new TreeMap<Integer, Integer>();
		map.put(1001,67);
		map.put(1002,78);
		map.put(1003,59);
		map.put(1004,89);
		map.put(1005,80);
		map.put(1006,53);
		map.put(1007,83);
		map.put(1008,70);
		map.put(1009,90);
		map.put(1010,82);
		
		Set<Integer> keys=map.keySet()
;
		for(Integer i:keys) {
			System.out.println(i+" - "+map.get(i));
		}
		
		System.out.println("\nEligible student list with medals:");
		Map<Integer, String> resultMap=new TreeMap<Integer, String>();
		
		resultMap=Experiment4.getStudents(map);
		
		Set<Integer> keys2=resultMap.keySet();
		
		for(Integer i:keys2) {
			System.out.println(i+" - "+resultMap.get(i));
		}
		
		System.out.println();
	}
	
}
