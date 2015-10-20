package Java2;

import java.util.*;

public class GradeExcercise {

	public static void main(String[] args) {
		
		int numOne = 0;
		int numTwo = 0;
		int numThree = 0;
		int numFour = numOne + numTwo + numThree;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your quiz score.");
		numOne=sc.nextInt();
		
		System.out.print("Enter your mid-term score.");
		numTwo=sc.nextInt();
		
		System.out.print("Enter your finals score.");
		numThree=sc.nextInt();
		
		
		System.out.println(numFour/3 + "%");
		
		int grade = numFour;
		
		
	}

}
