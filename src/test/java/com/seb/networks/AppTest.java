package com.seb.networks;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 * 
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	public void testConnections() {
		Person p1 = new Person("Fred", "Jones");
		Person p2 = new Person("Jane", "Jones");
		Person p3 = new Person("John", "Boss");

		Connection c1 = new Connection(p1, p2, LinkType.FAMILY);
		Connection c2 = new Connection(p2, p3, LinkType.COLLEAGUE);

		assertEquals(p2, c1.getSecond());
		assertEquals(p3, c2.getSecond());
		assertEquals(c1.getSecond(), c2.getFirst());
	}
}
