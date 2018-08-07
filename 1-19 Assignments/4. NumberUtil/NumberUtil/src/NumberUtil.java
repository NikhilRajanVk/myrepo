import java.util.Scanner;
import java.lang.Math;

public class NumberUtil {
	private void product(int a, int b) {
		System.out.println("The product of " + a + " and " + b + " is :" + (a * b));
	}

	private void squareroot(double a) {
		double sq = Math.sqrt(a);
		System.out.println("The square root of " + a + " is " + sq);
	}

	public static void main(String[] args) {
		NumberUtil nu = new NumberUtil();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers To Find The Product:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		nu.product(num1, num2);
		System.out.println("Enter A Number To Find The Square Root");
		double num3 = sc.nextDouble();
		nu.squareroot(num3);
	}
}