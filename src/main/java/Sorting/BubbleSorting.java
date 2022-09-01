package Sorting;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BubbleSorting {
    public static void main(String[] args) {

        int[] numbers = new int[10000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }

        long before1 = System.currentTimeMillis();
        int[] numbers1 = Arrays.stream(numbers).sorted().toArray();
        System.out.println("\n" + Arrays.toString(numbers1));
        long after1 = System.currentTimeMillis();
        System.out.println(after1 - before1 + " милисекунд");
        long before = System.currentTimeMillis();
        System.out.println(before);

        System.out.println("\n" + "==============================" + "\n");

        sorting(numbers);
        long after = System.currentTimeMillis();
        System.out.println(Arrays.toString(numbers));
        System.out.println(after);
        System.out.println(after - before + " милисекунд");

    }

    public static void sorting(int[] numbers) {
        boolean isItSorted = false;
        while (!isItSorted) {
            isItSorted = true;

            for (int i = numbers.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {

                    if (numbers[j] > numbers[j + 1]) {
                        int temporal = numbers[j];
                        numbers[j] = numbers[j + 1];
                        numbers[j + 1] = temporal;
                        isItSorted = false;
                    }
                }
            }
        }
    }
}
