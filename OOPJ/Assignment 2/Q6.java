



import java.util.* ;
 import java.lang.* ;




public class Q6{
	public static void main(String[] args){
		int x=7, y=44, z=1100;
		int res = ((x>y && x>z)? x : (y>x && y>z)? y : z);
		System.out.println(res + " is the largest number.");
	}
}