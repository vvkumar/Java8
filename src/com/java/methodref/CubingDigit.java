package com.java.methodref;

/**
 * 
 * @author Vijay
 *
 * Library class to cube each digit of number and add
 * e.g. number = 132 
 * return (1*1*1)+(3*3*3)+(2*2*2)
 */
public class CubingDigit {

	public static Integer cubeDigit(Integer number) {
		
		int sum = 0;
	    while(number != 0) {
	    	
	        int val = number%10;
	        sum = sum + (val*val*val);
	        number = number/10;
	    }
	   
	    return sum;
	}
}
