//Snippet 13:

public class TestA13 {
public static void main(String[] args) {
String str = null;
System.out.println(str.length());
}
}

/*
 What exception is thrown? Why does it occur?

Exception in thread "main" java.lang.NullPointerException
        at TestA13.main(TestA13.java:6)

Why Does It Occur?
The variable str is initialized to null, meaning it does not point to any object.
When str.length() is called, Java tries to access the memory location of the string object, but since str is null, there is no object to reference.
This results in a NullPointerException (NPE) at runtime.

Take a ways :

 A NullPointerException occurs when trying to access a method or field of a null object.
✔ Always check for null before calling methods on an object.
✔ Use proper initialization or Optional to handle potential null values safely. 



*/