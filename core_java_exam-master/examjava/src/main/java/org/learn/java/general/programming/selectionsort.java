package org.learn.java.general.programming;

public class selectionsort {

	public static int[] sort(int[] arr){
		int length = arr.length;
		for (int i = 0; i < length - 1; i++) {
			int min_idx = i;
			for (int j = i + 1; j < length; j++) {
				if (arr[j] < arr[min_idx]) {
					min_idx = j;
				}

			}
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i]=temp;

		}
		return arr;
		
	}	
	
	public static void main(String[] args) {
		int[] arr= new int[] {1,9,4,6,2};
		sort(arr);
		
		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
		System.out.println("The time complexity is O(n2) cause" 
				+ "There are two for loops as we can see"
				+ "The fisrt loop eterates one after one through location"
				+ "The second tries to place that selected node into it's appropreate position"
				+ " "
				+ "Spce complexity is O(1) cause we are updating the same array while using just one temp cariable");
		
		
	}

}
