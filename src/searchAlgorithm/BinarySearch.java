package searchAlgorithm;

public class BinarySearch {
	public int search(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == key) {
				return mid;  // 찾은 경우 인덱스 반환
			}
			if (arr[mid] < key) {
				low = mid + 1;  // 오른쪽 부분 탐색
			} else {
				high = mid - 1;  // 왼쪽 부분 탐색
			}
		}
		return -1;  // 못 찾은 경우 -1 반환
	}
}
