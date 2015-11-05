package ExtraJavaExcercises;

import java.util.*;

public class Prime {

	public static void main(String[] args) {
		
		int inputValue = 0;
		int counter = 0;
		System.out.print("Enter a number");
		Scanner sc = new Scanner(System.in);
		inputValue = sc.nextInt();
		
		
		for(int i = 1;i>=inputValue;i++){
			int remainder = inputValue % i;
		
		if (remainder==0){
		counter++; 
		}if (counter==2){
		System.out.println("Prime number");
		}
		}

	}

}
