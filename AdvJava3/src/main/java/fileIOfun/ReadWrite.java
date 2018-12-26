package fileIOfun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite {

	public static void main(String[] args) {
		
//		read();
		write();
	}
	
	public static void write() {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("../AdvJava3/src/main/resources/testio.txt"));
			writer.write("I am being written in from Java");
			writer.close(); 
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void read() {
		try {
			//BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Benjamin\\Desktop\\testio.txt"));
			BufferedReader reader = new BufferedReader(new FileReader("../AdvJava3/src/main/resources/testio.txt"));
			
			while(true) {
				
				String s = reader.readLine();
				
				if(s == null) {
					break;
				}
				
				System.out.println(s);
			}
			reader.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
