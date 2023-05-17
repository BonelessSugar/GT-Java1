import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		//print list of operators for user
		System.out.print("Operations:\n"
				+ "Add\n"
				+ "Subtract\n"
				+ "Mulitply\n"
				+ "Divide\n"
				+ "Alphabetize\n"
				+ "\nEnter an operation: ");
		//prompt user to enter operation, case-insensitive
		Scanner input = new Scanner(System.in);
		String operation = input.next().toLowerCase();
		String returnError = "Invalid input entered. Terminating...";
		//perform operation and print output
		//if user enters invalid operation or variables for operation, 
		//error message and terminate
		//have to use printf
		//if 0 is a divider, output error
		//spaces will be dividers (enter also works)
		switch (operation) {
		
		case "add": case "subtract":
			//initialize variables
			int inputIntOne, inputIntTwo;
			System.out.print("Enter two integers and press space between them: ");
			//check if next input is an int
			if (input.hasNextInt()) {
				//as for next input
				inputIntOne = input.nextInt();
			}
			else {
				//if not an int, return error then terminate
				System.out.print(returnError);
				break;
			}
			if (input.hasNextInt()) {
				inputIntTwo = input.nextInt();
			}
			else {
				System.out.print(returnError);
				break;
			}
			//executes add
			if (operation.equals("add")) {
				System.out.printf("\nAnswer: %d",inputIntOne + inputIntTwo);
			}
			//only other option is subtract if it's not add
			else System.out.printf("\nAnswer: %d",inputIntOne - inputIntTwo);
			//always terminate after executing either one
			break;
			//note, can use parseInt in future if needed
			
		case "multiply": case "divide":
			System.out.println("Enter two doubles and press space between them: ");
			double inputDoubleOne, inputDoubleTwo;
			if (input.hasNextDouble()) {
				inputDoubleOne = input.nextDouble();
			}
			else {
				System.out.print(returnError);
				break;
			}
			if (input.hasNextDouble()) {
				inputDoubleTwo = input.nextDouble();
				//executes the divide operation
				if (operation.equals("divide")) {
					//if zero, return error and terminate
					if (inputDoubleTwo == 0) {
						System.out.print(returnError);
						break;
					}
					//output divide operation
					System.out.printf("\nAnswer: %,.3f",inputDoubleOne / inputDoubleTwo);
					break;
				}
			}
			else {
				System.out.print(returnError);
				break;
			}
			//only other operation is multiply
			System.out.printf("\nAnswer: %,.3f",inputDoubleOne * inputDoubleTwo);
			break;
			
		case "alphabetize":
			System.out.print("Enter two words and press space between them: ");
			String wordOne = input.next().toLowerCase();
			String wordTwo = input.next().toLowerCase();
			int result = wordOne.compareTo(wordTwo);
			System.out.print("\nAnswer: ");
			if (result < 0) {
				System.out.printf("%s comes before %s alphabetically.",wordOne, wordTwo);
			}
			else if (result > 0) {
				System.out.printf("%s comes before %s alphabetically.",wordTwo, wordOne);
			}
			else {
				System.out.println("Chicken or Egg.");
			}
			break;
		default:
			System.out.print(returnError);
		}
		//terminate program
	}
}
