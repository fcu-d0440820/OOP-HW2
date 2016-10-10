import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a integer:");
		int one = keyboard.nextInt();
		
		boolean ans;
		if(one%2==1)ans = true;
		else ans = false;
	
		if(ans)System.out.println("The input integer is Odd Number.");
		else System.out.println("The input integer is Even Number.");
	}

}
