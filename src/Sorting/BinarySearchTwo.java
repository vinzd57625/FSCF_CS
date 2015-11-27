package Sorting;
import java.util.Scanner;
import java.util.Arrays;

public class BinarySearchTwo {

	public static boolean main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int[]a = {1,3,4,8,10,13,19,25};
		System.out.println(Arrays.toString(a));
		int start=0;
		int end=a.length-1;
		int searchValue=sc.nextInt();
		
		for(int i =0;i<a.length;i++){
			int middle= (end+start)/2;
			if(a[middle] == searchValue){
				return true;
			}
			else if(a[middle]>searchValue){
				end=middle-1;
				}
			else{start=middle +1;
			}
				}
		return false;
			}

	}