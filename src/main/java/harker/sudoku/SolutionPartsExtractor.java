package harker.sudoku;

public class SolutionPartsExtractor {

	private static final int GRID_SIZE = 9;
	private static final int BOX_GRID_SIZE = 3;

	public int[] getColumn(int[][] solution, int columnNumber) {
		int[] column = new int[GRID_SIZE];

		for (int lineNumber = 0; lineNumber < GRID_SIZE; lineNumber++) {
			column[lineNumber] = solution[lineNumber][columnNumber];
		}

		return column;
	}

	public int[] getBox(int[][] solution, int boxLineNumber, int boxColumnNumber) {
		int[] box = new int[GRID_SIZE];

		int leftBorder = boxColumnNumber * BOX_GRID_SIZE;
		int rightBorder = (boxColumnNumber + 1) * BOX_GRID_SIZE;
		int topBorder = boxLineNumber * BOX_GRID_SIZE;
		int bottomBorder = (boxLineNumber + 1) * BOX_GRID_SIZE;

		int index = 0;
		for (int currentLine = topBorder; currentLine < bottomBorder; currentLine++) {
			for (int currentColumn = leftBorder; currentColumn < rightBorder; currentColumn++) {
				box[index] = solution[currentLine][currentColumn];
				index++;
			}
		}

		return box;
	}


}
