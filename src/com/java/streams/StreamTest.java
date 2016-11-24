package com.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
		

		List<String> techs = Arrays.asList("Java:J2EE", "DotNet:MVC", "DotNet:C#.Net", "Java:JMS", "Java:EJB", "Java:Spring", "DotNet:ASP.Net","", "Java:JMS");
		
		List<String> javaTechs = techs.stream().filter(tech -> tech.startsWith("Java")).collect(Collectors.toList());
	    
		System.out.println("----Java Techs----");
		javaTechs.forEach(System.out::println);
		
		long count = techs.stream().filter(tech -> tech.startsWith("DotNet")).count();
		
		System.out.println("DotNet Techs Count = "+count);
		
		List<String> distinctTechs = techs.stream().distinct().collect(Collectors.toList());
		
		System.out.println("----Distinct Techs----");
		distinctTechs.forEach(System.out::println);
	    
		Map<String, Long> groupResult = 	techs.stream().collect( Collectors.groupingBy(
                                Function.identity(), Collectors.counting()));
		
		System.out.println("----Count By Techs----");
		groupResult.entrySet().forEach(System.out::println);
		
		
	}

}
