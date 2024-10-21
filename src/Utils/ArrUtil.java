package Utils;

import java.util.Random;

public class ArrUtil {
	// arr init
	public static int[] createArr(int range) {
		int[] arr = new int[range];  // 100개의 정수를 저장할 배열
		Random random = new Random();

		// 배열에 무작위 값 넣기 (예: 0 ~ 1000 사이의 랜덤 값)
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(1000000);  // 0 ~ 999 사이의 값 생성
		}

		return arr;
	}
}
