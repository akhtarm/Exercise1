/**
 * 
 */

/**
 * @author Tobias
 *
 */

import java.util.Scanner;

public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		

		
		Scanner userInput =  new Scanner(System.in);
		String userName;
		System.out.println("Hello ASE2015 - how are you now? :)");
		System.out.println("Please enter your name: ");	
 		userName = userInput.next();
		HelloUser greet = new HelloUser();
		greet.greetUser(userName);

	}
	

}
