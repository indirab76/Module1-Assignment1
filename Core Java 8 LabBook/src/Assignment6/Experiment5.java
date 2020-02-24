package Assignment6;
import java.lang.*;
import java.util.Scanner;

public class Experiment5 {

	static int modifyNumber(Integer number1) {
		String number=number1.toString();
		StringBuffer result=new StringBuffer();
		Integer n1,n2,diff;
		int i;
		for( i=0;i<number.length()-1;i++) {
			n1=(int)number.charAt(i);
			n2=(int)number.charAt(i+1);
			diff=Math.abs(n1-n2);
			result.append(diff.toString());
		}
		result.append(number.charAt(i));
		return (Integer.parseInt(result.toString()));
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		Integer number=sc.nextInt();
		int result=Experiment5.modifyNumber(number);
		System.out.println("Number after modification: "+result);
		
	}
}
