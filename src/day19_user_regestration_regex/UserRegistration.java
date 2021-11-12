package day19_user_regestration_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	static Scanner scanner = new Scanner(System.in);

	/*
	 * Method for First name first letter should be Captial
	 */
	public static void validFirstName() {

		System.out.println("Enter First Name:");
		String name = scanner.next();
		String regex = "^[A-Z]{1}[a-z]*";

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(name);
		boolean r = m.matches();

		if (r)
			System.out.println("First name is valid");
		else
			System.out.println("First name is !Invalid");

	}

	/*
	 * Method for Last Name, last name must have 3 letters or more then that First
	 * letter must have Captial letter
	 */
	public static void validLastName() {

		System.out.println("Enter Last Name:");
		String lname = scanner.next();
		String regex = "^[A-Z]{1}[a-z]{2,}$";

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(lname);
		boolean r = m.matches();

		if (r)
			System.out.println("Last name is valid");
		else
			System.out.println("Last name is !Invalid");

	}

}
