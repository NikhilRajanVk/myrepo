package com.del;

import java.util.Scanner;

import com.del.service.Addition;
import com.del.service.Arithmetic;
import com.del.service.Division;
import com.del.service.Multiplication;
import com.del.service.Subtraction;

public class Calculator {

	public static void main(String[] args) {

		System.out.println("Calculator");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 0 for Addition");
		System.out.println("Enter 1 for Subtraction");
		System.out.println("Enter 2 for Multiplication");
		System.out.println("Enter 3 for Division");
		System.out.println("Choose Operation");
		int choice = scan.nextInt();

		Arithmetic arr[] = { new Addition(), new Subtraction(), new Multiplication(), new Division() };
		arr[choice].read();

	}

	
}
