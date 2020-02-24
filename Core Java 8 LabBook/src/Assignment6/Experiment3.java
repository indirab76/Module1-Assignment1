package Assignment6;

import java.util.Scanner;

public class Experiment3 {
	
static String getImage(String str) {
	
	StringBuffer str1=new StringBuffer();
	str1.append(str);
	StringBuffer str2=new StringBuffer();
	str2.append(str1);
	str2.reverse();
	
	str1.append("|");
	
	str1.append(str2);
	
	String s=str1.toString();
	
	return s;
	
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter a string: ");
	String str=sc.nextLine();
	
	String s=Experiment3.getImage(str);
	System.out.println("Modified String is: ");
	System.out.println(s);
	
}
}
