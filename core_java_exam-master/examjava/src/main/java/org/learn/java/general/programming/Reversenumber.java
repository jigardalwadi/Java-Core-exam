package org.learn.java.general.programming;


public class Reversenumber {

	public static void reverseNumber(double n) {
		double y = Math.abs(n);
        if(n == y){
        int b=Double.toString(n).length()-1;
        String str1 = Double.toString(n);
        String re = "";
        while(b>=0){
            re += str1.charAt(b);
            b--;
        }
        System.out.println(Double.parseDouble(re));
            
        }
        else{
            // x is negative
            int b=Double.toString(y).length()-1;
            String str1 = Double.toString(y);
            String re = "";
            while(b>=0){
                re += str1.charAt(b);
                b--;
            }
            
            System.out.println(0 - Double.parseDouble(re));
            
        }
        
	}
	
	public static void main(String[] args) {
		double i = -123456.21;
		reverseNumber(i);
	}

}
