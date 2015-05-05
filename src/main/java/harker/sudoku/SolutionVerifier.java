package harker.sudoku;

import java.util.HashSet;
import java.util.Set;

public class SolutionVerifier {

	public static final int GRID_SIZE = 9;
	public static final int BOX_GRID_SIZE = 3;

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

		for (int boxLineNumber = 0; boxLineNumber < BOX_GRID_SIZE; boxLineNumber++) {
			for (int boxColumnNumber = 0; boxColumnNumber < BOX_GRID_SIZE; boxColumnNumber++) {
				int[] box = formBox(solution, boxLineNumber, boxColumnNumber);
				if (hasRepeats(box)) {
					return false;
				}
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

	private int[] formBox(int[][] solution, int lineNumber, int columnNumber) {
		int[] box = new int[GRID_SIZE];

		int leftBorder = columnNumber * BOX_GRID_SIZE;
		int rightBorder = (columnNumber + 1) * BOX_GRID_SIZE;
		int topBorder = lineNumber * BOX_GRID_SIZE;
		int bottomBorder = (lineNumber + 1) * BOX_GRID_SIZE;

		int index = 0;
		for (int currentLine = topBorder; currentLine < bottomBorder; currentLine++) {
			for (int currentColumn = leftBorder; currentColumn < rightBorder; currentColumn++) {
				box[index] = solution[currentLine][currentColumn];
				index++;
			}
		}

		return box;
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
