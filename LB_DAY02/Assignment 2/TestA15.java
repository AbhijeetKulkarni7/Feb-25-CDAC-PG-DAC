// Snippet 15:

public class TestA15 {
public static void main(String[] args) {
int num1 = 10;
double num2 = 5.5;
int result = num1 + num2;
System.out.println(result);
}
}

/*

 What error occurs when compiling this code? How should you handle different data types
in operations?

  error: incompatible types: possible lossy conversion from double to int
int result = num1 + num2;
                  ^
Handling different data types correctly ensures type safety, memory efficiency, and smooth program execution. Java provides various ways to manage different data types effectively.

1️⃣ Choose the Appropriate Data Type
Use primitive data types like int, double, char, and boolean for simple values.
Use wrapper classes (e.g., Integer, Double, Boolean) when working with collections like ArrayList.
2️⃣ Perform Type Conversion (Casting)
Implicit (Widening) Casting automatically converts smaller types to larger types (e.g., int to double).
Explicit (Narrowing) Casting is needed when converting a larger type to a smaller one (e.g., double to int), which may cause data loss.
3️⃣ Convert Between Data Types
Use wrapper class methods (Integer.toString(), Double.parseDouble()) to convert between primitive types and strings.
The valueOf() method can also be used for conversion between types while handling null values safely.
4️⃣ Handle Mixed Data Types in Expressions
Java automatically promotes smaller types when used in mathematical operations.
Be cautious when mixing data types to avoid unintended results (e.g., adding an int to a double will return a double).
5️⃣ Prevent NullPointerException with Objects
Always check for null before accessing object methods to avoid runtime errors.
When handling user input or database values, ensure proper validation before performing operations.

*/