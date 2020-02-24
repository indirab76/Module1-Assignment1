package Assignment6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Experiment2 {
public static void main(String[] args) throws IOException {
	
	FileInputStream in=new FileInputStream("D:\\corejava\\Assignment6.Experiment2.txt");
	int i=0,count=2;
	char c;
	System.out.print("1 ");
	while((i=in.read())!=-1) {
		c=(char)i;
		
		
		if(c=='\n') {
			System.out.print(count+" ");
			count++;
		}
		else
		   System.out.print(c);
			
	}
	in.close();

}
}
