package Assignment1;
import java.util.*;
public class Experiment3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n,x1,x2,count=0;
	System.out.println("Enter a number:");
	n=sc.nextInt();
	x1=n%10;
	n=n/10;
	count=0;
	while(n>0) {
		x2=n%10;
		if(x1<x2)
			count++;
		n=n/10;
		x1=x2;
	}
	
	if(count==0)
		System.out.println("Yes, the number is an inceasing number.");
	else
		System.out.println("No, the number is not an increasing number.");
	sc.close();
}

}
