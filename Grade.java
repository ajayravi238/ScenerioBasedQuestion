// Neha is a class teacher. She recorded the marks and names of 4 students.
// Her colleague Rekha wants to know:

// "Who scored the highest, what grade each student got, and who failed?"
// (Grades:

// A: 90 and above

// B: 75 to 89

// C: 50 to 74

// F: below 50)

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfStud = sc.nextInt();
		sc.nextLine();
		String[] details = new String[numOfStud];
		for(int i=0; i<numOfStud; i++) {
		    details[i] = sc.nextLine();
		}
		int max = 0;
		ArrayList<String> failedNames = new ArrayList<>();
		System.out.println("Grades: ");
		for(int i=0; i<numOfStud; i++) {
		    String[] arr = details[i].split("-");
		    String name = arr[0];
		    int mark = Integer.parseInt(arr[1]);
		    if(mark >= 90) {
		        System.out.println(name + " - A");
		    }
		    else if(mark >= 75 && mark <= 89) {
		        System.out.println(name + " - B");
		    }
		    else if(mark >= 50 && mark <= 74) {
		        System.out.println(name + " - C");
		    }
		    else {
		        System.out.println(name + " - F");
		        failedNames.add(name);
		    }
		    if(max < mark) {
		        max = mark;
		    }
		}
		System.out.println();
		System.out.print("Highest Scorer: ");
		System.out.print(max + " - ");
		for(int i=0; i<numOfStud; i++) {
		    String[] arr = details[i].split("-");
		    String name = arr[0];
		    int mark = Integer.parseInt(arr[1]);
		    if(mark == max) {
		        System.out.print(name + " ");
		    }
		}
		System.out.println();
		System.out.println("Failed Student: ");
		for(String i : failedNames) {
		    System.out.println(i);
		}
	}
}
