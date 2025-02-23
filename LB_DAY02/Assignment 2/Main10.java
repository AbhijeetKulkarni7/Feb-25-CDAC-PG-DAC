import java.lang.*;

// Snippet 10:
/*

public class Main {
public void display() {
System.out.println("No parameters");
}
public void display(int num) {
System.out.println("With parameter: " + num);
}
public static void main(String[] args) {
display();
display(5);
}
}

*/

/* 
 error: non-static method display(int) cannot be referenced from a static context
display(5);

error: non-static method display() cannot be referenced from a static context
display();

*/

/*

 What happens when you compile and run this code? Is method overloading allowed?

display() is an instance method, but main() is static.

Non-static method display() cannot be called from a static context (main).

Yes! Method overloading means having multiple methods with the same name but different parameters.

Overloaded methods must differ in parameters (number/type).
✔ Return type does NOT differentiate overloaded methods.
✔ Improves readability and code flexibility.
✔ Constructors can also be overloaded.

🔥 Method overloading helps in writing clean and efficient Java programs! 🚀

ex : 

public void show() {}          // No parameter  
public void show(int a) {}     // Different number of parameters  
public void show(double a) {}  // Different type of parameter  


*/



