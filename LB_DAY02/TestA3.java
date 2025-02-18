import java.util.* ;
class TestA3
{


public static void main(String args[])
{

 // check positive number 
 
Scanner sc = new Scanner(System.in) ;

System.out.println(" Enter a number : ");
int n  = sc.nextInt();

 if(n%2 == 0)
 {
   System.out.println(" The number is even !");
   }
else
{ 
  System.out.println(" The number is odd ! ");
}



}
}