import searchAlgorithm.SearchAlgorithm;
import sortedAlgorithm.SortedAlgorithm;

public class Main {
	public static void main(String[] args) {
		boolean sortedAlgorithmFlag = false;
		int sortedAlgorithmRange = 50000;

		boolean searchAlgorithmFlag = true;
		int searchAlgorithmRange = 20000000;

		if (sortedAlgorithmFlag) {
			SortedAlgorithm sortedAlgorithm = new SortedAlgorithm();
			sortedAlgorithm.start(sortedAlgorithmRange);
		}

		if (searchAlgorithmFlag) {
			SearchAlgorithm searchAlgorithm = new SearchAlgorithm();
			searchAlgorithm.start(searchAlgorithmRange);
		}


	}
}
