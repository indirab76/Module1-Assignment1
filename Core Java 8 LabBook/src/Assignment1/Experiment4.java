package Assignment1;

import java.util.Scanner;

public class Experiment4 {
	
	static boolean getPowerOf2(int n) {
		
		if (n == 0)  
	        return false;  
	    while (n != 1)  
	    {  
	        if (n%2 != 0)  
	            return false;  
	        n = n/2;  
	    }  
	    return true;  
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number: ");
	int n=sc.nextInt();
	boolean a=Experiment4.getPowerOf2(n);
	if(a==true)
	System.out.println("The number is power of 2.");
	else
    System.out.println("The number is not a power of 2.");
}
}
