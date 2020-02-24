package Assignment7;
import java.util.*;
public class Experiment2 {

	static Map<Character,Integer>countCharacter(char[] a) {
		
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		
		for(int i=0;i<a.length;i++) {
			if(map.containsKey(a[i]))
				map.put(a[i],map.get(a[i])+1);
			else
				map.put(a[i],1);
		}
		
		return map;
	}
	public static void main(String[] args) {
		char[]a= {'A','P','P','L','E'};
		
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		map=Experiment2.countCharacter(a);
		Set <Character> key=map.keySet();
		for(Character i:key) {
			System.out.println(i+"--"+map.get(i));
		}
	}
}
