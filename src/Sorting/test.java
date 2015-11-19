package Sorting;
import java.util.Arrays;
import java.util.Random;

public class test {

	public static void main(String[] args) {
		
		Random rn = new Random();
		int number =rn.nextInt(10000000);
		System.out.println(number);
		int numberOne = number + 1;
		int[] List;
		List = new int[]{numberOne%2,number%3,number%6,number%5};
		
		System.out.println(Arrays.toString(List));
	}

}
