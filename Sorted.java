/*(Sorted?) Write the following method that returns true if the list is already sorted
in increasing order.
 public static boolean isSorted(int[] list)
Write a test program that prompts the user to enter a list and displays whether
the list is sorted or not. Note that the first number in the
input indicates the number of the elements in the list. This number is not part
of the list*/
package liang.seven;

import java.util.Scanner;

public class Sorted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter list:");
        int number = input.nextInt();
        int[] array = new int[number];
        for (int i = 0; i<array.length; i++){
            array[i] = input.nextInt();
        }
        if (isSorted(array)) System.out.println("The list is already sorted");
        else System.out.println("The list is not sorted");
    }
    public static boolean isSorted(int[] list){
        int[] list2 = new int[list.length];
        System.arraycopy(list, 0, list2, 0, list.length);
        selectionSort(list);
        return java.util.Arrays.equals(list, list2);
    }
    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }

    }
}
