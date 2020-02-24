package Assignment5;

import java.util.Scanner;

public class Experiment5 {

	static void getValidatedAge(int age) throws Exception {
		if(age<15)
			throw new Exception("\nSorry you are not elligible for the ride.");
		else
			System.out.println("\nCongo! You are elligible for the ride.");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your age:");
		int age=sc.nextInt();
		try {
			Experiment5.getValidatedAge(age);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
