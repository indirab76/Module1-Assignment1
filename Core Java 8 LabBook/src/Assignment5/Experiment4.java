package Assignment5;

import java.util.Scanner;

public class Experiment4 {

	static void getValidatedName(String f_name,String l_name) throws Exception {
		if(f_name.isEmpty())
			throw new Exception("First name field is empty. Please enter first name.");
		else if(l_name.isEmpty())
			throw new Exception("Last name field is empty. Please enter last name.");
		else
			System.out.println("Congratulations!! Your name has been validated.");
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your first name and last name for validation: ");
		System.out.print("First Name: ");
		String firstName=sc.nextLine();
		System.out.print("Last Name: ");
		String lastName=sc.nextLine();
		
		try {
			Experiment4.getValidatedName(firstName, lastName);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		
	}
}
