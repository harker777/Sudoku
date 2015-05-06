package harker.sudoku;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

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

	private int[][] solutionWithNotEnoughLines = {
			{3, 0, 0, 0, 0, 0, 0, 0, 0}
	};

	private int[][] solutionWithTooManyLines = {
			{3, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 1, 4, 5, 2, 0, 0, 0, 0},
			{2, 0, 5, 0, 0, 1, 0, 0, 0},
			{0, 4, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 6, 0, 0, 0, 0, 0, 0},
			{0, 2, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 2, 0, 0, 0, 0, 0, 0, 0},
	};

	@Test
	public void shouldValidateSolutionReturnTrueOnValidSolutionPassed() {
		assertTrue(testInstance.validateSolutionFormat(someSolution));
	}

	@Test
	public void shouldValidateSolutionReturnFalseOnNullPassed() {
		assertFalse(testInstance.validateSolutionFormat(null));
	}

	@Test
	public void shouldValidateSolutionReturnFalseOnSolutionWithNotEnoughLinesPassed() {
		assertFalse(testInstance.validateSolutionFormat(solutionWithNotEnoughLines));
	}

	@Test
	public void shouldValidateSolutionReturnFalseOnSolutionWithTooManyLinesPassed() {
		assertFalse(testInstance.validateSolutionFormat(solutionWithTooManyLines));
	}
}