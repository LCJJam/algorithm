package searchAlgorithm;

public class LinearSearch {
	public int search(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;  // 찾은 경우 인덱스 반환
			}
		}
		return -1;  // 못 찾은 경우 -1 반환
	}
}
