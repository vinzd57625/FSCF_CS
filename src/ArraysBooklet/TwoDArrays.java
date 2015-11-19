package ArraysBooklet;

import java.util.*;

public class TwoDArrays {

	public static void main(String[] args) {
		
		int[][]a = new int[4][5];                 //Creates the table
		Scanner sc = new Scanner(System.in);      //Inputs scanner
		
		int i=0; //Variables
		int j=0;
		
		for(i=0;i<4;i++){                         //for loop for rows
			for(j=0;j<5;j++){                     //for loop for column
				System.out.print("Enter a number");
				a[i][j]= sc.nextInt();
				System.out.print(i+ " ");
				System.out.print(j+ " ");
			}
		}
	}
}
