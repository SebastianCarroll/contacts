package com.seb.storage;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DatabaseIntegrationTest {

	@Before
	public void setup() throws IOException {
		recreateDatabase();
	}

	private void recreateDatabase() throws IOException {
		String path = "install";
		ProcessBuilder pb = new ProcessBuilder("./install.sh");
		pb.directory(new File(path));
		Process p = pb.start();
		String s = null;
		BufferedReader stdInput = new BufferedReader(new InputStreamReader(
				p.getInputStream()));
		while ((s = stdInput.readLine()) != null) {
			System.out.println(s);
		}
	}

	@Test
	public void test() {

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		String url = "jdbc:mysql://localhost:3306/people";
		String user = "testuser";
		String password = "mypass";

		try {
			con = DriverManager.getConnection(url, user, password);
			st = con.createStatement();
			rs = st.executeQuery("SELECT * from persons order by givenname limit 1");
			System.out.println("Printing result set");
			if (rs.next()) {
				assertEquals("Acton", rs.getString(2));
			} else {
				Assert.fail("No results returned!");
			}
		} catch (SQLException ex) {
			System.out.println(ex);
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}
				if (con != null) {
					con.close();
				}

			} catch (SQLException ex) {
				System.out.println(ex);
			}
		}
	}
}
