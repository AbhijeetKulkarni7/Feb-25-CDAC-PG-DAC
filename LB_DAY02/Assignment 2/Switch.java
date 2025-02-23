//Snippet 25:

public class Switch {
public static void main(String[] args) {
double score = 85.0;
switch(score) {
case 100:
System.out.println("Perfect score!");
break;
case 85:
System.out.println("Great job!");
break;
default:
System.out.println("Keep trying!");
}
}
}

/*

 Error to Investigate: Why does this code not compile? What does the error tell you about the
types allowed in switch expressions? How can you modify the code to make it work?

 error: incompatible types: possible lossy conversion from double to int
switch(score) {
      ^
1 error


The error occurs because switch does not support double as the control expression.


fixing the error : 

Option 1: Use if-else Instead of switch
Since double values cannot be used in switch, you should use an if-else structure:

java

public class Switch {
    public static void main(String[] args) {
        double score = 85.0;

        if (score == 100.0) {
            System.out.println("Perfect score!");
        } else if (score == 85.0) {
            System.out.println("Great job!");
        } else {
            System.out.println("Keep trying!");
        }
    }
}


Option 2: Use int Instead of double


public class Switch {
    public static void main(String[] args) {
        int score = 85;

        switch(score) {
            case 100:
                System.out.println("Perfect score!");
                break;
            case 85:
                System.out.println("Great job!");
                break;
            default:
                System.out.println("Keep trying!");
        }
    }
}

*/