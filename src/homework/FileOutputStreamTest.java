package homework;
import java.io.*;

public class FileOutputStreamTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream out = new FileOutputStream("myFile.txt");
			out.write('H');			
			out.write(69);			
			out.write(76);			
			out.write('L');			
			out.write('O');
			out.write('!');
			out.close();
		}catch (FileNotFoundException e) {
			System.out.println("Error: Cannot open file for writing.");
		}catch (IOException e) {
			System.out.println("Error: Cannot write to file.");
			
		}
		System.out.println();

	}

}
