//Snippet 5: 


public class Main5 {
public static void main(String[] args) {
System.out.println("Main method with String[] args");
}
public static void main(int[] args) {
System.out.println("Overloaded main method with int[] args");
}
}


/*
 Can you have multiple main methods? What do you observe?

program compiled successfully . without any error so we can have multiple main methods but only Main method with String[] args will get executed !

While you can technically define multiple "main" methods in a class in most programming languages like Java, only the method with the signature public static void main(String[] args) will be executed when you run the program as it's the designated entry point by the JVM; essentially, you can overload the main method, but only the standard signature will be used for program execution

*/






