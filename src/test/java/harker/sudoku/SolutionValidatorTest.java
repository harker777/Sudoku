package harker.sudoku;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SolutionValidatorTest {

	private SolutionValidator testInstance = new SolutionValidator();

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
	public void shouldValidateSolutionReturnTrueIfSolutionIsValid() {
		assertTrue(testInstance.validateSolutionFormat(someSolution));
	}
}