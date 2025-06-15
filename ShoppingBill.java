// Arjun went shopping and bought several items.
// Later, his sister Anu asked:
// "Can your system calculate the total bill and apply a discount if the total crosses ₹1000?"

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int totalAmt = 0;
		for(int i=0; i<num; i++) {
		    int item = sc.nextInt();
		    int quantity = sc.nextInt();
		    
		    totalAmt += item * quantity;
		}
		System.out.println(totalAmt);
		int discountPrice = 0;
		if(totalAmt > 1000) {
		    discountPrice = (totalAmt * 10) / 100; // 145
		}
		System.out.println(discountPrice);
		int finalAmt = totalAmt - discountPrice;
		System.out.println(finalAmt);
	}
}
