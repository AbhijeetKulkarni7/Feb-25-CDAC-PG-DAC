/*

public class OffByOneErrorForLoop {
public static void main(String[] args) {
for (int i = 1; i <= 10; i++) {
System.out.println(i);
}
}
}

*/

/*

// Expected: 10 iterations with numbers 1 to 10
// Actual: Prints numbers 1 to 10, but the task expected only 1 to 9



How to Adjust?
Check if the loop is running for the expected number of iterations.
Modify the start, end, or step size if needed.
Ensure the loop control variable updates correctly to prevent infinite loops.


Error to investigate: What is the issue with the loop boundaries? How should the loop be adjusted to meet the
expected output?

*/
// solution


public class OffByOneErrorForLoop {
public static void main(String[] args) {
for (int i = 1; i < 10; i++) {
System.out.println(i);
}
}
}