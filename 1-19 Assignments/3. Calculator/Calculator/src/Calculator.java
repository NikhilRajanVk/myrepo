import java.util.Scanner;

public class Calculator
{
  
  
  private int add(int j,int k)
  
  {
      return j+k;
  
  }

  private int sub(int j,int k)
  
  {
      return j-k;
 
  }
  
  private int mult(int j,int k)

  {
      return j*k;

  }
  
  private double div(int j,int k)

  {
      return j/k;

  }

  public static void main(String[] args)
  {

   System.out.println("Calculator:");

   Scanner scan=new Scanner (System.in);
     
   Calculator calc=new Calculator();
  
   System.out.println("Enter Two Numbers");
    
   int a=scan.nextInt();
   
   int b=scan.nextInt();

   System.out.println("Choose From The Options 1.Add 2.Sutract 3.Multiply 4.Divide");
     
   int ch=scan.nextInt();
         
   switch(ch)
 
   {
        
     case 1: System.out.println("The summation of "+a+" and "+b+" is "+calc.add(a,b));
 
               break;
       
     case 2: System.out.println("The subtraction of "+a+" and "+b+" is "+calc.sub(a,b));
 
               break;
        
     case 3: System.out.println("The multiplication of "+a+" and "+b+" is "+calc.mult(a,b));
 
               break;
  
     case 4: System.out.println("The divison of "+a+" and "+b+" is "+calc.div(a,b));
 
               break;
  
     default:
 System.out.println("Invalid Choice");
 
   }
     
  }

}