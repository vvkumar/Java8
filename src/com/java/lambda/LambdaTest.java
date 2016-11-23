package com.java.lambda;

public class LambdaTest {

	public static void main(String... args) {
		
		Fee normalfee = (amt) -> amt*10/100;
		
		Fee lateFee = (amt) -> (amt*10/100) + 30; //late fee 30
		
		Fee lateFeeWithSurchage = (amt) -> {
			double fee = (amt*10/100);
			double surcharge = (fee*15/100); // surcharge 15% of fee
			
			return fee + surcharge + 30;
					
		};
		
		System.out.println("Normal Fee for $100 = " + getFee(100, normalfee));
		System.out.println("Late Fee for $100 = " + getFee(100, lateFee));
		System.out.println("Late Fee with surcharge for $100 = " + getFee(100, lateFeeWithSurchage));
		
	}
	
	public static double getFee(double amount, Fee fee) {
		return fee.calculateFee(amount);
	}
	
	
}
