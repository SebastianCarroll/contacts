package com.seb.networks;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ImporterTest {

	@Test
	public void test() throws Exception {
		List<String> csv = new ArrayList<String>();
		csv.add("603299508,Aaron Bashford,https://www.facebook.com/aaron.bashford.5,https://fbcdn-profile-a.akamaihd.net/hprofile-ak-xaf1/t1.0-1/c1.0.50.50/p50x50/1004971_10152186113839509_275303866_n.jpg");
		csv.add("600280198,Aaron Haigh,https://www.facebook.com/aaron.haigh.104,https://fbcdn-profile-a.akamaihd.net/hprofile-ak-xpf1/t1.0-1/p50x50/1456655_10151999386140199_559275049_n.jpg");
		csv.add("607710533,Ace Maclean,https://www.facebook.com/ace.maclean,https://fbcdn-profile-a.akamaihd.net/hprofile-ak-xap1/t1.0-1/p50x50/1463196_10153505660140534_2058096396_n.jpg");
		Importer i = new Importer(csv);
		List<Person> people = i.getContacts();
		Person expected = new Person("Aaron","Bashford");
		Person actual = people.get(0);
		assertEquals(expected, actual);
	}
}
