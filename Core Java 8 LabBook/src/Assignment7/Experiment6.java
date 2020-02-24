package Assignment7;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
public class Experiment6 {

	static List<Integer> votersList(Map<Integer,LocalDate> map){
		
		List<Integer> list=new ArrayList<Integer>();
		
		LocalDate localDate=null;
		LocalDate date=LocalDate.now();
		
		Set<Integer> set=map.keySet();
		
		for(Integer i:set) {
			
			
			localDate=map.get(i);
			int age=Period.between(localDate, date).getYears();
			
			
			if(age>=18)
				list.add(i);
		}
		return list;
	}
	public static void main(String[] args) {
		
		Map<Integer,LocalDate> map=new HashMap<Integer,LocalDate>();
		
		map.put(1001,LocalDate.of(2016, 10, 19));
		map.put(1002,LocalDate.of(1998, 5, 19));
		map.put(1003,LocalDate.of(2008, 7, 6));
		map.put(1004,LocalDate.of(1998, 12, 19));
		map.put(1005,LocalDate.of(2004, 3, 13));
		map.put(1006,LocalDate.of(2000, 6, 19));
		map.put(1007,LocalDate.of(1997, 8, 23));
		map.put(1008,LocalDate.of(1999, 5, 19));
		
		List <Integer> list=new ArrayList<Integer>();
		list=Experiment6.votersList(map);
		
		for(Integer i:list) {
			System.out.println(i+" ");
		}
		
	}
}
