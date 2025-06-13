// Ramesh runs a small company and pays salaries to 5 employees.
// His manager Suresh wants to know:

// "What is the total monthly salary expense, the highest salary among employees, and how many employees earn more than ₹30,000?"

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int NoOfEmp = sc.nextInt();
		double[] salary = new double[NoOfEmp];
		for(int i=0; i<NoOfEmp; i++) {
		    salary[i] = sc.nextDouble();
		}
		double totalSal = 0, max = 0;
		int count = 0;
		for(int i=0; i<NoOfEmp; i++) {
		    totalSal += salary[i];
		    if(max < salary[i]) {
		        max = salary[i];
		    }
		    if(salary[i] > 30000) {
		        count++;
		    }
		}
		System.out.println(totalSal);
		System.out.println(max);
		System.out.println(count);
	}
}
