package Sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int[] a = {7,29,43,814,65,324};
		int temp =  0;
		int current = 1;
		for (current=1; current<a.length;++current){
			while(current>0 && a[current] <a [current-1]){
				temp=a[current];
				a[current]=a[current-1];
				a[current-1]=temp;
				--current;
			}
		}
		for(int i=0;i<a.length;++i){
			System.out.print(a[i] + " ");
		}
	}

}
