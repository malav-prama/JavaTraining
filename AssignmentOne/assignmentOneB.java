
import java.util.*;

public class assignmentOneB
{
   public static void main(String[] args)
   {
   
      Scanner sc= new Scanner(System.in);
      int input = sc.nextInt();
   
      oddEven(input);
      System.out.println("Prime? "+prime(input));
      System.out.print("Palindrome? "+palindrome(input));
   
   }
   
   public static void oddEven(int input)
   {
      if(input%2==0) {
         System.out.println("Even");
      }
      else
      {
         System.out.println("Odd");
      }
   }
   
   public static boolean prime(int input)
   {
   
      boolean isPrime=true;
   
      if (input==1 || input==0 || input<0)
      {
         isPrime=false;
         return isPrime;
        
      }
      
      else
      {
         for(int i=2;i<=input/2;i++)
         {
            int temp=input%i;
            if(temp==0)
            {
               isPrime=false;
               break;
            }
         }
      return isPrime;
      }
   }
   
   public static boolean palindrome(int input)
   {
      int sum=0;
      int temp=input;
      if(temp>=0){
         while(temp!=0){
            int remainder=temp%10;
            sum=sum*10+remainder;
            temp=temp/10;
         }
        if(sum==input){
             return true;
       }
      }
      return false;
  }
}
