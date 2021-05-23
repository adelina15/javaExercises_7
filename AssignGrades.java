/* (Assign grades) Write a program that reads student scores, gets the best score,
and then assigns grades based on the following scheme:
Grade is A if score is Ú best - 10
Grade is B if score is Ú best - 20;
Grade is C if score is Ú best - 30;
Grade is D if score is Ú best - 40;
Grade is F otherwise.*/
package liang.seven;

import java.util.Scanner;

public class AssignGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int number = input.nextInt();
        System.out.println("Enter " + number + " scores:");
        int[] score = new int[number];
        char grade;
        int max = 0;
        for (int i = 0; i < number; i++) {
            score[i] = input.nextInt();
            if (score[i] > max) max = score[i];
        }
        for (int i = 0; i < number; i++) {
            if (score[i] >= max - 10) grade = 'A';
            else if (score[i] >= max - 20) grade = 'B';
            else if (score[i] >= max - 30) grade = 'C';
            else if (score[i] >= max - 40) grade = 'D';
            else grade = 'F';
            System.out.println("Student " + i + " score is " + score[i] + " and grade is " + grade);
        }
    }
}