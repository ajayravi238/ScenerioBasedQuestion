// Neha was reading a book and found a word that read the same forward and backward.
// Her cousin asks:
// "Can you create a program that tells me whether a word is a palindrome or not, without using built-in reverse functions?"

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String strRev = "";
		for(int i=str.length()-1; i>=0; i--) {
		    strRev += str.charAt(i);
		}
		if(strRev.equals(str)) {
		    System.out.println("palindrome");
		}
		else {
		    System.out.println("Not");
		}
	}
}
