package com.java8.streams;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StreamsSampleImplTest {

	StreamsSample obj;
	List<String> techs;
	
	@Before
	public void setUp() throws Exception {
		obj = new StreamSampleImpl();
		techs = Arrays.asList("Java:J2EE", "DotNet:MVC", "DotNet:C#.Net", "Java:JMS", "Java:EJB", "Java:Spring", "DotNet:ASP.Net","", "Java:JMS");
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetTechCounts() {
		Map<String, Long> counts = obj.getTechCounts(techs);
		
		assertEquals("Java:JMS count should be 2", 2, counts.get("Java:JMS"), 0);
	}
	
	@Test
	public void testGetDistinctTechs() {
		
		List<String> distTechs = obj.getDistinctTechs(techs);
		assertEquals("Distinct Techs count should be 8", 8, distTechs.size() , 0);
	}
	
	@Test
	public void testGetJavaTechs() {
		List<String> javaTechs = obj.getJavaTechs(techs);
		assertEquals("Java Techs count should be 5", 5, javaTechs.size() , 0);
	}
	
	@Test
	public void testGetDotNetTechs() {
		List<String> dotNetTechs = obj.getDotNetTechs(techs);
		assertEquals("DotNet Techs count should be 3", 3, dotNetTechs.size() , 0);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testGetTechCountsInvalidArg() {
		Map<String, Long> counts = obj.getTechCounts(null);
		
		fail("Should throw IllegalArgumentException");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testGetDistinctTechsInvalidArg() {
		
		List<String> distTechs = obj.getDistinctTechs(null);
		fail("Should throw IllegalArgumentException");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testGetJavaTechsInvalidArg() {
		List<String> javaTechs = obj.getJavaTechs(null);
		fail("Should throw IllegalArgumentException");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testGetDotNetTechsInvalidArg() {
		List<String> dotNetTechs = obj.getDotNetTechs(null);
		fail("Should throw IllegalArgumentException");
	}

}
