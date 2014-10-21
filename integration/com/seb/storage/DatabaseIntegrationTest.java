package com.seb.storage;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class DatabaseIntegrationTest {

	@Before
	public void setup() throws IOException{
		String path = "install";
		ProcessBuilder pb = new ProcessBuilder("./install.sh");
		pb.directory(new File(path));
		Process p = pb.start();
		String s = null;
		BufferedReader stdInput = new BufferedReader(new
                InputStreamReader(p.getInputStream()));
        while ((s = stdInput.readLine()) != null) {
            System.out.println(s);
        }
	}
	
	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	
	private void runCommand(String command){
		String s = null;
		 
        try {
             
        // run the Unix "ps -ef" command
            // using the Runtime exec method:
            Process p = Runtime.getRuntime().exec(command);
             
            BufferedReader stdInput = new BufferedReader(new
                 InputStreamReader(p.getInputStream()));
 
            BufferedReader stdError = new BufferedReader(new
                 InputStreamReader(p.getErrorStream()));
 
            // read the output from the command
            System.out.println("Here is the standard output of the command:\n");
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
            }
             
            // read any errors from the attempted command
            System.out.println("Here is the standard error of the command (if any):\n");
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
            }
        }
        catch (IOException e) {
            System.out.println("exception happened - here's what I know: ");
            e.printStackTrace();
            System.exit(-1);
        }
	}

}
