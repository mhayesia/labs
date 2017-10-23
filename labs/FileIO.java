package labs;

import java.io.*;
import java.util.*;

public class FileIO {
	
	public static void main(String[] args){
		
		String  h = new String("hello world 123 456 slow down");
		Scanner scan = new Scanner(h);
		
		int test = h.length();
		String[] testing = h.split(" ");
		
		
		int x=0;
		while( x < testing.length) {
			
			System.out.println(testing[x] + "\n");
		
			
			x++;
			
		
		
		
			
		}
		
		String s1 = "AB";
		String s2 = "AA";
		int result1 = s1.compareTo(s2);
		System.out.println(result1);
		
	}

}
