package Java2;

import java.util.*;

public class OddOrEven {

	public static void main(String[] args) {
		int numOne = 0;
		int numTwo = 2;//if number is even and it's divided by two it will be 0 if more then 0 it will be odd
		int numThree = numOne % numTwo;  //I didn't need numThree
		
		Scanner sc=new Scanner(System.in);    //allows you to enter a number
		System.out.print("Enter a number to be assessed");
		numOne=sc.nextInt();
     
     if(numOne % numTwo<=0 ){
    	 System.out.println("Even number");}
    	 else{
    		 System.out.print("Odd number");
     }
	}
}
