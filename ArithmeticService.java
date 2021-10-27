package com.revature.service;

public class ArithmeticService {

public String doAddition(String number1String, String number2String) {
		
		double number1 = Double.parseDouble(number1String);
		double number2 = Double.parseDouble(number2String);
		
		double sum = number1 + number2;
		
		String result = "Sum of the two numbers are:" + sum; // Convert from double representation of a number to a String representation 
		
		return result;
	}
public String doSubrtraction(String number1String, String number2String) {
	
	double number1 = Double.parseDouble(number1String);
	double number2 = Double.parseDouble(number2String);
	
	double subtraction = number1 - number2;
	
	String result = "Subtraction of the two numbers are" + subtraction; // Convert from double representation of a number to a String representation 
	
	return result;
	
	}

public String doMultiplication(String number1String, String number2String) {
	
	double number1 = Double.parseDouble(number1String);
	double number2 = Double.parseDouble(number2String);
	
	double multiplication = number1 * number2;
	
	String result = "Product of the two numbers are" + multiplication; // Convert from double representation of a number to a String representation 
	
	return result;
	
}
	
public String doDivide(String number1String, String number2String) {
		
		double number1 = Double.parseDouble(number1String);
		double number2 = Double.parseDouble(number2String);
		
		double divide = number1 / number2;
		
		String result = "Quotient of the two numbers are:" + divide; // Convert from double representation of a number to a String representation 
		
		return result;
		
	}

}
		
		
	
