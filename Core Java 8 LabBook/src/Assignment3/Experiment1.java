package Assignment3;

public class Experiment1 {
	static int secondSmallest(int[]arr) {
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr[1];
	}
	public static void main(String[] args) {
		int arr[]= {3,7,2,5,9,11,13,6,23};
		System.out.println("Second smallest element is "+Experiment1.secondSmallest(arr));
	}

}
