package Assignment6;

import java.io.FileInputStream;
import java.io.IOException;

public class Experiment6 {
	
public static void main(String[] args) throws IOException {
	
	FileInputStream in=new FileInputStream("D:\\corejava\\Assignment6.Experiment2.txt");
	
	int i;
	char c;
	int word=0,line=0,character=0;
	while((i=in.read())!=-1) {
		c=(char)i;
		//System.out.println(c);
		if(c=='\n')
			line++;
		else if(c==' ')
			word++;
		else 
			character++;
	}
	System.out.println("Number of Lines: "+line);
	System.out.println("Number of Words: "+word );
	System.out.println("Number of characters: "+character);
	
	in.close();
}
}
