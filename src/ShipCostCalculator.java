import java.util.Scanner;

public class Lab_5_Task_1_ShipCostCalculator {
    public static void main(String[] args) {
        //variable
        Scanner scan = new Scanner(System.in);
        double purchaseTotal;
        double SHIPPING_FEE_RATE = 0.05; //dollar
        double shippingCost = 0;
        double total = 0;

        //output and input
        System.out.println("Enter your purchase total to the hundredths place: ");
        purchaseTotal = scan.nextDouble();

        //process and check
        if (scan.hasNextDouble()) {
            if (purchaseTotal < 100.00) {
                shippingCost = purchaseTotal * SHIPPING_FEE_RATE;
                total = purchaseTotal + shippingCost;
                System.out.println("Your purchase of $" + purchaseTotal + " has a shipping fee of $" + shippingCost + ". Your total is $" + total);
            } else {
                System.out.println("Your purchase is over a $100.00, shipping is free!");
            }
        } else {
            System.exit(0);
        }
    }
}