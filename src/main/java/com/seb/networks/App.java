package com.seb.networks;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<String> lines = FileUtil.readByLine("/home/scarroll/workspace/contact_network/contacts/contacts.csv");
        Importer importer = null;
		try {
			importer = new Importer(lines);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        People people = new People(importer);
        System.out.println(people);
    }
}
