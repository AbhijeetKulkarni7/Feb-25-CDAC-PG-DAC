// Snippet 3 ::


/*
public class Main3 {
public static int main(String[] args) {
System.out.println("Hello, World!");
return 0;
}
}
*/


/*

Error: Main method must return a value of type void in class Main3, please
define the main method as:
   public static void main(String[] args)

*/

public class Main3 {
public static void main(String[] args) {
System.out.println("Hello, World!");

}
}



/* 

Why to use void ?

The void keyword in the main function in Java specifies that the main method does not return any value. The main method serves as the entry point for the execution of a Java program. Therefore, it does not need to return any value to the caller, which is the Java Virtual Machine (JVM). The void keyword is used to indicate this absence of a return value. If a return type other than void is specified for the main method, it will result in a compilation error.


*/






