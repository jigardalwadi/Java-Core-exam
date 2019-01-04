package org.learn.java.general.programming;

public class FindRoot {

	 public static void findRootInbuilt(double numberToRoot) {
		System.out.println(Math.round(Math.sqrt(numberToRoot)));
	 }
	
	 public static void findRoot(double number) {
		 if(number ==0|| number ==1) {
			 System.out.println(number);
		 }
		 else {
			 int i =1;
			 int result = 1;
			 while(result <= number) {
				 i++;
				 result = i*i;
			 }
			 System.out.println(i);
		 }
	 }
	 
	public static void main(String[] args) {
	
		// first method using math.sqrt method
		 
		 findRootInbuilt(15);
		 findRoot(15);
		// System.out.println(Math.sqrt(y));

	}

}
