public class TestA19 {
public static void main(String[] args) {
int a = 10;
int b = 0;
int result = a / b;
System.out.println(result);
}
}
/*
 What runtime exception is thrown? Why does division by zero cause an issue in Java?

Exception in thread "main" java.lang.ArithmeticException: / by zero
        at TestA19.main(TestA19.java:5)

In Java, division by zero with integers results in an ArithmeticException. This is because mathematically, division by zero is undefined. When the program attempts this operation, the Java Virtual Machine (JVM) throws an exception to signal that an error has occurred during the execution of the code. This mechanism prevents the program from continuing with an invalid result, which could lead to further errors or unpredictable behavior.


*/