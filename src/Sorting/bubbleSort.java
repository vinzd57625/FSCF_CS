package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class bubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sequence to be ordered");
		int sequence = sc.nextInt();
		
		int temp = 0;
        int[] List;
		List= new int[]{47,654,7,654,7};

		for(int i=0; i<List.length-1;i++)
		{
			for(int j=0;j<List.length-1;j++)
			{
				if(List[j] > List[j+1]){
				temp = List[j];
				List[j]=List[j+1];
				List[j+1] = temp;
				}
			}
			System.out.print(temp + " ");
			System.out.println(Arrays.toString(List));
		}

	}

}
