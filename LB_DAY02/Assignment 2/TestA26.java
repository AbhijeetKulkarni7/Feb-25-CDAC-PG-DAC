//Snippet 26:

public class TestA26 {
public static void main(String[] args) {
int number = 5;
switch(number) {
case 5:
System.out.println("Number is 5");
break;
case 5:
System.out.println("This is another case 5");
break;
default:
System.out.println("This is the default case");
}
}
}

/*
 Error to Investigate: Why does the compiler complain about duplicate case labels? What
happens when you have two identical case labels in the same switch block?


 error: duplicate case label
case 5:



A compiler complains about duplicate case labels in a switch statement because each case label is supposed to represent a unique value, and having two identical labels would lead to unpredictable behavior where only the first matching case would be executed, effectively ignoring the second one; essentially, the second case would never be reached due to the logic of how switch statements work. 
*/