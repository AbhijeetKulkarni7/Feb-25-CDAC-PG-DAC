// Snippet 7:
/**/
public class Main7 {
public static void main(String[] args) {
int x = "Hello";
System.out.println(x);
}
}

/*

 error: incompatible types: String cannot be converted to int
int x = "Hello";

*/

/*
 What compilation error do you see? Why does Java enforce type safety?

error: Incompatible type
The variable x is declared as an int, but it is assigned the string "Hello", which is of type String.
Java is a statically typed language, meaning that variables must be explicitly declared with a specific data type, and once assigned, they cannot store values of a different type.



Java enforce type safety :-
Prevents Runtime Errors: Type checking at compile-time catches errors early, reducing the chances of unexpected crashes.
Ensures Data Integrity: It prevents accidental assignments of incompatible types, ensuring that operations perform as expected.
Enhances Code Readability & Maintainability: Developers can understand the expected data types, making the code more structured and easier to debug.
Optimized Performance: Since type constraints are checked at compile-time, Java can optimize memory allocation and processing.

*/








