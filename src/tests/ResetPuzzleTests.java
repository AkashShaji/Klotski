package tests;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

import klotski.boundary.KlotskiPanel;
import klotski.controller.ResetPuzzleController;
import klotski.entity.Board;

class ResetPuzzleTests {

	/**
	 * Testing the reset function
	 */
	@Test
	void TestSimpleReset() {
		Board b = new Board();
		ResetPuzzleController resetController = new ResetPuzzleController(b, new KlotskiPanel(b));
		String initConfig = b.toString();
		b.SelectPiece(2, 4);
		b.MovePiece(-1,0);		
		Assert.assertNotEquals(initConfig, b.toString());
		
		resetController.resetPuzzle();
		
		Assert.assertEquals(initConfig,b.toString());
	}
}
