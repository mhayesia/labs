package labs;

import java.io.*; // To use file io
import java.util.*; // To use scanner && handle exceptions 


public class Project2 {
	
	public static void main(String[] args)  throws IOException 
	{
		
		FileInputStream in = null; // Creating a FileInputStream object with a initial value of null
		Scanner file; // create a new Scanner object to hold our input from FileInputStream
		Scanner lineInFile;
		
		String fileName = new String("input/studentGrades.txt"); // The name of the file as a string.
		String FILE_ERROR_MSG = "File failed to open error: ";
		
		String firstName;
		String lastName;
		String letterGrade = "";
		int numStudents = 0;
		int[] scores = new int[4];
		int sum = 0;
		double avarage;
		
		int count = 0;
		
		boolean fileNotOpen = true; // the loop control varialble
		
		
		while (fileNotOpen) 
		{
			
			try 
			{
				in = new FileInputStream(fileName);
				fileNotOpen = false;
				System.out.println("file is open \n");
			}
			catch(FileNotFoundException e)
			{
				System.out.println(FILE_ERROR_MSG + e.getMessage());
				System.exit(1);
			}
				
			
		}
		
		file = new Scanner(in);
		
		while (file.hasNextLine()) {
			numStudents ++;
			
			lineInFile = new Scanner(file.nextLine());
			
			firstName = lineInFile.next();
			System.out.println(firstName);
			lastName = lineInFile.next();
			System.out.println(lastName);
			
			int a = 0;
			while (lineInFile.hasNextInt()) {
				
				scores[a] = lineInFile.nextInt();
				System.out.println(scores[a]);
				a++;
				
			}
			
			int [][] classScores = new int [numStudents][4];
		
			
			
			
			
			sum = 0;
			
			for (int x = 0; x < scores.length; x++) {
				sum += scores[x];
			}
			
			
			
		
		
			System.out.println("sum = : "+ sum);
			
			
			avarage = (double)sum / (double)scores.length;
			
			if ( avarage >= 91.0) 
			{
				letterGrade = "A";
			}
			else if ( avarage >= 90.0) 
			{
				letterGrade = "A-";
			}
			else if ( avarage >= 89.0) 
			{
				letterGrade = "B+";
			}
			else if ( avarage >= 81.0) 
			{
				letterGrade = "B";
			}
			else if ( avarage >= 80.0) 
			{
				letterGrade = "B-";
			}
			else if ( avarage >= 79.0) 
			{
				letterGrade = "C+";
			}
			else if ( avarage >= 71.0) 
			{
				letterGrade = "C";
			}
			else if ( avarage >= 70.0) 
			{
				letterGrade = "C-";
			}
			else if ( avarage >= 69.0) 
			{
				letterGrade = "D+";
			}
			else if ( avarage >= 61.0) 
			{
				letterGrade = "D";
			}
			else if ( avarage >= 60.0) 
			{
				letterGrade = "D-";
			}
			else {
				letterGrade = "F";
			}
				
		
			System.out.println("avrage = : "+ avarage + " : " + letterGrade );
			
			
			
			
			count++;
			System.out.print(count);
			
			
			
			//System.out.println(fileInput.nextLine());
		}
		
		in.close();
		file.close();
		System.out.println("File is now closed \n");
		
		
		
	}// End main

}// End Class
