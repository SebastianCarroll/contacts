package com.seb.networks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CLI {
	
	public static String readInput(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
	      String input = null;
	 
	      //  read the username from the command-line; need to use try/catch with the
	      //  readLine() method
	      try {
	    	  input = br.readLine();
	      } catch (IOException ioe) {
	         System.out.println("IO error trying to read input");
	      }
	      
	      return input;
	}
	
	public static void write(String output){
		System.out.print(output);
	}

}
