//Snippet 23:

public class Confusion {
public static void main(String[] args) {
int value = 2;
switch(value) {
case 1:
System.out.println("Value is 1");
case 2:
System.out.println("Value is 2");
case 3:
System.out.println("Value is 3");
default:
System.out.println("Default case");
}
}
}
/*

 Error to Investigate: Why does the default case print after "Value is 2"? How can you prevent
the program from executing the default case?

o/p: 
Value is 2
Value is 3
Default case

explanation : 
The switch statement evaluates value = 2 and finds the matching case 2:.
It executes the statement inside case 2
However, since there is no break; statement, execution continues to case 3 and then to default, printing:
This happens because in Java, when a case is matched, execution continues to subsequent cases unless explicitly stopped by a break statement.


*/