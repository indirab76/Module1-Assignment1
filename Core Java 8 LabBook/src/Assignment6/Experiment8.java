package Assignment6;

import java.util.Scanner;

public class Experiment8 {
	static boolean getPositiveString(String str) {
		
		for(int i=1;i<str.length();i++) {
			
			if((str.charAt(i-1))>(str.charAt(i))) {
				return false;
				
			}
			
		}
		return true;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String: ");
	String str=sc.nextLine();
	
	boolean t=Experiment8.getPositiveString(str);
	if(t==true)
		System.out.println("It is a positive string");
	else
		System.out.println("It is not a positive string.");
}
}
