package com.java.methodref;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MethodRefTest {

	public static void main(String[] args) {
		
		List<Integer> numberList = new ArrayList<>();
		Map<Integer, Integer> digitCubes = new HashMap<>();
		int multiplier = 10;
		for(int i=0;i<10 ;i++) {
			
			numberList.add((int)(Math.random()*multiplier));
			multiplier *= 10;
		}
		
		numberList.forEach(num -> digitCubes.put(num,CubingDigit.cubeDigit(num)));
		
		digitCubes.entrySet().forEach(System.out::println);

	}

}
