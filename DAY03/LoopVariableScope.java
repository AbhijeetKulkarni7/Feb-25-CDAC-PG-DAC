
/*
Snippet 12:
public class LoopVariableScope {
public static void main(String[] args) {
for (int i = 0; i < 5; i++) {
int x = i * 2;
}
System.out.println(x); // Error: 'x' is not accessible here
}
}

 Error to investigate: Why does the variable 'x' cause a compilation error? How does scope

 error: cannot find symbol
System.out.println(x); // Error: 'x' is not accessible here

x is defined in the scope of for loop and if you want to access it outside the for loop it will give error. to avoid this , you need to inatilized the variable in the main function . 

*/

public class LoopVariableScope {
public static void main(String[] args) {
int x = 0 ;
for (int i = 0; i < 5; i++) 
{
 x = i * 2;
}
System.out.println(x);
}
}