import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a string 1:");
		String one = keyboard.next();
		System.out.println("Enter a string 2:");
		String two = keyboard.next();
		
		if(one.equalsIgnoreCase(two))System.out.println("The two strings are the same.");
		else System.out.println("The two strings are not the same.");
	}

}
