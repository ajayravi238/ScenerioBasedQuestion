import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    int flag = 0;
	    for(int i=0; i<str.length()-1; i++) {
	        if(str.charAt(i) == str.charAt(i+1)) {
	            i++;
	        }
	        else {
	            System.out.print(str.charAt(i));
	            return;
	        }
	    }
	    System.out.println("No unique Character");
	}
}
