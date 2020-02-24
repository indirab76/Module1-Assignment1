package Assignment1;

import java.util.*;
public class Experiment1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n,sum=0,i;
	System.out.println("Enter n: ");
	n=sc.nextInt();
	
    for(i=1;i<n;i++) {
    	if(i%3==0 || i%5==0) {
    		sum=sum+i;
    	}
    }
    System.out.println("Sum of "+n+" natural numbers that are divisible by 3 and 5 is "+sum);
    sc.close();
}
}
