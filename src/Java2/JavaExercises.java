package Java2;

import java.util.*;

public class JavaExercises {

	public static void main(String[] args) 
	{
		checkEligibility(); //this is the bit that i forgot last time
	}

static void checkEligibility(){	
int age;
Scanner sc=new Scanner(System.in);
System.out.print("What is your age?");
		 age=sc.nextInt();
if(age>=18)
	System.out.println("Lets get married.");
else
	System.out.println("Hmmmm, aren't you a bit too young");
}
} // To input values put them into the console
