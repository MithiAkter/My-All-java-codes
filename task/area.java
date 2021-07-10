
package task;

import java.util.Scanner;

public class area {
double C (double r)
    {
    double result;
    result=3.14*r*r;
    return result;
    }
    
    double T (double B, double H)
    {
    double result;
    result=0.5*B*H;
    return result;
    }
    
    double S (double a )
    {
    double result;
    result=a*a;
    return result;
    }
    
    
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        area obj=new area();
        int n;
        
        System.out.println("Enter 1 for Circle, 2 for Triangle , 3 for Square\n:");
        n=input.nextInt();
        
       if(n==1)
       {
       double r;
       System.out.println("Enter Radious:");
       r=input.nextDouble();
       System.out.print("Your Radious is=");
       System.out.println(obj.C(r));
       }
       
       
       else if(n==2)
       {
       double B,H;
       System.out.println("Enter Base:");
       B=input.nextDouble();
       System.out.println("Enter Height:");
       H=input.nextDouble();
       System.out.println(obj.T(B,H));
       } 
       
       
       else if (n==3)
       {
       double a;
       System.out.println("Enter Side:");
       a=input.nextDouble();
       System.out.println(obj.S(a));
       } 
      
       
      else{
      System.out.println("Number is invalid");
      }
      
        
        
        
    } 
        
    
    }
    

