// Priya went shopping and bought items with the following prices: ₹1200, ₹800, ₹450, ₹300, ₹1500.
// Her brother Raj wants to calculate the total amount she spent and apply a discount based on the total:

// If total > ₹3000 → 20% discount

// If total > ₹2000 → 15% discount

// If total > ₹1000 → 10% discount

// Else → No discount

// Raj asks: "How much did Priya actually pay after discount?"

import java.util.*;

public class DiscountCalculator
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int items = sc.nextInt();
		double[] price = new double[items];
		double totalBill = 0;
		for(int i=0; i<items; i++) {
		    price[i] = sc.nextDouble();
		    totalBill += price[i];
		}
		if(totalBill >= 3000) {
		    System.out.println("Discount Applied: " + (totalBill * 20) / 100);
		    System.out.println("Final Amount: " + (totalBill - (totalBill * 20) / 100));
		}
		else if(totalBill >= 2000) {
		    System.out.println("Discount Applied: " + (totalBill * 15) / 100);
		    System.out.println("Final Amount: " + (totalBill - (totalBill * 15) / 100));
		}
		else if(totalBill >= 1000) {
		    System.out.println("Discount Applied: " + (totalBill * 10) / 100);
		    System.out.println("Final Amount: " + (totalBill - (totalBill * 10) / 100));
		}
		else {
		    System.out.println(totalBill);
		}
	}
}
