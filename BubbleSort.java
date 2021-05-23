/*(Bubble sort) Write a sort method that uses the bubble-sort algorithm. The bubble-
sort algorithm makes several passes through the array. On each pass, successive
neighboring pairs are compared. If a pair is not in order, its values are swapped;
otherwise, the values remain unchanged. The technique is called a bubble sort or
sinking sort because the smaller values gradually “bubble” their way to the top
and the larger values “sink” to the bottom. Write a test program that reads in ten
double numbers, invokes the method, and displays the sorted numbers. */
package liang.seven;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] array = new double[10];
        System.out.println("Enter 10 numbers:(ex. 9,9)");
        for (int i = 0; i<array.length; i++){
            array[i] = input.nextDouble();
        }
        bubbleSorted(array);
        for (double e: array)
            System.out.print(e + " ");
    }
    public static void bubbleSorted (double[] array){
        for (int j = 0; j<array.length; j++){
            for (int i = 0; i<array.length-1; i++){
                if (array[i+1] < array[i]){
                    double temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
    }
}
