package Assignment8;
import java.io.*;
public class Experiment1 extends Thread{
    FileReader reader;
	FileWriter writer;
	
	@Override
	public void run() {
		try {
			reader=new FileReader("Source.txt");
			writer=new FileWriter("target.txt");
		}catch(IOException e1) {
			e1.printStackTrace();
		}
		int x=0;
		int c=1;
		while(x!=-1) {
			try {
				x=reader.read();
				writer.write(x);
				c++;
			}catch(IOException e) {
				e.printStackTrace();
			}
			if(c%10==0) {
				try {
					System.out.println("10 characters are copied");
					Thread.sleep(5000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		try {
			reader.close();
			writer.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Experiment1().start();
	}
}
