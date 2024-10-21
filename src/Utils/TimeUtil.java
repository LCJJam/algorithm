package Utils;

public class TimeUtil {
	public static long measureTime(Runnable task) {
		long startTime = System.currentTimeMillis();  // 시작 시간 기록
		// long startTime = System.nanoTime();  // 시작 시간 기록
		task.run();  // 작업 실행
		long endTime = System.currentTimeMillis();  // 끝 시간 기록
		// long endTime = System.nanoTime();  // 끝 시간 기록
		return endTime - startTime;  // 경과 시간 반환
	}
}
