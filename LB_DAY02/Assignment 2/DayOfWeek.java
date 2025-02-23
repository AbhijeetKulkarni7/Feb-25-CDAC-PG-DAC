import  java.util.*; 

class DayOfWeek {

public static void main(String args[])
{


  Scanner sc = new Scanner(System.in);
  int Day ;
  System.out.println("Enter the day of week : ");
  Day = sc.nextInt() ;

  switch(Day)
  { 

   case 1 :
            System.out.print("Monday- ");
            switch(Day)
           {
             default:
              System.out.print("weekday");
           }
            break ;
             
   case 2 : 
           System.out.print("tuesday- ");
           switch(Day)
           {
             default:
              System.out.print("weekday");
           }
            break ;

   case 3 : 
           System.out.print("Wednesday- ");
           switch(Day)
           {
             default:
              System.out.print("weekday");
           }
            break ;
   case 4 : 
           System.out.print("thursady- ");
           switch(Day)
           {
             default:
              System.out.print("weekday");
           }
            break ;
   case 5 :
           System.out.print("Friday- ") ;
           switch(Day)
           {
             default:
              System.out.print("weekday");
           }
            break ;
   case 6 :
           System.out.print("saturday- ");
           switch(Day)
           {
             default:
              System.out.print("weekend");
           }
            break ;
   case 7 :
           System.out.print("Sunday- ");
           switch(Day)
           {
             default:
              System.out.print("weekend");
           }
            break ;
 
   default: 
           System.out.print("Invalid Input (Input between 1-7 ) !");
  break ;
 
   }

}
}