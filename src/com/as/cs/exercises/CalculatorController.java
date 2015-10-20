package com.as.cs.exercises;

public class CalculatorController {

	public static void main(String[] args) {
		float nOne, nTwo;
    Calculator vinzsCalculator = new Calculator();
    
    nOne= Float.parseFloat(args[0]);
    nTwo= Float.parseFloat(args[1]);
    
    vinzsCalculator.setNumOne(nOne);
    vinzsCalculator.setNumTwo(nTwo);
	
    System.out.println("Addition " + vinzsCalculator.add());
    System.out.println("Multiplication " + vinzsCalculator.multiply());
    System.out.println("Divide " + vinzsCalculator.divide());
    System.out.println("Subtraction " + vinzsCalculator.subtract());
    
	}
}
