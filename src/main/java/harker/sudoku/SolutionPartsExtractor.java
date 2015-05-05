package harker.sudoku;

public class SolutionPartsExtractor {

	public static final int GRID_SIZE = 9;

	public int[] getColumn(int[][] solution, int columnNumber) {
		int[] column = new int[GRID_SIZE];

		for (int lineNumber = 0; lineNumber < GRID_SIZE; lineNumber++) {
			column[lineNumber] = solution[lineNumber][columnNumber];
		}

		return column;
	}
}
