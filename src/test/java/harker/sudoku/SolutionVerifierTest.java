package harker.sudoku;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionVerifierTest {

	private SolutionVerifier testInstance = new SolutionVerifier();

	private int[][] validSolution = {
			{1, 0, 0, 0, 0, 0, 0, 0, 0},
			{5, 2, 0, 0, 8, 0, 9, 7, 0},
			{0, 4, 3, 7, 0, 0, 0, 0, 0},
			{0, 0, 0, 4, 0, 0, 0, 0, 0},
			{0, 1, 2, 0, 5, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 6, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 7, 0, 0},
			{0, 6, 7, 0, 0, 0, 0, 8, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 9},
	};

	// Second line has duplicating 5
	private int[][] solutionWithInvalidLine = {
			{1, 0, 0, 0, 0, 0, 0, 0, 0},
			{5, 2, 0, 5, 8, 0, 9, 7, 0},
			{0, 4, 3, 7, 0, 0, 0, 0, 0},
			{0, 0, 0, 4, 0, 0, 0, 0, 0},
			{0, 1, 2, 0, 5, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 6, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 7, 0, 0},
			{0, 6, 7, 0, 0, 0, 0, 8, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 9},
	};

	// Third column has duplicating 2
	private int[][] solutionWithInvalidColumn = {
			{1, 0, 0, 0, 0, 0, 0, 0, 0},
			{5, 2, 0, 0, 8, 0, 9, 7, 0},
			{0, 4, 3, 7, 0, 0, 0, 0, 0},
			{0, 0, 0, 4, 0, 0, 0, 0, 0},
			{0, 1, 2, 0, 5, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 6, 0, 0, 0},
			{0, 0, 2, 0, 0, 0, 7, 0, 0},
			{0, 6, 7, 0, 0, 0, 0, 8, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 9},
	};

	@Test
	public void shouldSolutionVerifierReturnTrueOnValidSolutionPassed() {
		assertTrue(testInstance.verifySolution(validSolution));
	}

	@Test
	public void shouldSolutionVerifierReturnFalseOnSolutionWithInvalidLinePassed() {
		assertFalse(testInstance.verifySolution(solutionWithInvalidLine));
	}

	@Test
	public void shouldSolutionVerifierReturnFalseOnSolutionWithInvalidColumnPassed() {
		assertFalse(testInstance.verifySolution(solutionWithInvalidColumn));
	}
}