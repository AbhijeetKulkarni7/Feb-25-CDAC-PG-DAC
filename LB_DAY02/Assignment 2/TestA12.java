// Snippet 12:

public class TestA12 {
public static void main(String[] args) {
while (true) {
System.out.println("Infinite Loop");
}
}
}

/*
 What happens when you run this code? How can you avoid infinite loops?


The program enters an infinite loop because while(true) always evaluates to true.
It keeps printing "Infinite Loop" indefinitely, consuming CPU resources.
The loop will never stop unless manually terminated (e.g., using Ctrl + C or stopping the execution in an IDE)

Use a Proper Exit Condition – Ensure the loop has a clear stopping condition, like a counter reaching a limit.
Use a break Statement – Insert a break inside the loop to exit when a condition is met.
Use User Input for Exit – Allow user input to determine when the loop should stop

✔ Infinite loops can freeze a program and cause high CPU usage.
✔ Always ensure loops have a valid exit condition.
✔ Use break or conditional statements to prevent unintended infinite loops. 🚀


*/