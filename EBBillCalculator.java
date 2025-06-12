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
