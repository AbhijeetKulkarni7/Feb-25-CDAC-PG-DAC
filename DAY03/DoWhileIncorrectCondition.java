
public class DoWhileIncorrectCondition
{
public static void main(String[] args)
{
int num = 0;
do 
{
System.out.println(num);
num++;
} while (num > 0);
}
}


/*

Error to investigate: Why does the loop only execute once? What is wrong with the loop condition in the `dowhile`
loop?

the loop works only once bcoz its the property of do-while loop ,it runs exactly once without checking condition and then it checks the condition , here before closing the block of DO  , the variable incremented by 1 ,  when it checks the condition the condition make false and loop terminates . 

*/





