// Rahul just got his first job and received his salary slip.
// His dad asked him:
// "Did you calculate how much tax you'll pay based on your salary?"
// Rahul said,
// "Not yet, but I’ll write a program to calculate it!"

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salary = sc.nextDouble();
		if(salary <= 250000) {
			System.out.println("No tax");
			System.out.println(salary);
		}
		else if(salary <= 500000) {
			double x = salary - 250000;
			double tax = (x*5)/100;
			System.out.println(tax);
			System.out.println(salary - tax);
		}
		else if(salary <= 1000000) {
			double tax = (250000 * 5)/100 + ((salary-500000)*20)/100;
			System.out.println(tax);
			System.out.println(salary - tax);
		}
		else {
            double tax = (250000 * 5)/100 + (500000 * 20)/100 + ((salary-1000000)*30)/100;
			System.out.println(tax);
			System.out.println(salary - tax);
		}
	}
}
