
import java.util.*;

public class assignmentOneB
{
   public static void main(String[] args)
   {
   
      Scanner sc= new Scanner(System.in);
      int input = sc.nextInt();
   
      oddEven(input);
      prime(input);
      System.out.print(palindrome(input));
   
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
