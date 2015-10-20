package com.as.cs.exercises;

public class Calculator {               // creates the class
		private float numOne;           // sets the variables it's private and float type and i assign names
		private float numTwo;          

public float getNumOne() {              // getters and setters
	   return numOne;
}
public void setNumOne(float numOne){
	   this.numOne = numOne;
}
public float getNumTwo() {
       return numTwo;
}
public void setNumTwo(float numTwo) {
	   this.numTwo = numTwo;
}

public Calculator(){
	
}
public float add(){
	return numOne + numTwo;
}
public float multiply(){
	return numOne * numTwo;
}
public float divide(){
	return numOne / numTwo;
}
public float subtract(){
	return numOne - numTwo;
}
}