package Assignment3;

import java.util.*;

public class Experiment2 {
    static int length;
	static String[] getAlphabeticSort(String[] list) {
		//String[] list1=new String[list.length];
		
		for(int i=0;i<list.length;i++) {
			list[i]=list[i].toUpperCase();
		}
		
		Arrays.sort(list);
		int n=list.length;
		if(n%2==0)
			length=(n/2);
		else
			length=((n/2)+1);
		
		for(int i=length;i<n;i++) {
			list[i]=list[i].toLowerCase();
		}
		
		return list;
	}
	public static void main(String[] args) {
		
		String list[]= {"Indira","Annie","IamatTopofMyWorld","ear"};
		String list2[]=Experiment2.getAlphabeticSort(list);
		
		for(String s:list2) {
			System.out.print(s+"  ");
		}
	}
	
}
