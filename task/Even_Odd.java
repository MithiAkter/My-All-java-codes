
package task;

import java.util.Scanner;

public class Even_Odd {
public static boolean isEven(int num) 
    { 
        if ( num % 2 == 0 ) 
            return true; 
        else
            return false; 
    } 
      
   
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        if(isEven(num) == true) 
            System.out.print("Even"); 
        else
            System.out.print("Odd");  
    
    
    }
    
}
 