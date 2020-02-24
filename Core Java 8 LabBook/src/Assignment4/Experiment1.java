package Assignment4;

public class Experiment1 {
	
	static int cube(int n) {
		return n*n*n;
	}
   static int calculate(int n) {
	int a,sum=0;
	   while(n>0) {
		   a=n%10;
		   sum=sum+Experiment1.cube(a);
		   n=n/10;
	   }
	   return sum;
   }
   public static void main(String[] args) {
	
	   int n=2789;
	   System.out.println("Sum of the cubes of the digits of the number "+n+" is "+Experiment1.calculate(n));
}
}
