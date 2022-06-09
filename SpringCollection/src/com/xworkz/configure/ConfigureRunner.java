package com.xworkz.configure;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigureRunner {

	public static void main(String[] args) {
		String xmlFile = "resource/spring.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlFile);
		Configure config=applicationContext.getBean(Configure.class);
		ArrayList<String> animals=config.getanimals();
		ListIterator<String> lIterator=animals.listIterator();
		while(lIterator.hasNext())
		{
			System.out.println(lIterator.next());
        }
		Set<String> set=config.getSets();
    	System.out.println(set); 
    	Map<String,String> map=config.getMaps();
    	System.out.println(map);
    	Properties properties=config.getProp();
    	System.out.println(properties);
    	array arrays=config.getArray();
    	System.out.println(array);
		

	}

}
