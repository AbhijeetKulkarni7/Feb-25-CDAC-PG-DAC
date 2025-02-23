/*

//Snippet 6:
public class MisplacedForLoopBody {
public static void main(String[] args) {
for (int i = 0; i < 5; i++)
System.out.println(i);
System.out.println("Done");
}
}


Error to investigate: Why does "Done" print only once, outside the loop? How should the loop body be enclosed to
include all statements within the loop?

In Java, if a loop does not use curly braces {} to enclose multiple statements, only the first statement immediately after the loop header is considered part of the loop.


*/

public class MisplacedForLoopBody {
public static void main(String[] args) {
for (int i = 0; i < 5; i++)
{
System.out.println(i);
System.out.println("Done");
}
}
}
