import java.util.Scanner;
public class ChkPrime
{
 private boolean checkprime(int n)
 {
  int i;
  if(n<2)
   return false;
  for(i=2;i<n;i++)
  {
   if(n%i==0)
    return false;
  }
  return true;
 }
 public static void main(String[] args)
 {
  ChkPrime pn=new ChkPrime();
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter A Number To Check Prime");
  int num=scan.nextInt();
  boolean prime=false;
  prime=pn.checkprime(num);
  if(prime==true)
   System.out.println("It's A Prime Number");
  else
   System.out.println("It's Not A Prime Number");
 }
}