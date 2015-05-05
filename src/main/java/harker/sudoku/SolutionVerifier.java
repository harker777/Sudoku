package harker.sudoku;

import java.util.HashSet;
import java.util.Set;

public class SolutionVerifier {

	public boolean verifySolution(int[][] solution) {
		for (int[] line : solution) {
			if (hasRepeats(line)) {
				return false;
			}
		}

		return true;
	}

	private boolean hasRepeats(int[] line) {
		Set<Integer> encounteredInts = new HashSet<>();
		for (int cell : line) {
			if (cell != 0) {
				if (encounteredInts.contains(cell)) {
					return true;
				} else {
					encounteredInts.add(cell);
				}
			}
		}
		return false;
	}
}
