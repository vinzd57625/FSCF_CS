package dataStructuresAndAlgorithms;

import java.util.Scanner;

public class StackController {

	public static void main(String[] args) {
		int stackSize=0;
		System.out.println("Enter a Stack size ");
		Scanner sc = new Scanner(System.in);
		stackSize= sc.nextInt();
		Stack linearStack = new Stack(stackSize);
		
		for(int i=0;i<stackSize;i++){ //push item
			linearStack.push((long)
			(Math.random()*stackSize));
		}
		long[] x = linearStack.getStack();
		for(int i=0; i<stackSize; i++){
			System.out.print(x[i] + " ");
		}
		System.out.println(); //pops item
		linearStack.pop();
		
		for(int i=0; i<stackSize; i++){
			System.out.print(x[i] + " ");
		}
		
	}

}
