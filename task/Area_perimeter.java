
package task;

public class Area_perimeter {

  
    public static void main(String[] strings) {
        
       double h=8.5;
       double w=5.6;
       
       double peri=2*(h+w);
       double area=(h*w);
       
       
       System.out.printf("The perimeter is 2*(%.1f+%.1f)=%.2f\n",h,w,peri);
       System.out.printf("The area is (%.1f*%.1f)=%.2f\n",h,w,area);
    }
    
}
