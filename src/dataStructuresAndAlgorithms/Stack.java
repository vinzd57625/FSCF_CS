package dataStructuresAndAlgorithms;

public class Stack {
	private int maxSize; //creates variable maxSize
	private long[]a; //creates array called a
	private int top; //creates top variable
	
	public Stack(int maxSize){
		this.maxSize=maxSize;
		this.top=-1;
		a=new long[maxSize];
	}
	public void push(long j){
		String result = top==a.length-1?" Stack is full":pushItem(j);
		msgBox(result);
	}
	public String pushItem(long j){
		a[++top]=j;
		return " Item added to stack";
	}
	public void pop(){
		msgBox(top==-1?" Stack is empty":popItem());
	}
	public String popItem(){
		return "Item at the top : " +a[top--]+ " removed";
	}
	public void msgBox(String message){
		System.out.println("** " + message + " **");
	}
	public boolean isEmpty(){
		return(top==-1);
	}
	public boolean isFull(){
		return(top==a.length-1);
	}
	public long[] getStack(){
		return a;
	}
}
