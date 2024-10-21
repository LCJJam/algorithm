package searchAlgorithm;

import java.util.Random;

import Utils.ArrUtil;
import Utils.TimeUtil;

public class SearchAlgorithm {
	public void start(int range) {
		long elapsedTime;
		Random random = new Random();
		int searchNum = random.nextInt(range);
		int[] searchArr = ArrUtil.createSearchArr(searchNum,range);

		System.out.println("ns = 10^-9 s");
		// 선형 검색
		LinearSearch linearSearch = new LinearSearch();
		elapsedTime = TimeUtil.measureNanoTime(() -> linearSearch.search(searchArr, searchNum));
		System.out.println("linearSearch : Elapsed Time: " + elapsedTime + " ns");

		// 이진 탐색
		BinarySearch binarySearch = new BinarySearch();
		elapsedTime = TimeUtil.measureNanoTime(() -> binarySearch.search(searchArr, searchNum));
		System.out.println("binarySearch : Elapsed Time: " + elapsedTime + " ns");

		// 이진 트리 탐색
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		binarySearchTree.randomInit(range);
		elapsedTime = TimeUtil.measureNanoTime(() -> binarySearchTree.search(searchNum));
		System.out.println("binarySearchTree : Elapsed Time: " + elapsedTime + " ns");

	}
}
