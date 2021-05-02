package com.jocata.intern;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.jocata.intern.model.Address;
import com.jocata.intern.model.Person;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		try 
		{
			ObjectMapper mapper = new XmlMapper();
			InputStream inputStream = new FileInputStream(new File("C:\\lekha_data\\data2.xml"));
			TypeReference<List<Person>> typeReference = new TypeReference<List<Person>>() {};
			List<Person> persons = mapper.readValue(inputStream, typeReference);
			/*for(Person p :persons) 
			{
				String kk = p.getFirstName();
				System.out.println("name is "+ kk+" city is "+p.getAddress().getCity()+" first car is "+p.getCars()[1]+" age is "+p.getAge());
		    }*/
			for(Person p :persons) 
			{
				//String kk = 
				System.out.println(p.getFirstName());
				System.out.println(p.getLastName());
				System.out.println(p.getAge());
				System.out.println(p.getAddress().getStreet());
				System.out.println(p.getAddress().getCity());
				System.out.println(p.getAddress().getZip());
				System.out.println(p.getCars()[0]);
				System.out.println(p.getCars()[1]);
		    }
			
	        inputStream.close();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}

