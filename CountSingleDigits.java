/* (Count single digits) Write a program that generates 100 random integers between
0 and 9 and displays the count for each number.*/
package liang.seven;

public class CountSingleDigits {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        int[] count = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);
            for (int j = 0; j < count.length; j++) {
                if (numbers[i] == j) count[j]++;
            }
        }

        for (int i = 0; i < count.length; i++) {
            System.out.println("Count of " + i + "s is " + count[i]);
        }
    }
}

