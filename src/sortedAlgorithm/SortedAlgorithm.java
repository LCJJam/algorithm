package sortedAlgorithm;

import Utils.TimeUtil;

public class SortedAlgorithmStart {
	public void start(int range) {
		long elapsedTime;
		// 버블정렬 Time Complexity O(n²)
		BubbleSort bubbleSort = new BubbleSort();
		int[] bubbleSortedArr = getArr(range);
		elapsedTime = TimeUtil.measureTime(() -> bubbleSort.sort(bubbleSortedArr));
		// System.out.println("Sorted array: " + Arrays.toString((bubbleSortedArr)));
		System.out.println("bubbleSort : Elapsed Time: " + elapsedTime + " ms");

		// 선택정렬 Time Complexity O(n²)
		SelectionSort selectionSort = new SelectionSort();
		int[] selectionSortedArr = getArr(range);
		elapsedTime = TimeUtil.measureTime(() -> selectionSort.sort(selectionSortedArr));
		// System.out.println("Sorted array: " + Arrays.toString((selectionSortedArr)));
		System.out.println("selectionSort : Elapsed Time: " + elapsedTime + " ms");

		// 병합정렬 Time Complexity O(log(n))
		MergeSort mergeSort = new MergeSort();
		int[] mergeSortedArr = getArr(range);
		elapsedTime = TimeUtil.measureTime(() -> mergeSort.sort(mergeSortedArr,0,mergeSortedArr.length-1));
		System.out.println("selectionSort : Elapsed Time: " + elapsedTime + " ms");
	}
}
