package com.java.defaultmethod;

import java.util.Arrays;

public interface SortingTemplate {
	
	public void input(int[] elements);
	public void sort(int[] elements);
	
	public  default void display(int[] elements) {
		Arrays.asList(elements).forEach(System.out::println);
	}

}
