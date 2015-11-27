package Sorting;
import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] a = {99,3,43,814,65,324}; //creating array
		int temp =  0; //variable for temp
		int current = 1; //variable for current
		for (current=1; current<a.length;++current){ //for loop, for the array
			while(current>0 && a[current] <a [current-1]){ //e.g 1, if 1 greater than 0 and 3 < 99
				temp=a[current]; //assign variable temp to a[1]
				a[current]=a[current-1]; //assign a[1] to a[0]
				a[current-1]=temp; //make a[0] = temp
				--current; //pre-decrement
			}
		}
		System.out.println(Arrays.toString(a));
		}
	}


//[3, 43, 65, 99, 324, 814] = --curent
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 6
//at Sorting.InsertionSort.main(InsertionSort.java:11) = ++curent