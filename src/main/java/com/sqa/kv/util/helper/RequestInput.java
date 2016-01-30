/**
 * 
 */
package com.sqa.kv.util.helper;

import java.util.Arrays;
import java.util.Scanner;

public class RequestInput
{
	// Scanner object to get user input
	private static Scanner scanner = new Scanner(System.in);

	public static String[] addStringElement(String[] elements, String addString)
	{
		// Local variables
		String[] newStringArray;
		// Check if the supplied string is null and if so, then we gonna add one
		// element
		if (elements != null)
		{
			// Supplied array contains elements so the new size will be
			// increased by 1 and add the current elements
			newStringArray = Arrays.copyOf(elements, elements.length + 1);
			// Set the last element to supplied String addString
			newStringArray[elements.length] = addString;
		}
		else
		{
			// Suplied array does not contain any elements
			newStringArray = new String[1];
			// Set the last and only element to supplied String addString
			newStringArray[0] = addString;
		}
		return newStringArray;
	}

	public static boolean getBoolean(String question)
	{
		// Local variable to hold input
		String input;
		// Infinite loop to look out for Yes and No valid options
		while (true)
		{
			// Ask the user a question to get relative input
			System.out.print(question + "(Yes/Y or No/N): ");
			// Set the number based on what the user enters on their
			// keyboard
			input = (scanner.nextLine());
			// Check if user entered Yes
			if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y"))
			{
				return true;
			}
			// Check if user entered No
			else if (input.equalsIgnoreCase("no") || input.equalsIgnoreCase("n"))
			{
				return false;
			}
			// Check if user entered something else
			else
			{
				System.out.println("You have not entered a valid option, please choose (Yes/Y or No/N)");
				continue;
			}
		}
	}

	/**
	 * Static Helper Method which asks user specified question and as long as
	 * they give a input will return a boolean type variable.
	 * 
	 * @return Boolean value based on user input
	 */
	public static char getChar(String question)
	{
		// Local variable to hold input
		String input;
		char character = ' ';

		// Infinite loop to look out for valid options
		while (true)
		{
			try
			{
				// Ask the user a question to get relative input
				System.out.print(question);
				// Set the input based on what the user enters on their keyboard
				input = scanner.nextLine();
				// Check that the input String is one character long
				if (input.length() < 1)
				{
					throw new IllegalArgumentException("too few chars");
				}
				else if (input.length() > 1)
				{
					throw new IllegalArgumentException("too many chars");
				}
				// Convert the String into a char value
				character = input.charAt(0);

			}
			catch (Exception e)
			{
				// TODO Auto-generated catch block
				e.getMessage();
			}
			return character;
		}
	}

	/**
	 * Static Helper Method which asks user specified question and as long as
	 * they give a input will return a boolean type variable.
	 * 
	 * @return Boolean value based on user input
	 */
	public static char getChar(String question, char... characters)
	{
		while (true)
		{
			// Declare local variables
			boolean present = false;
			// Get the character using alternative method to get a char
			char letter = RequestInput.getChar(question);
			// iterate through supplied chars and see if it's present
			for (int i = 0; i < characters.length; i++)
			{
				if (Character.compare(characters[i], letter) == 0)
				{
					present = true;
				}
			}
			// if present variable is set to true and it's a valid option
			if (present == true)
			{
				// return the character
				return letter;
			}
			else
			{
				// Give an error message
				System.out.println("You have not entered a valid character.");
				continue;
			}
		}
	}

	/**
	 * Static Helper Method which asks user a specified question and as long as
	 * they give a valid number will return the number as an int type variable.
	 * 
	 * @return Number the user has chosen
	 */
	public static double getDouble(String question)
	{
		// Local variable to hold temporary number
		double num;

		while (true)
		{
			try
			{
				// Ask the user a question to get relative input
				System.out.print(question);
				// Set the number based on what the user enters on their
				// keyboard
				num = Double.parseDouble(scanner.nextLine());
				// Break out of the infinite loop
				break;
			}
			catch (NumberFormatException e)
			{
				// Output to the user that the number is not valid
				System.out.println("You have not entered a valid number.");
				// Continue the infinite loop to get a valid number conversion
				continue;
			}
		}
		// Return number of pets user has entered
		return num;
	}

	/**
	 * Static Helper Method which asks usera specified question and as long as
	 * they give a valid number will return the number as an int type variable.
	 * 
	 * @return Number the user has chosen
	 */
	public static int getInt(String question)
	{
		// Local variable to hold temporary number
		int num;
		//
		while (true)
		{
			try
			{
				// Ask the user a question to get relative input
				System.out.print(question);
				// Set the number based on what the user enters on their
				// keyboard
				num = Integer.parseInt(scanner.nextLine());
				// Break out of the infinite loop
				break;
			}
			catch (NumberFormatException e)
			{
				// Output to the user that the number is not valid
				System.out.println("You have not entered a valid number.");
				// Continue the infinite loop to get a valid number conversion
				continue;
			}
		}
		// Return number of pets user has entered
		return num;
	}

	/**
	 * Static Helper Method which asks usera specified question and as long as
	 * they give a valid number will return the number as an int type variable.
	 * 
	 * @return Number the user has chosen
	 */
	public static String getString(String question)
	{
		// Local variable to hold temporary number
		String input;
		// print the question to user
		System.out.print(question);
		// get the user input
		input = scanner.nextLine();
		// Return number of pets user has entered
		return input;
	}

	/**
	 * Static Helper Method which asks user specified question and as long as
	 * they give a input will return a boolean type variable.
	 * 
	 * @return Boolean value based on user input
	 */
	public static String getString(String question, String... words)
	{
		while (true)
		{
			// Declare local variables
			boolean present = false;
			// Get the character using alternative method to get a char
			String input = RequestInput.getString(question);
			// iterate through supplied chars and see if it's present
			for (int i = 0; i < words.length; i++)
			{
				if (words[i].equals(input))
				{
					present = true;
				}
			}
			// if present variable is set to true and it's a valid option
			if (present == true)
			{
				// return the character
				return input;
			}
			else
			{
				// Give an error message
				System.out.println("You have not entered a valid character.");
				continue;
			}
		}
	}
}
