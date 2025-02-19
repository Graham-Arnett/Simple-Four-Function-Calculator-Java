package calculator;
import java.util.Scanner;
public class SimpleCalculator {

	public static void main(String[] args) {
		//this is a simple 4 function calculator app
		//you enter two numbers, and then decide what operation to perform on them, I'll make a more complex one in the future
		
		Scanner scanner = new Scanner(System.in);
		String choice;
		System.out.println("Hello! Welcome to my calculator app!");
		do 
		{
			System.out.print("\nPlease enter a number: ");
			double entryA = scanner.nextDouble();
			System.out.print("\nPlease enter your second input: ");
			double entryB = scanner.nextDouble();
			
			System.out.print("\nWould you like to ADD, SUBTRACT, DIVIDE, or MULTIPLY? ");
			String operation = scanner.next().toUpperCase();
			switch(operation) 
			{
			case "ADD":
				entryA += entryB;
				System.out.println("The sum is: " + entryA);
				break;
			case "SUBTRACT":
				entryA -= entryB;
				System.out.println("The difference is: " + entryA);
				break;
			case "MULTIPLY":
				entryA *= entryB;
				System.out.println("The product is: " + entryA);
				break;
			case "DIVIDE":
				entryA /= entryB;
				System.out.println("The quotient is: " + entryA);
			}
			System.out.print("Would you like to go again? (y/n): ");
			choice = scanner.next();
		}while(choice.equalsIgnoreCase("y"));
		scanner.close();
	}

}
