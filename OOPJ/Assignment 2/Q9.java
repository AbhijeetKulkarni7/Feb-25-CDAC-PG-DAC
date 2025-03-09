


import java.util.* ;
 import java.lang.* ;

public class Q9{
	public static void main(String[] args){
		int x = 22, y = 250;
		check(x);
		check(y);
	}
	
	public static void check(int a){
		System.out.println((a>=20 && a<=50)? a + " lies in the range." : a + " doesn't lie within the range");
	} 
}	