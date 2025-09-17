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
import java.util.Scanner;

class Logic {
    public static void matrixmultiplication(int arraySize, boolean disableDisplay){
        Random rand = new Random();

        int[][] a = new int[arraySize][arraySize];
        int[][] b = new int[arraySize][arraySize];
        int[][] c = new int[arraySize][arraySize];

        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                a[i][j] = rand.nextInt(100);
                b[i][j] = rand.nextInt(100);
            }
        }

        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                c[i][j] += a[i][j] * b[i][j];
            }
        }


        //Display
        if (disableDisplay != true) {
            System.out.println("Matrix A");
            for (int i = 0; i < arraySize; i++) {
                for (int j = 0; j < arraySize; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("\nMatrix B");
            for (int i = 0; i < arraySize; i++) {
                for (int j = 0; j < arraySize; j++) {
                    System.out.print(b[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("\nResultant Matrix C");
            for (int i = 0; i < arraySize; i++) {
                for (int j = 0; j < arraySize; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("===Matrix Display Was Turned Off!===");
            System.out.println("If this is an error, please check the function's parameters.");
            System.out.println("Rest Assured that the Operation is Done!");
        }
    }

    public static long fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void fibonacci(int n){
        long result = fib(n);
        System.out.println(result);
    }
}

public class ActivityFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter '1' for Matrix Multiplication\nEnter '2' for Fibonacci");
        String input = sc.nextLine();

        long startTime;
        long endTime;
        long duration;

        if (input.equals("1")) {
            System.out.println("Enter the size of the matrix you want to simulate matrix multiplication:");
            int size = sc.nextInt();

            startTime = System.nanoTime();
            Logic.matrixmultiplication(size, false);
            endTime = System.nanoTime();

            duration = (endTime - startTime) / 1000000;
            System.out.println("Execution time: " + duration + " ms");

        } else if (input.equals("2")) {
            System.out.println("Enter the number for the Fibonacci series:");
            int n = sc.nextInt();

            startTime = System.nanoTime();
            Logic.fibonacci(n);
            endTime = System.nanoTime();

            duration = (endTime - startTime) / 1000000;
            System.out.println("Execution time: " + duration + " ms");

        } else {
            System.out.println("Invalid Input, Goodbye!");
        }

        sc.close();
    }
}
