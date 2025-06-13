// Arjun appeared for 6 subjects. His marks were: 85, 74, 90, 67, 88, and 92.
// His sister Meena is curious:
// "How many subjects did Arjun score above 75 in? What is his highest mark, and did he pass all subjects (pass mark is 35)?"

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int subjects = sc.nextInt();
		int[] marks = new int[subjects];
		for(int i=0; i<subjects; i++) {
		    marks[i] = sc.nextInt();
		}
		int count = 0, max = 0, c = 0;
		for(int i=0; i<subjects; i++) {
		    if(marks[i] > 75) {
		        count++;
		    }
		    if(max < marks[i]) {
		        max = marks[i];
		    }
		    if(marks[i] > 35) {
		        c++;
		    }
		}
		System.out.println(count);
		System.out.println(max);
		if(c == subjects) {
		    System.out.println("yes");
		}
		else {
		    System.out.println("no");
		}
	}
}
