
package task;

public class Replace_Value {

public static void main(String[] args) {
		
		String s = "AdRgiKoPFerWQbb"; 
		int i, n;
		char c;
		String z = "";

		for (i = 0; i<s.length(); i++) {
                    c = s.charAt(i);
			if (c >= 97 && c<= 122) //If ASCII values represent LowerCase, changing to Upper Case
			{
                            n = c - 32;
				c = (char) n;
			}
			z = z + c;
                        }
		System.out.println("\nUpper Case: " + z);
		
		}
		
	}

