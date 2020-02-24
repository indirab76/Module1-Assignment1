package Assignment6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Experiment1 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string of integers with whitespacing: ");
	String a=sc.nextLine();
	
	StringTokenizer st1=new StringTokenizer(a," ");
	int n,sum=0;
	String number;
	System.out.println("The numbers printed are: ");
	while(st1.hasMoreTokens()) {
		number=st1.nextToken();
		System.out.println(number);
		n=Integer.parseInt(number);
		sum=sum+n;
	}
	
	System.out.println("The sum of all integers entered is "+sum);
	
}
}
