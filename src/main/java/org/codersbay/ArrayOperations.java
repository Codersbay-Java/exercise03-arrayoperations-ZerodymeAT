package org.codersbay;

import java.util.Arrays;

/**
 * Utility class which performs various operations with integer arrays.
 */
public class ArrayOperations {
    private final int[] numbers;      // array that needs to be sorted.
    private final int[] unsorted;     // reference array which stays unsorted.

    public ArrayOperations(int[] numbers) {
        this.numbers = numbers;
        this.unsorted = numbers.clone();
    }

    /* **********************************************************
     *   Please implement the following methods.                 *
     *   It is intended that they are not static.                *
     * ***********************************************************/

    /**
     * Prints out the numbers array.
     */

    public void print() {
//        System.out.println(Arrays.toString(numbers));
        System.out.print("[");
        for (int number: numbers){
            System.out.print(number + " ");
        }
        System.out.print("]");
    }

    /**
     * @return the sorted numbers array.
     * @see <a href="sorting algortihms">http://faculty.cs.niu.edu/~hutchins/csci241/sorting.htm</a>
     */
    public int[] sort() {
        int[] sortieren = numbers;
        for (int i = 0; i < sortieren.length; i++) {
            for (int j = 0; j < sortieren.length; j++) {
                if (sortieren[i] < sortieren[j]){
                    int tmp = 0;
                    tmp = sortieren[j];
                    sortieren[j] = sortieren[i];
                    sortieren[i] = tmp;
                }
            }
        }
        return sortieren;
    }
    /**
     * @return the sorted array in reverse order
     */
    public int[] revertSort() {
        int[] reverseSort = sort();
        for (int i = 0; i < reverseSort.length; i++){
            for (int j = 0; j < reverseSort.length; j++) {
                if (reverseSort[i] > reverseSort[j]){
                    int tmp2 = 0;
                    tmp2 = reverseSort[j];
                    reverseSort[j] = reverseSort[i];
                    reverseSort[i] = tmp2;
                }
            }
        }
        return reverseSort;


    }

    /**
     * @return the unsorted array in reverted order.
     */
    public int[] reverted() {
        int revertedNumbers[] = new int[numbers.length];
        int j = numbers.length-1;
//        numbers[0] = revertedNumbers[9];
        for (int i = 0; i < revertedNumbers.length; i++ ) {
            revertedNumbers[i] = numbers[j];
//            System.out.println(i + "= i // j =" + j);
            j = j-1;
        }
        return revertedNumbers;
    }


    /**
     * @param value which should be searched for.
     * @return true if the array contains the value, false otherwise.
     */
    public boolean contains(int value) {
        for (int i = 0; i < numbers.length; i++){
//            System.out.println("Is on pos " + i + " which is " + numbers[i] +" == " + value + "? -" + (numbers[i] == value));
            if (numbers[i] == value) {
                return true;
            }
        }
        return false;
//        for (int number : numbers) {
//            if (number == value) return true;
//        }
//        return false;
    }

    /**
     * @return the average value of all elements summed up.
     */
    public double average() {
        double sum = 0.0;
        for (int number: numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    /**
     * @return the average value of all elements summed up, but without the highest and the lowest value.
     */
    public double trimmedMean() {
        int[] trimmed = new int[numbers.length - 2];
        int[] sorted = sort();
        int j  = 0;
        for (int i = 1; i < sorted.length - 1; i++) {
            trimmed[j++] = sorted[i];
        }

        return average(trimmed);
    }

    /**
     * @return the max value of the array. In the array [1,9,3] max would be 9.
     */
    public int maxValue() {
        return sort()[numbers.length - 1];
            }

    /**
     * @return the min value of the array. In the array [1,9,3] min would be 1.
     */
    public int minValue() {
        return sort()[0];
    }

    /* **********************************************************
     *   Feel free to add as many private helper methods as      *
     *   you like.                                               *
     * ***********************************************************/

    private int someHelper(int[] tmp) {
        return 1;
    }
    private double average(int[] average){
        double sum = 0.0;
        for (int number : average) {
            sum += number;
        }
        return sum / average.length;
    }
}