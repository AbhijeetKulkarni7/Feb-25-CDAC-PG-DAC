/*
  Write a program to check whether a given number is even or odd using only bitwise
  operators .
  Hint : Use n & 1 to check.

*/
 import java.util.* ;


 class Q2
 {
     public static void main(String[] args)
	 { 
	     int a = 9, b = 10;
		check(a);
		check(b);
	 }
	 
	 
	 public static void check(int a){
		if((a&1) == 0){
			System.out.println(a + " is even");
		} else {
			System.out.println(a + " is odd");
		}
	}
	 
	 
 }