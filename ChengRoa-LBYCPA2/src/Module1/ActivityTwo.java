/**
 * Author: John Carlo Cheng Roa
 * Institution: De La Salle University
 * College: Gokongwei College of Engineering
 * Department: Department of Electronics and Computer Engineering
 * Course: LBYCPA2
 * Section: EQ3
 * Date Created: 9/10/2025
 * Date Submitted: 9/11/2025
 * **/

package Module1;
import java.util.Random;

public class ActivityTwo {
    public static void main(String args[]) {
        int[] Array = new int[100];
        Random random = new Random();
        for (int i = 0; i < Array.length; i++) {
            Array[i] = random.nextInt(1000);
        }

        int greatest = Array[0];
        for (int i = 1; i < Array.length; i++) {
            if (Array[i] > greatest) {
                greatest = Array[i];
            }
        }

        for (int j = 1; j < Array.length; j++) {
            System.out.print(Array[j] + " ");
        }
        System.out.println("\nGreatest Value is " + greatest);
    }
}
