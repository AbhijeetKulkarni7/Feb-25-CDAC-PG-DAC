// Snippet 5:
/*

public class WrongInitializationForLoop {
public static void main(String[] args)
 {
for (int i = 10; i >= 0; i++) 
{
System.out.println(i);
}
}
}



 Error to investigate: Why does this loop not print numbers in the expected order? What is the problem with the
initialization and update statements in the `for` loop?


on the place of variable decrement , the prpogram added the veriable by one ,  so it becomes the infinite loop 

*/
// solution


public class WrongInitializationForLoop {
public static void main(String[] args)
 {
for (int i = 10; i >= 0; i--) 
{
System.out.println(i);
}
}
}
