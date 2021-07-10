
package task;

import java.util.Scanner;
class factorialNumber 
    {

      public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the number:");
      int num = scanner.nextInt();
      int factorial = fact(num); //Called the user defined function fact
      System.out.println("Factorial of entered number is: "+factorial);
    }
      
      
      static int fact(int n)
   {
       int result;
       if(n==1){
         return 1;
       }
       
       result= fact(n-1)* n; //Recursion: Function calling itself!!
       return result;
   }
   
}