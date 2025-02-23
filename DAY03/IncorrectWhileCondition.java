// snippet 2 
/*

public class IncorrectWhileCondition {
public static void main(String[] args) {
int count = 5;
while (count = 0) {
System.out.println(count);
count--;
}
}
}

*/
/* 

 Error to investigate: Why does the loop not execute as expected? What is the issue with the condition in the `while` loop?

 error: incompatible types: int cannot be converted to boolean

in java the boolean values are true and false . java dose not  accept 0 and 1 as true and false . 
 
another one is operator , when you are comparing someting between to things must be  == operator

*/


public class IncorrectWhileCondition
{
public static void main(String[] args) 
{
int count = 5;
while (count != 0) 
{
System.out.println(count);
count--;
}
}
}
