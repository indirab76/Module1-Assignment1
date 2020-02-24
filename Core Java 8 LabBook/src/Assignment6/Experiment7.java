package Assignment6;

import java.io.File;
import java.util.Scanner;

public class Experiment7 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a file name: ");
	String s=sc.nextLine();
	File file=new File(s);
	System.out.println("Does the file exist? "+file.exists());
	System.out.println("Is the file readable? "+file.canRead());
	System.out.println("Is the file writable? "+file.canWrite());
	//System.out.println("What is the type file? "+File.probeContentTye());
	System.out.println("What is the length of file in bytes? "+file.length());
	
}
}
