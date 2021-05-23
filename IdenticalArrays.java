package liang.seven;

import java.util.Scanner;

public class IdenticalArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter list1:");
        int[] list1 = new int[input.nextInt()];
        for (int i=0; i<list1.length; i++){
            list1[i] = input.nextInt();
        }
        System.out.println("Enter list2:");

        int[] list2 = new int[input.nextInt()];
        for (int i=0; i<list2.length; i++){
            list2[i] = input.nextInt();
        }
        if (isEqual(list1, list2)) System.out.println("Two lists are identical");
        else System.out.println("Two lists are not identical");

    }
    public static boolean isEqual(int[] array, int[] array2){
        selectionSort(array);
        selectionSort(array2);
        if (array.length != array2.length) return false;
        for (int i = 0; i<array.length; i++){
            if (array[i] != array2[i]) return false;
        }
        return true;
    }
    public static void selectionSort(int[] array) {
        for (int i = 0; i<array.length - 1; i++) {
            int currentMin = array[i];
            int currentMinIndex = i;
            for (int j = i + 1; j<array.length; j++) {
                if (currentMin > array[j]) {
                    currentMin = array[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                array[currentMinIndex] = array[i];
                array[i] = currentMin;
            }
        }
    }
}
