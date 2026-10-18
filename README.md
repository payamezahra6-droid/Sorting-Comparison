# Sorting Algorithms Comparison in Java

## 📌 Description
This project compares the performance of four sorting algorithms implemented in Java: **Selection Sort, Insertion Sort, Bubble Sort, and Merge Sort**. Each algorithm sorts the same randomly generated data, and its execution time is measured to analyze and compare performance.

## 🎯 Objective
The objective of this project is to understand different sorting algorithms, measure their execution times, and compare their efficiency using the same input data.

## ⚙️ Algorithms Implemented
1. **Selection Sort** – Finds the smallest element from the unsorted portion and places it in the correct position.
2. **Insertion Sort** – Inserts each element into its correct position within the sorted portion.
3. **Bubble Sort** – Compares adjacent elements and swaps them if they are in the wrong order.
4. **Merge Sort** – Divides the array into smaller parts, sorts them, and merges them back together.

## ✨ Features
- Generates random integer data.
- Uses the same original array for a fair comparison.
- Creates separate copies of the input array for each algorithm.
- Measures execution time in nanoseconds and milliseconds.
- Checks whether each algorithm correctly sorts the array.
- Displays a performance comparison in the console.

## 🛠️ Technologies Used
- Java
- IntelliJ IDEA

## ⏱️ Time and Space Complexity

| Algorithm | Best Case | Average Case | Worst Case | Space |
|---|---|---|---|---|
| Selection Sort | O(n²) | O(n²) | O(n²) | O(1) |
| Insertion Sort | O(n) | O(n²) | O(n²) | O(1) |
| Bubble Sort | O(n²) | O(n²) | O(n²) | O(1) |
| Merge Sort | O(n log n) | O(n log n) | O(n log n) | O(n) |

*Note: These complexities correspond to the implementations used in this project, including Bubble Sort without early-stop optimization.*

## ▶️ How to Run
1. Open the project in IntelliJ IDEA.
2. Make sure all five Java classes are in the same project:
   - `SelectionSort.java`
   - `InsertionSort.java`
   - `BubbleSort.java`
   - `MergeSort.java`
   - `Comparison.java`
3. Open `Comparison.java`.
4. Run its `main()` method.
5. Compare the execution times and sorting correctness shown in the console.

## 📊 Expected Findings
- Merge Sort generally performs better on larger arrays because its time complexity is O(n log n).
- Selection Sort and Bubble Sort generally require more operations as the array size increases.
- Insertion Sort can perform efficiently on small or nearly sorted arrays.
- Actual execution times may vary between runs due to system conditions and JVM behavior.

## 👨‍💻 Author
**PAYAM E ZAHRA**
