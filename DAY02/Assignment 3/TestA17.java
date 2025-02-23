//Snippet 17: 

public class TestA17 {
public static void main(String[] args) {
int a = 10;
int b = 5;
int result = a ** b;
System.out.println(result);
}
}

/*

 What compilation error occurs? Why is the ** operator not valid in Java?
 
 error: illegal start of expression
int result = a ** b;

The ** operator, commonly used for exponentiation in some programming languages like Python, is not a valid operator in Java due to its design philosophy prioritizing simplicity and avoiding operator overloading


*/