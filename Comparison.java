
import java.util.Arrays;
import java.util.Random;

public class Comparison {

    public static void main(String[] args) {

        int size = 1000;
        int[] original = new int[size];

        Random random = new Random();

        // Generate one random dataset
        for (int i = 0; i < size; i++) {
            original[i] = random.nextInt(10000);
        }

        // Give each algorithm the same data
        int[] selectionArray = Arrays.copyOf(original, size);
        int[] insertionArray = Arrays.copyOf(original, size);
        int[] bubbleArray = Arrays.copyOf(original, size);
        int[] mergeArray = Arrays.copyOf(original, size);

        // Selection Sort
        long start = System.nanoTime();
        SelectionSort.sort(selectionArray);
        long selectionTime = System.nanoTime() - start;

        // Insertion Sort
        start = System.nanoTime();
        InsertionSort.sort(insertionArray);
        long insertionTime = System.nanoTime() - start;

        // Bubble Sort
        start = System.nanoTime();
        BubbleSort.sort(bubbleArray);
        long bubbleTime = System.nanoTime() - start;

        // Merge Sort
        start = System.nanoTime();
        MergeSort.mergeSort(mergeArray, 0, mergeArray.length - 1);
        long mergeTime = System.nanoTime() - start;

        // Display results
        System.out.println("===== SORTING COMPARISON =====");
        System.out.println("Array Size: " + size);
        System.out.println();

        printResult("Selection Sort", selectionTime, selectionArray);
        printResult("Insertion Sort", insertionTime, insertionArray);
        printResult("Bubble Sort", bubbleTime, bubbleArray);
        printResult("Merge Sort", mergeTime, mergeArray);
    }

    static void printResult(String name, long time, int[] arr) {
        System.out.println(name);
        System.out.println("Execution Time: " + time + " ns");
        System.out.println("Execution Time: "
                + time / 1_000_000.0 + " ms");
        System.out.println("Sorted Correctly: " + isSorted(arr));
        System.out.println("------------------------------");
    }

    static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
