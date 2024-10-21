package sortedAlgorithm;

import Utils.ArrUtil;
import Utils.TimeUtil;

public class SortedAlgorithm {
	public void start(int range) {
		long elapsedTime;

		// 버블정렬 Time Complexity O(n²)
		BubbleSort bubbleSort = new BubbleSort();
		int[] bubbleSortedArr = ArrUtil.createArr(range);
		elapsedTime = TimeUtil.measureTime(() -> bubbleSort.sort(bubbleSortedArr));
		System.out.println("bubbleSort : Elapsed Time: " + elapsedTime + " ms");

		// 선택정렬 Time Complexity O(n²)
		SelectionSort selectionSort = new SelectionSort();
		int[] selectionSortedArr = ArrUtil.createArr(range);
		elapsedTime = TimeUtil.measureTime(() -> selectionSort.sort(selectionSortedArr));
		System.out.println("selectionSort : Elapsed Time: " + elapsedTime + " ms");

		// 삽입 Time Complexity O(n²)
		InsertionSort insertionSort = new InsertionSort();
		int[] insertionSortedArr = ArrUtil.createArr(range);
		elapsedTime = TimeUtil.measureTime(() -> insertionSort.sort(insertionSortedArr));
		System.out.println("insertionSort : Elapsed Time: " + elapsedTime + " ms");

		// 병합정렬 Time Complexity O(log(n))
		MergeSort mergeSort = new MergeSort();
		int[] mergeSortedArr = ArrUtil.createArr(range);
		elapsedTime = TimeUtil.measureTime(() -> mergeSort.sort(mergeSortedArr,0,mergeSortedArr.length-1));
		System.out.println("mergeSort : Elapsed Time: " + elapsedTime + " ms");

		// 퀵 정렬 Time Complexity O(log(n))
		QuickSort quickSort = new QuickSort();
		int[] quickSortedArr = ArrUtil.createArr(range);
		elapsedTime = TimeUtil.measureTime(() -> quickSort.sort(quickSortedArr,0,quickSortedArr.length-1));
		System.out.println("mergeSort : Elapsed Time: " + elapsedTime + " ms");

	}
}
