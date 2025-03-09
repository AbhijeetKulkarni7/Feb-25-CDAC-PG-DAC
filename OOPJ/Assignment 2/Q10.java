
import java.util.* ;
 import java.lang.* ;


public class Q10{
	public static void main(String[] args){
		char x = 'a';
		check(x);
		x = 'b';
		check(x);
		x = 'A';
		check(x);
		x = 'K';
		check(x);
	}
	
	public static void check(char a){
		char ch = Character.toLowerCase(a);
		String str = (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch =='u')? a + " is a vowel." : a + " is a consonant";  
		System.out.println(str);
	} 
}


