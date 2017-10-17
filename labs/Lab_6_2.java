package labs;

import java.io.*;
import java.util.*;

public class Lab_6_2 {
	
	public static void main (String[] args) {
		
		boolean fileNotOpen = true;
		
		PrintWriter outFile;
		FileOutputStream  out = null;
		
		
		while (fileNotOpen) {
			
			try 
			{
				
				out = new FileOutputStream("Lab_6_2.txt");
				fileNotOpen = false;
				
			}
			catch(FileNotFoundException e)
			{
				
				System.out.println("Could not open file: Program Exiting");
				System.exit(1);
			}
			
		}// End while
		
		Random rand = new Random();
		
		outFile = new PrintWriter(out);
		
		for (int i = 0; i < 50; i++) {
			
			int temp = rand.nextInt(49 - (-30) ) + -30;
			int windSpeed = rand.nextInt(50 - 1 ) + 1;
			outFile.printf("%-1d %-1d %n", temp,windSpeed);
			System.out.printf("%-1d %-1d %n", temp,windSpeed);
			
		}
		
		outFile.close();
		
		
	} // End main	

}// End Class