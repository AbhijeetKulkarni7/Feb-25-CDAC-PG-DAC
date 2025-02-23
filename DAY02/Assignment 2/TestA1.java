import java.util.* ;
class TestA1
{


public static void main(String args[])
{

 // check positive number 
 
Scanner sc = new Scanner(System.in) ;

System.out.println(" Enter a number : ");
int n  = sc.nextInt();

 if(n>0)
 {
   System.out.println(" The number is positive ! ");
   }
else
{ 
  System.out.println(" The number is not positive ! ");
}



}
}