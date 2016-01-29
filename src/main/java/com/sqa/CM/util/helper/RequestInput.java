/**
 *   File Name: RequestInput.java<br>
 *
 *   Mallapre, Christian<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Jan 27, 2016
 *
 */

package com.sqa.CM.util.helper;

import java.util.Scanner;

/**
 * RequestInput //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Mallapre, Christian
 * @version 1.0.0
 * @since 1.0
 *
 */
public class RequestInput {
	// Scanner object to get user input
	private static Scanner scanner = new Scanner(System.in);

	/**
	 * Static Helper Method which asks user specified question and as long as
	 * they give a input will return a boolean type variable.
	 *
	 * @return Boolean value based on user input
	 */
	public static boolean getBoolean(String question) {
		// Local variable to hold input
		String input;
		// Infinite loop to look out for Yes and No valid options
		while (true) {
			// Ask the user a question to get relative input
			System.out.print(question + " (Yes/Y) or (No/N):");
			// Set the input based on what the user enters on their keyboard
			input = scanner.nextLine();
			// Check if the user has entered Yes
			if (input.equalsIgnoreCase("Yes") || input.equalsIgnoreCase("Y")) {
				// Return that the user has selected Yes so return true
				return true;
				// Check if the user has entered No
			} else if (input.equalsIgnoreCase("No") || input.equalsIgnoreCase("N")) {
				// Return that the user has selected No so return false
				return false;
				// Or else the user has not entered a valid option
			} else {
				// Return an error message to user
				System.out.println("You have not entered a valid option, please choose Yes/Y or No/N.");
				// Continue infinite loop to ask for a valid response
				continue;
			}
		}
	}

	/**
	 * Static Helper Method which asks user specified question and as long as
	 * they give a valid number will return the number as an int type variable.
	 *
	 * @return Number of pets user has chosen
	 */
	public static int getInt(String question) {
		// Local variable to hold temporary number
		int num;
		//
		while (true) {
			try {
				// Ask the user a question to get relative input
				System.out.print(question);
				// Set the number based on what the user enters on their
				// keyboard
				num = Integer.parseInt(scanner.nextLine());
				// Break out of the infinite loop
				break;
			} catch (NumberFormatException e) {
				// Output to the user that the number is not valid
				System.out.println("You have not entered a valid number.");
				// Continue the infinite loop to get a valid number conversion
				continue;
			}
		}
		// Return the number that the user has entered
		return num;
	}

	/**
	 * Static Helper Method which asks user specified question and return the
	 * input to user.
	 *
	 * @return Input given from user.
	 */
	public static String getString(String question) {
		// Local variable to hold temporary input
		String input;
		// Ask the user a question to get relative input
		System.out.print(question);
		// Set the input based on what the user enters on their
		// keyboard
		input = scanner.nextLine();
		// Return input user has entered
		return input;
	}
}