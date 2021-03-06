package org.learn.java.general.programming;


public class GcdAlgorithm {
	public static int findGcd(int n, int m) {
		if(n>m) {
			int remainder = n%m;
			if(remainder == 0) {
				return m;
			}else {
				return findGcd(m, remainder);
			}
		}
		else {
			int remainder = m%n;
			if(remainder == 0) {
				return n;
			}else {
				return findGcd(n, remainder);
			}
		}
		
	}
	public static void main(String[] args) {

		System.out.println(GcdAlgorithm.findGcd(12, 30));
		System.out.println(GcdAlgorithm.findGcd(GcdAlgorithm.findGcd(15, 200), 30));
		
		// fing gsm of an array
		int[] array = new int[] {24,44,58,98};
		int gsm = array[0];
		for(int i = 1 ; i< array.length; i++) {
			gsm = GcdAlgorithm.findGcd(gsm, array[i]);
		}
		System.out.println(gsm);
		
		
	}

}

