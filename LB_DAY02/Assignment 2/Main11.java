// Snippet 11:

/*

public class Main11 {
public static void main(String[] args) {
int[] arr = {1, 2, 3};
System.out.println(arr[5]);
}
}



*/


/*

 What runtime exception do you encounter? Why does it occur?
 
 error:   java.lang.ArrayIndexOutOfBoundsException:

 The array arr is declared with 3 elements: {1, 2, 3} → Valid indices: 0, 1, 2
arr[5] tries to access index 5, which is out of bounds (array length is only 3).
This results in a java.lang.ArrayIndexOutOfBoundsException, a runtime error.

*/




