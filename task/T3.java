
package task;
public class T3 {
public static void main(String[] args) {
        int[] num = {11, 12, 13, 14, 25};
        int toFind = 27;
        boolean found = false;

        for (int n : num) {
            if (n == toFind) {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println(toFind + " is found.");
        else
            System.out.println(toFind + " is not found.");
    }
}