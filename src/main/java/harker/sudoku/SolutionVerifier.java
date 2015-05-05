package harker.sudoku;

import java.util.HashSet;
import java.util.Set;

public class SolutionVerifier {

	public static final int GRID_SIZE = 9;

	public boolean verifySolution(int[][] solution) {
		for (int[] line : solution) {
			if (hasRepeats(line)) {
				return false;
			}
		}

		for (int columnNumber = 0; columnNumber < GRID_SIZE; columnNumber++) {
			int[] column = formColumn(solution, columnNumber);
			if (hasRepeats(column)) {
				return false;
			}
		}

		return true;
	}

	private int[] formColumn(int[][] solution, int columnNumber) {
		int[] column = new int[GRID_SIZE];

		for (int lineNumber = 0; lineNumber < GRID_SIZE; lineNumber++) {
			column[lineNumber] = solution[lineNumber][columnNumber];
		}

		return column;
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
