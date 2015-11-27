package Sorting;
import java.util.Arrays;
import java.util.Random;

public class test {

	public static void main(String[] args) {
		
		Random rn = new Random(); //creates random object
		int number =rn.nextInt(1000); //makes variable "x" random
		int numberOne=rn.nextInt(1000);
		int numberTwo=rn.nextInt(1000);
		int numberThree=rn.nextInt(1000);
		int numberFour=rn.nextInt(1000);
		int[] List; //create array called list
		List = new int[]{number,numberOne,numberTwo,numberThree,numberFour}; //inputs variables which are random
		
		System.out.println("Random  =  " + Arrays.toString(List)); //prints random sequence
		
		int[] a = {number,numberOne,numberTwo,numberThree,numberFour}; //makes new list "a"
		int temp; //makes temp variable
		int current; //makes current variable
		for(current=0;current<a.length;current++){ //for loop for ordering
			while(current> 0 && a[current] < a[current-1]){ //eg while a=2 and a=2 < a=3
				temp=a[current]; //assign a=2 to temp
				a[current]=a[current-1]; //assign a=2 to a=3
				a[current-1]=temp;//assign a=2 to temp
						--current;//pre-decrement
			}
		}
		System.out.println("Ordered =  " + Arrays.toString(a)); //prints order list
	}

}