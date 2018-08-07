import java.util.Scanner;

public class DispDiv {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The Number To Show Its Divisors");
		int n =scan.nextInt();
		System.out.println("The divisors of "+n+" are : ");
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				System.out.print(i+ " ");
		}
		System.out.println();
	}

}