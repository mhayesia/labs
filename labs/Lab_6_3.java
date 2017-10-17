package labs;
import java.io.*;
import java.util.*;

public class Lab_6_3 {

	public static void main (String[] args) throws IOException{
		
		
		
		FileInputStream in = null; // Create a new instance of a FileInputStream Object and give null arguments.
		Scanner inFile;
		String input;
		
		boolean fileNotOpen = true;
		
		while (fileNotOpen) 
		{
			
			try 
			{
				in = new FileInputStream("Lab_6_2.txt");	// This statement will throw an error triggering the catch block if it fails.
				fileNotOpen = false; 						// This statement will not execute if the above statement fails.
															// The program will go straight to the catch portion.
			
			}
			
			
			// This catch statement catches FileNotFoundException thrown automaticly from 
			catch(FileNotFoundException e)
			{
				System.out.println("Could not open file: Program Exiting");
				System.exit(1);
			}
			
		}// End while
		
		
		
		int fahrenheit = 0;
		double celsius;
		int velocity;
		double windChill;
		
		
		
		System.out.println("File Open \n");
		
		System.out.printf(" %-12s %-12s %-12s %-12s \n" , "Degrees F","Degrees C", "Wind Speed", "Wind Chill");
		
		inFile = new Scanner(in);
										// While the inFile has a line to read, read the next line
		while (inFile.hasNextLine()) {
			
			
			input = inFile.nextLine(); // input = the contents of infile.nextLine(in);
			
			Scanner fromInput = new Scanner(input); // Create a new Scanner object and give it the line we just extracted.
			
			while(fromInput.hasNextInt()) {
				
				fahrenheit = fromInput.nextInt();
				velocity = fromInput.nextInt();
				
				
				celsius = (5.0/9.0)*(fahrenheit - 32 );
				windChill = (35.74 + 0.6215 * fahrenheit) - (35.75 * Math.pow(velocity, 0.16)) + (0.4275 * fahrenheit * Math.pow(velocity, 0.16) );
				System.out.printf(" %9.0f %12.1f %13.1f %12.1f \n", (double)fahrenheit, (double)celsius, (double)velocity, (double)windChill);
				
			}
			fromInput.close();
			
			
		}
		inFile.close();
		
		
		System.out.println("\n File Closed \n");
		
		
	}// End main
	
}// End Class