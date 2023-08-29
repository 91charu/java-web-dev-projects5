package src.org.launchcode;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 5, 8};
        System.out.println("All numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("\nOdd numbers:");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }

        String text = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = text.split(" ");

        System.out.println("\nArray of words:");
        System.out.println(Arrays.toString(words));
    }
}
