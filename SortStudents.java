/*(Sort students) Write a program that prompts the user to enter the number of stu-
dents, the students’ names, and their scores, and prints student names in decreasing
order of their scores */
package liang.seven;

import java.util.Scanner;

public class SortStudents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number of students:");
        int numOfStudents = input.nextInt();
        String[] names = new String[numOfStudents];
        int[] scores = new int[numOfStudents];
        System.out.println("Names and scores of the students:");
        for (int i = 0; i < numOfStudents; i++) {
            names[i] = input.next();
            scores[i] = input.nextInt();
        }
        selectionSort(scores, names);
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Student " + names[i] + " got " + scores[i] + " points.");
        }


    }
    public static void selectionSort (int[] list, String[] array){
        for (int i = 0; i < list.length - 1; i++) {
            int currentMax = list[i];
            int currentMaxIndex = i;
            String temp;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMax < list[j]) {
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }
            if (currentMaxIndex != i) {
                temp = array[i];
                array[i] = array[currentMaxIndex];
                array[currentMaxIndex]=temp;

                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
    }
}
