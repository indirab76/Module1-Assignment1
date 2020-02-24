package Assignment3;

import java.util.Arrays;

public class Experiment3 {

	static int getReverse(int a) {
		int reverse=0,n;
		while(a>0) {
			n=a%10;
			reverse=reverse*10+n;
			a=a/10;
		}
		return reverse;
	}
	static int[] getSorted(int[] arr) {
		int temp=0;
		for(int k=0;k<arr.length;k++) {
			arr[k]=Experiment3.getReverse(arr[k]);
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;	
	}
	public static void main(String[] args) {
		
		int[] array= {234,567,834,672,852,789};
		
		Experiment3.getSorted(array);
		for(int i:array){
			System.out.println(i+"  ");
		}
		
	}
}
