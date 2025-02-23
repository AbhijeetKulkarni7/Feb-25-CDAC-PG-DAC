public class Factorial 
{


// factorial

public static void main(String[] args) 
{
   int res = 1 , num = 10 ;
 
   if(num == 0 || num == 1 )
     {
        res = 1 ; 
    }
     for(int i = 1; i<=10 ; i++)
    {
       res = res * i ; 
    }

  System.out.println(res);
}
}
