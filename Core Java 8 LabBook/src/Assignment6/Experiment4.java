package Assignment6;

import java.util.Scanner;

public class Experiment4 {

	static String alterString(String str) {
		
		StringBuffer str1=new StringBuffer();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='A'||str.charAt(i)=='e'||str.charAt(i)=='E'||str.charAt(i)=='i'||str.charAt(i)=='I'||
					str.charAt(i)=='o'||str.charAt(i)=='O'||str.charAt(i)=='u'||str.charAt(i)=='U') {
				str1.append(str.charAt(i));
			}
			else
			{
				str1.append((char)(str.charAt(i)+1));
			}
		}
		return str1.toString();
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.nextLine();
		String s=Experiment4.alterString(str);
		System.out.println("Output: "+s);
	}
}
