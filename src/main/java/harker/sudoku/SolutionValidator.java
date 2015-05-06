package harker.sudoku;

public class SolutionValidator {

	private static final int GRID_SIZE = 9;

	public boolean validateSolutionFormat(int[][] solution) {
		if (solution == null) {
			return false;
		}

		if (solution.length != GRID_SIZE) {
			return false;
		}

		for (int[] line : solution) {
			if (line.length != GRID_SIZE) {
				return false;
			}
		}

		return true;
	}
}
