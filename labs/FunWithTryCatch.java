package labs;
import java.util.*;
import java.io.*;

public class FunWithTryCatch {
	
	public static void main(String[] args)
	{
		
		boolean goodData = true;
		
		while (goodData)
		
			try
			{
				System.out.println("enter int \n");
				Scanner kb = new Scanner(System.in);
				int i = kb.nextInt();
				
				
				try {
					if (i<=7 && i>=1) {
						if (i == 1) System.out.println("sunday");
						if (i == 2) System.out.println("monday");
						if (i == 3) System.out.println("tuesday");
						if (i == 4) System.out.println("wednesday");
						if (i == 5) System.out.println("thursday");
						if (i == 6) System.out.println("friday");
						
						else if
							(i == 7) System.out.println("saterday");
						goodData = false;
						
					}
					else
					throw new ArithmeticException("bad range");
				}
				
				catch(ArithmeticException e) {
					System.out.println(e.getMessage());
				}
				
				
				
			}
			catch(InputMismatchException e)
			{
				System.out.println("Bad input: " + e.getMessage());
			}
	}
}
