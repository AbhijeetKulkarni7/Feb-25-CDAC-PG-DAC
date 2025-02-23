/*
Question 5: Student Pass/Fail Status with Nested Switch
Write a program that determines whether a student passes or fails based on their grades in three
subjects. If the student scores more than 40 in all subjects, they pass. If the student fails in one or
more subjects, print the number of subjects they failed in.

*/
 
import java.util.*;

class NestedSwitch
{

 public static void main(String args[]) 
 {


   int count = 0 ; 

    Scanner sc = new Scanner(System.in) ;
   
    System.out.print("Input marks for Subject 1: ");
        int sub1 = sc.nextInt();
        System.out.print("Input marks for Subject 2: ");
        int sub2 = sc.nextInt();
        System.out.print("Input marks for Subject 3: ");
        int sub3 = sc.nextInt();

        switch ((sub1>40)?1 : 0) {
            case 0:
                count++;
            default:
                switch ((sub2 > 40)?1 : 0) {
                    case 0:
                        count++;
                    default: switch ((sub3>40)?1 : 0) {
                            case 0: count++;
                        }
                }
        }

        if (count == 0) {
            System.out.println("congrats , you Passed in Exam !");
        } else {
            System.out.println("OOps , You Failed in : " + count + " subject(s) !");
        } 








 }

}