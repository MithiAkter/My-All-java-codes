
package task;


public class VNBP_CountvowlConsonant {

        
    public static void main(String[] args) {    
            
          
        int ACount = 0, BCount = 0;    
            
        
        String str = "EUNOIASITMG";  
             
            
             for(int i = 0; i < str.length(); i++) {    
             
                if(str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {    
                  
                ACount++;    
            }    
               
            else if(str.charAt(i) >= 'A' && str.charAt(i)<='Z') {      
                  
                BCount++;    
            }    
        }    
        System.out.println("Number of vowels: " + ACount);    
        System.out.println("Number of consonants: " + BCount);    
    }    
}   
    
    

