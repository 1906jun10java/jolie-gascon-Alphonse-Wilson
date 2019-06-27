package trinicalculatorupdates;

import java.util.Scanner;

public class CalculatorBehavior extends CalculatorOperations {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello, please enter a number to calculate!");
		double number1 = 1; //arbitrary value 1
		double number2 = 0; //arbitrary value 0
		char arithmaticOp = '%'; // make sure to use something (%) that is not gonna be used in your operations at all ( -,+,*, /)
								// also; char variables are defined with ' '
		
		boolean input1 = true; //always start with true, must type true itself
	while (input1) { //while loops are ALWAYS true or false/boolean guys
		try { // try and catch block, to catch wrong input from users
			number1 = sc.nextDouble();
			input1 = false; //put the false to break out of the loop
			}
			catch ( Exception E) {System.out.println("It seems you did not enter a valid response. Please try again using the available options shown.");
			
		sc.next(); //to push it to the next command
			}
	}
	
	boolean input2 = true;
	while (input2) {
		System.out.println("Please enter the other number to calculate");
		
		try { // try and catch block, to catch wrong input from users
			number2 = sc.nextDouble();
			input2 = false;
			}
			catch ( Exception E) {System.out.println("It seems you did not enter any valid response. Please try again using the available options shown.");
			
			sc.next();
			}
			
		
	}
		System.out.println("Which operation would you like performed? ( press +, -, * or / )");
		
		boolean input3 = true;
		while (input3) {
		try { // try and catch block, to catch wrong input from users
			arithmaticOp = sc.next().charAt(0);
			input3 = false;
			}
			catch ( Exception E) {System.out.println("It seems you did not enter any valid response. Please try again using the available options shown.");
			
		sc.next();
		}
	}
	
		
		switch(arithmaticOp){
		
		//first case
		
		case '+' :
		{
			System.out.println(" The addition of " + number1+ " and " + number2+ " is " + add(number1, number2));
			break;
		}
		
		//another case
		
		case '-' :
		{
			System.out.println("did you mean " + number1 + " - " + number2 + " ? Please press Y or N");
			char response = sc.next().charAt(0);
			
			if(response == ('Y' | 'y')) {
				System.out.println(number1 + " minus " + number2+ " is " + minus(number1, number2));
				break;
			}else{
				
				System.out.println("Apologies human, did you mean " + number2 + " - " + number1 + " ? Please press Y or N");
				char response2 = sc.next().charAt(0);
				
				if(response2 == ('Y' | 'y')) {
					System.out.println("Great!" + number2 + " minus " + number1+ " is " +minus(number2, number1));
					break;
				}else {
					
					System.out.println("I am sorry, it appears we have an error in your selection. Please run program again, goodbye.");
					break;
					
				}
			}
		}
		
		//third case
		
		case '*' :
		{
			System.out.println(" The multiplication of " + number1+ " and " + number2+ " is " +multiply(number1, number2));
			break;
		}
		
		//fourth case
		
		case '/' : 
		{
			System.out.println("did you mean " + number1 + " / " + number2 + " ? Please press Y or N");
			char response = sc.next().charAt(0);
			
			if(response == ('Y' | 'y')) {
				System.out.println(number1 + " / " + number2+ " is " +divide(number1, number2));
				break;
			}else{
				
				System.out.println("Apologies human, did you mean " + number2 + " / " + number1 + " ? Please press Y or N");
				char response2 = sc.next().charAt(0);
				
				if(response2 == ('Y' | 'y')) {
					System.out.println("Great!" + number2 + " divided by " + number1+ " is " +divide(number2, number1));
					break;
				}else {
					
					System.out.println("I am sorry, it appears we have an error in your selection. Please run program again, goodbye.");
					break;
					
				}
			}
		}
		
		default : 
		{
			System.out.println("It seems you did not enter any valid response. Please try again, goodbye.");
		}
		
				
		sc.close();
				
		}
			
		
}
}


		
	
	
