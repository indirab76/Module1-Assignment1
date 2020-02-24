package Assignment6;

import java.util.Scanner;

public class Experiment9 {
	
	static boolean validateUsername(String name) {
		
		if(name.length()>=12 && name.matches(".*_job"))
			return true;
		else
			return false;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Username: ");
	String name=sc.nextLine();
	boolean b=Experiment9.validateUsername(name);
	if(b)
		System.out.println("You are a valid user.");
	else
		System.out.println("Sorry, you are not a valid user.");
}
}
