import java.util.Scanner;
public class PrintNumberInWord {

	public static void main(String[] args) {
		int ans;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a integer:");
		ans = keyboard.nextInt();
		
		switch(ans){
			case 1 : System.out.println("The input integer is ¡§ONE¡¨.");
			case 2 : System.out.println("The input integer is ¡§TWO¡¨.");
			case 3 : System.out.println("The input integer is ¡§THREE¡¨.");
			case 4 : System.out.println("The input integer is ¡§FOUR¡¨.");
			case 5 : System.out.println("The input integer is ¡§FIVE¡¨.");
			case 6 : System.out.println("The input integer is ¡§SIX¡¨.");
			case 7 : System.out.println("The input integer is ¡§SEVEN¡¨.");
			case 8 : System.out.println("The input integer is ¡§EIGHT¡¨.");
			case 9 : System.out.println("The input integer is ¡§NINE¡¨.");
			default : System.out.println("The input integer is ¡§OTHER¡¨."); 
	}

}
}
