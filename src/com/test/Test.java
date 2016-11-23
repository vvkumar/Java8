package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import com.sun.xml.internal.ws.api.pipe.ThrowableContainerPropertySet;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		List<Person> list = new ArrayList<>();
		
		list.add(new Person("P1", "E1"));
		list.add(new Person("P23", "E5"));
		list.add(new Person("P12", "E2"));
		list.add(new Person("P45", "E0"));
		
		//Sort person by using Comparator
		Collections.sort(list, (Person p1,Person p2) -> p1.getName().compareTo(p2.getName()) );
		
		System.out.println(list);

		//Functional interface implementation
		Runnable r = ()  -> {
								for(int i = 10;i<15;i++) { 
									System.out.println(i); 
									try {
										TimeUnit.SECONDS.sleep(2);
									} catch (Exception e) {
										
										e.printStackTrace();
									} 
								}
							};
		Thread t = new Thread(r);
		t.start();
		
		
		Map<String, Person> m = new HashMap<String, Person>();
		list.forEach(p -> {System.out.println(p.getName() + "  " + p.getEmail()); m.put(p.getName(),p);});
		//TimeUnit.MINUTES.sleep(1);
		
		m.entrySet().forEach( e -> System.out.println(e.getKey() + e.getValue()));
	}

}
