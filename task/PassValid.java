
package task;

import java.util.Scanner;


public class PassValid{
    


public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter Password: ");
    String password = input.next();
    
    boolean len= true;
    boolean letter= true;
    boolean twodig= true;
    
       if (password.length() < 8) {   
         len = false;  
    } else {      
        char c;  
        int count = 0;   
        for (int i = 0; i < password.length(); i++) {  
            c = password.charAt(i);  
            if (!Character.isLetterOrDigit(c)) {          
                letter = false;  
            } else if (Character.isDigit(c)) {  
                count++;     
            }  
        }  
        if (count < 2)   {     
            twodig = false;  
        }  
    }  
    if(len ==true && letter == true && twodig == true)
    {
        System.out.println("This password is valid ");
    }
    else
    {
        System.out.println("This password is invalid");
    }
}
}