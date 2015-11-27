package Sorting;
import java.util.Arrays;

public class BinarySearch {
	static int[]a= {12,35,48,94,109,156,199,250,351,399};
	static int x=22;
	System.out.print(Array.toString(a));
	public static void main(String[] args) {
		String result = binarySearch(a,x)?"value found":"Not found";
		System.out.println(result);
	}
	public static boolean binarySearch(int[] array, int searchValue){
		int start = 0;
		int end = a.length -1;
		
		for(int i=0;i<a.length-1;i++){
			int middle = (start + end)/2;
			if(array[middle]==searchValue){
				return true;
			}
			else if(array[middle]>searchValue){
				end=middle-1;}
			else{
				start=middle+1;
			}
		}
		return false;
		
	}

}
