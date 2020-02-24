package Assignment3;

public class Experiment4 {

	static void getCharFrequency(char[]arr) {
		Integer frequency[]=new Integer[26];
		int i=0;
		for(i=0;i<26;i++) {
			frequency[i]=0;
		}
		
		for(i=0;i<arr.length;i++) {
			frequency[arr[i]-'a']++;
		}
		
		for(i=0;i<arr.length;i++) {
			if(frequency[arr[i]-'a']!=0) {
				
			
				System.out.println(arr[i]+" : "+frequency[arr[i]-'a']);
				frequency[arr[i]-'a']=0;
				}
		}
	}
	public static void main(String[] args) {
		
		char array[]= {'a','f','t','e','r','a','v','e','r','y','l','o','n','g','t','i','m','e'};
		Experiment4.getCharFrequency(array);
	}
}
