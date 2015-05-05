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

	@Test
	public void shouldSolutionVerifierReturnTrueOnValidSolutionPassed() {
		assertTrue(testInstance.verifySolution(validSolution));
	}
}