

import java.util.* ;
import java.lang.* ;

public class Q16{
	public static void main(String[] args){
		pnz(10);
		pnz(-1);
		pnz(0);
	}
	public static void pnz(int x){
		String res = (x==0)? "zero" : (x>0)? "positive" : "negative";
		System.out.println(res);
	}
}



