package klotski.controller;

import klotski.boundary.KlotskiPanel;
import klotski.entity.Board;

public class ResetPuzzleController {

	Board board;
	KlotskiPanel klotskiPanel;

	public ResetPuzzleController(Board b, KlotskiPanel kp) {
		board = b;
		klotskiPanel = kp;
	}

	/**
	 * Resets the puzzle
	 */
	public void resetPuzzle() {
		board.reset(Board.config.DEFAULT);
		klotskiPanel.repaint();
	}
}
