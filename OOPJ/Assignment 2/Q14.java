

import java.util.* ;
 import java.lang.* ;

public class Q14{
	public static void main(String[] args){
		setbits(5);
		setbits(10);
	}
	
	public static void setbits(int num){ 
		int count = 0;
		while(num > 0){
            num = (num & (num - 1));
            count++;
        }
		System.out.println(count);
	} 
}	











