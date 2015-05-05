package harker.sudoku;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionPartsExtractorTest {

	private SolutionPartsExtractor testInstance = new SolutionPartsExtractor();

	private int[][] someSolution = {
			{3, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 1, 4, 5, 2, 0, 0, 0, 0},
			{2, 0, 5, 0, 0, 1, 0, 0, 0},
			{0, 4, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 6, 0, 0, 0, 0, 0, 0},
			{0, 2, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0},
	};

	@Test
	public void testGetColumn() {
		int[] expectedResult = {0, 4, 5, 0, 6, 0, 0, 0, 0};
		int[] actualResult = testInstance.getColumn(someSolution, 2);

		assertArrayEquals(expectedResult, actualResult);
	}
}