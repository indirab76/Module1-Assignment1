package Assignment1;
import java.util.*;
import java.lang.*;
public class Experiment2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n,sum,i,sum2=0,diff;
	System.out.println("Enter n:");
	n=sc.nextInt();
	sum=0;
	for(i=1;i<=n;i++) {
		sum=sum+i;
	}
	for(i=1;i<=n;i++) {
		sum2=sum2+(i*i);
	}
	diff=Math.abs((sum*sum)-sum2);
	System.out.println("Difference of sum of square and suare of sum for "+n+" natural numbers is "+diff);
sc.close();
}
}
