package harker.sudoku;

import java.util.HashSet;
import java.util.Set;

public class SolutionVerifier {

	public static final int GRID_SIZE = 9;
	public static final int BOX_GRID_SIZE = 3;

	private SolutionPartsExtractor extractor = new SolutionPartsExtractor();

	public boolean verifySolution(int[][] solution) {
		for (int[] line : solution) {
			if (hasRepeats(line)) {
				return false;
			}
		}

		for (int columnNumber = 0; columnNumber < GRID_SIZE; columnNumber++) {
			int[] column = extractor.getColumn(solution, columnNumber);
			if (hasRepeats(column)) {
				return false;
			}
		}

		for (int boxLineNumber = 0; boxLineNumber < BOX_GRID_SIZE; boxLineNumber++) {
			for (int boxColumnNumber = 0; boxColumnNumber < BOX_GRID_SIZE; boxColumnNumber++) {
				int[] box = extractor.getBox(solution, boxLineNumber, boxColumnNumber);
				if (hasRepeats(box)) {
					return false;
				}
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
