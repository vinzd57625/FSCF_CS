package ArraysBooklet;

import java.util.*;

public class Bowling {

	public static void main(String[] args) {
		
		int[][]a = new int [5][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter player names");
		
		int i; //rows
		int j; // column 
		String playerNameOne;
		String playerNameTwo;
		
		playerNameOne = sc.toString();
		
		for(i=0;i<5;i++){
		for(j=0;j<3;j++){
			
			a[i][j]= sc.nextInt();
			System.out.print(a[i][j]);
			
		}
		}
	}

}
