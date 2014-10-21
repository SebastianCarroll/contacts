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
		recreateDatabase();
	}

	private void recreateDatabase() throws IOException {
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
}
