import java.util.Scanner;
public class KeyboardScanner {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a integer:");
		int one = keyboard.nextInt();
		System.out.println("Enter a float point number:");
		float two = keyboard.nextFloat();
		System.out.println("Enter a your name:");
		String three = keyboard.next();
		
		System.out.printf("Hi %s, the multiplication of %d and %6.2f is %e.",three,one,two,one*two);
	}

}

