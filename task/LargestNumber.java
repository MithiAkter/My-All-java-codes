package task;
public class LargestNumber{  
    public static void main(String[] args) {  
        int [] arr = new int [] {98,99,100,4,65,2,50,1000};  
         
        int max = arr[0];  
        
            for (int i = 0; i < arr.length; i++) {  
         
                if(arr[i] > max)  
                max = arr[i];  
        }  
        System.out.println("Largest element of array is: " + max);  
    }  
}  