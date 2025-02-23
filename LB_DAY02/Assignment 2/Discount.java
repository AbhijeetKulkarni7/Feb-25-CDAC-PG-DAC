/*
Question 4: Discount Calculation
Write a program to calculate the discount based on the total purchase amount. Use the following
criteria:
 If the total purchase is greater than or equal to Rs.1000, apply a 20% discount.
 If the total purchase is between Rs.500 and Rs.999, apply a 10% discount.
 If the total purchase is less than Rs.500, apply a 5% discount.
Additionally, if the user has a membership card, increase the discount by 5%.

*/

 import java.util.*;

class Discount
{




        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the total purchase amount (Rs.): ");
        double totalPurchase = scanner.nextDouble();
        
        System.out.print("Do you have a membership card? (yes/no): ");
        boolean hasMembership = scanner.next().trim().equalsIgnoreCase("yes");
        
        double discount;
        if (totalPurchase >= 1000) {
            discount = 20;
        } else if (totalPurchase >= 500) {
            discount = 10;
        } else {
            discount = 5;
        }
        
        if (hasMembership) {
            discount += 5;
        }
        
        double discountAmount = (discount / 100) * totalPurchase;
        double finalPrice = totalPurchase - discountAmount;
        
        System.out.printf("Discount Applied: Rs.%.2f\n", discountAmount);
        System.out.printf("Final Price after Discount: Rs.%.2f\n", finalPrice);
        
        scanner.close();
    }
}











