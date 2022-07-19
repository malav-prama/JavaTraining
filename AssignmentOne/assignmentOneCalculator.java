import java.util.*;

public class assignmentOneCalculator
{
   public static void main(String[] args)
   {
      System.out.println("Enter number one");
      Scanner inputOne=new Scanner(System.in);
      int num1=inputOne.nextInt();
   
      System.out.println("Enter number two");
      Scanner inputTwo=new Scanner(System.in);
      int num2=inputTwo.nextInt();
   
      System.out.println("What operation?");
      Scanner inputThree=new Scanner(System.in);
      String operation=inputThree.next();
   
   
      if(operation.equals("add"))
      {
         int result=num1+num2;
         System.out.println("Addition of num 1 and num 2 is: "+result);
      
      }
        if(operation.equals("subtract"))
      {
         int result=num1+num2;
         System.out.println("Subtraction of num 1 and num 2 is: "+result);
      
      }
        if(operation.equals("multiply"))
      {
         int result=num1+num2;
         System.out.println("Multiplication of num 1 and num 2 is: "+result);
      
      }
        if(operation.equals("divide"))
      {
         int result=num1+num2;
         System.out.println("Division of num 1 and num 2 is: "+result);
      
      }
   }


}