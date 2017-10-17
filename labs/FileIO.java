package labs;

import java.io.*;
import java.util.*;

public class FileIO {
	
	public static void main(String[] args){
		
		String  h = new String("hello world");
		Scanner scan = new Scanner(h);
		
		int test = h.length();
		
		String[] testing = h.split(" ");
		
		System.out.println(test);
		
		System.out.println (testing[1]);
		
		int arrayLength = testing.length;
		
		int x=0;
		while( x < testing.length) {
			System.out.println(testing[x]);
			System.out.println(arrayLength);
			
			x++;
			
			
		}
		
	}

}
