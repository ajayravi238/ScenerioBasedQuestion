// Vinay lives in an apartment where the electricity cost is calculated based on usage:

// First 100 units: ₹1.5 per unit

// Next 100 units (101–200): ₹2.5 per unit

// Beyond 200 units: ₹3.5 per unit

// Vinay used 275 units this month. His friend Suresh is curious: "How much will Vinay’s electricity bill be this month?"


import java.util.*;

public class EBBillCalculator
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double unit = sc.nextDouble();
		double price = 0.0;
		if(unit <= 100) {
		    price = (unit*1.5);
		}
		else if(unit <= 200) {
		    price = (100*1.5) + ((unit-100)*2.5);
		}
		else {
		    price = (100*1.5) + (100*2.5) + ((unit-200)*3.5);
		}
		System.out.println(price);
	}
}
