package CodingChallenge8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingSort {

    //Given a collection of 1 million integers, all ranging between1 to 9, sort them in Big O(n) time

        public static void main(String[] args) {
            int[] array = {3, 1, 5, 2, 4, 1, 3, 2, 4, 5, 3, 1, 2, 4, 5, 2, 1, 3, 4, 5}; // Example array

            System.out.println("Original array: ");
            printArray(array);

            radixSort(array);

            System.out.println("Sorted array: ");
            printArray(array);
        }

        public static void radixSort(int[] array) {
            // Iterate through each digit (ones, tens, hundreds, etc.)
            for (int digit = 1; digit <= 9; digit++) {
                // Create 10 buckets (0 to 9)
                List<Integer>[] buckets = new ArrayList[10];
                for (int i = 0; i < 10; i++) {
                    buckets[i] = new ArrayList<>();
                }

                // Distribute the numbers into buckets based on the current digit
                for (int num : array) {
                    int digitValue = (num / digit) % 10;
                    buckets[digitValue].add(num);
                }

                // Rebuild the array by concatenating the buckets
                int index = 0;
                for (List<Integer> bucket : buckets) {
                    for (int num : bucket) {
                        array[index++] = num;
                    }
                }
            }
        }

        public static void printArray(int[] array) {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
