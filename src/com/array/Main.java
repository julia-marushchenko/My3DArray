package com.array;
import java.util.Random;

/**
 * <h1>3 Dimentional Array</h1>
 * Main class consists method to print 3-dimentional array
 * to console.
 *
 * @author Julia Marushchenko
 * @version 1.0
 * @since 2025-05-13
 */
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating the array
        int [][][] array = new int[2][3][2];

        // Filling the array with random numbers
        for (int index = 0; index < array.length; index++){
            for (int index1 = 0; index1 < array[0].length; index1++){
                for (int index2 = 0; index2 < array[0][0].length; index2++){
                    array[index][index1][index2] = new Random().nextInt();
                }
            }
        }

        // Printing the array to console
        for (int index = 0; index < array.length; index++){
            for (int index1 = 0; index1 < array[0].length; index1++){
                for (int index2 = 0; index2 < array[0][0].length; index2++){
                    System.out.print(array[index][index1][index2] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}