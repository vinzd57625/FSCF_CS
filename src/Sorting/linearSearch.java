package Sorting;
import java.util.Scanner;
import java.util.Arrays;

public class linearSearch {
		static int[] array={1,3,5,6,7,5}; //creates array
		System.out.println(Array.toString(array));
		static Scanner sc= new Scanner(System.in);
		
		public static boolean linearSearch(int[] array, int searchValue){ //how method should behave
			for(int i=0; i<array.length;i++){ //for loop for array
				searchValue=sc.nextInt();
				if(array[i]==searchValue){ //e.g i=4 ==search value -> return true
					return true;
				}
			}
			return false; //if not return false
		}
		public static void main(String[]args){
			System.out.println(linearSearch(array,4)?"value found": "not there");
		}
	}