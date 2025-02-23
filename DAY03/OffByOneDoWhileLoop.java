

/* Snippet 8: 
public class OffByOneDoWhileLoop {
public static void main(String[] args) {
int num = 1;
do {
System.out.println(num);
num--;
} while (num > 0);
}
}

// Error to investigate: Why does this loop print unexpected numbers? What adjustments are needed to print the
numbers from 1 to 5?

num starts at 1.
The loop prints 1.
Then, num-- makes num = 0.
The condition while (num > 0) fails, so the loop stops immediately.
As a result, only 1 is printed, which is unexpected.

*/

public class OffByOneDoWhileLoop {
public static void main(String[] args) {
int num = 1;
do {
System.out.println(num);
num++;
} while (num <= 5);
}
}
