/*
22. Write a program to print the following pattern:

*********
*******
*****
***
*
***
*****
*******
*********

*/

class Question22
{
 
 public static void main(String Args[])
 { 


          int rows = 5; // Number of rows for the upper half

        // Upper half
        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        for (int i = 2; i <= rows; i++) {
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }



  }
}