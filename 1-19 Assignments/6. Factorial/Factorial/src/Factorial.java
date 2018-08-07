import java.util.Scanner;
public class Factorial
{
 private int Factorial(int n)
 {
  int f=1,i;
  for(i=1;i<=n;i++)
  {
   f=f*i;
  }
  return f;
 }
 public static void main(String[] args)
 {
  Factorial fact=new Factorial();
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter A Number ");
  int num=scan.nextInt();
  System.out.println("The factorial of "+num+" is : "+fact.Factorial(num));
 }
}