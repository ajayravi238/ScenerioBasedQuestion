// Sita took a loan from the bank. The interest rate depends on the loan amount and duration:

// For ≤ ₹50,000 → 5% per year

// For > ₹50,000 and ≤ ₹2,00,000 → 7% per year

// For > ₹2,00,000 → 10% per year

// Her cousin Geeta asks:
// "If Sita borrows ₹1,20,000 for 3 years, how much interest will she pay and what is the total amount payable?

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double P = sc.nextDouble();
		int year = sc.nextInt();
		int r = 0;
		if(P <= 5000) {
		    r = 5;
		}
		else if(P > 5000 && P <= 200000) {
		    r = 7;
		}
		else {
		    r = 10;
		}
		double SI = (P*year*r)/100;
		System.out.println(SI + P);
	}
}
