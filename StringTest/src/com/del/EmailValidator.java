package com.del;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

	private Pattern pattern;
	private Matcher matcher;
	private String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z] {2,})$";
	
	
	//^ = start of line
	//() = one group
	//\d{n} = match n digits, where n!=0
	//-? = match a dash, optional
	//$ = end of line

	public EmailValidator() {
		pattern = Pattern.compile(regex);
	}

	public static void main(String[] args) {
		EmailValidator idv = new EmailValidator();
		Scanner scan = new Scanner(System.in);
		// While for multiple times

		System.out.println("Enter the Email");
		String input = scan.nextLine();

		boolean valid = idv.validate(input);
		System.out.println("Email valid: " + valid);
	}

	private boolean validate(String input) {

		boolean valid = false;
		matcher = pattern.matcher(input);
		valid = matcher.matches();
		return valid;
	}

}
