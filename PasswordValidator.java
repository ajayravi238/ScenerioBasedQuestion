// A password is considered valid if it:

// Contains at least 8 characters

// Includes at least one uppercase letter

// Includes at least one lowercase letter

// Includes at least one digit

// Includes at least one special character (e.g., @, #, $, etc.)

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pass = sc.nextLine();
		int upperCount = 0, lowerCount = 0, numberCount = 0, specialCount = 0;
		if(pass.length() < 8) {
			System.out.println("Invalid: Password must be at least 8 characters long");
			return;
		}
		for(int i=0; i<pass.length(); i++) {
			if(pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z') {
				upperCount++;
			}
			if(pass.charAt(i) >= 'a' && pass.charAt(i) <= 'z') {
				lowerCount++;
			}
			if(pass.charAt(i) >= '0' && pass.charAt(i) <= '9') {
				numberCount++;
			}
			if(!Character.isLetterOrDigit(pass.charAt(i))) { // special character
				specialCount++;
			}
		}
		if(upperCount == 0) {
			System.out.println("Invalid: Must contain at least one uppercase letter");
		}
		else if(lowerCount == 0) {
			System.out.println("Invalid: Must contain at least one lowercase letter");
		}
		else if(numberCount == 0) {
			System.out.println("Invalid: Must contain at least one number");
		}
		else if(specialCount == 0) {
			System.out.println("Invalid: Must contain at least one special character");
		}
		else {
			System.out.println("Valid Password!");
		}
	}
}
