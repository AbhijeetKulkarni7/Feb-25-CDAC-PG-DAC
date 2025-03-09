
import java.util.* ;
import java.lang.* ;


public class Q17{
	public static void main(String[] args){
		minfour(10,22,3,40);
	}
	
	public static void minfour(int x, int y, int z, int m){
		int res = (x<y && x<z && x<m)? x:(z<y && z<x && z<m)? z:(y<z && y<x && y<m)? y : m;
		System.out.println(res);
	}
}	




