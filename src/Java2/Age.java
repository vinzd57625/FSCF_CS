package Java2;

import java.util.*;

public class Age {

	public static void main(String[] args) {
		int age = 0;
		int inputValue=0;
		
		Scanner sc=new Scanner(System.in);
		
		inputValue=sc.nextInt();
		
		System.out.println("Congratulations on being " + inputValue);
		
		while(inputValue = 999){ //trying to delete the congratz on being for 999
			
		}
		
		while(inputValue!=999); {
		
		age=age+inputValue;
        System.out.println("Enter another value");
        inputValue=sc.nextInt();
        
	}

}
}
