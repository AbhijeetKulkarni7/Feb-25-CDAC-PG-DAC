/*

21. Write a program to print the following pattern:
1
1*3
1*3*5
1*3*5*7
1*3*5*7*9

*/
class Question21
{
 
 public static void main(String Args[])
 { 


           int rows = 5; // Number of rows

        for (int i = 1; i <= rows; i++)
        {
            String pattern = "";
            for (int j = 0; j < i; j++) 
            {
                pattern += (2 * j + 1); // Generate odd numbers
                if (j < i - 1)
                {
                    pattern += "*";
                }
            }
            System.out.println(pattern);
        }





  }
}