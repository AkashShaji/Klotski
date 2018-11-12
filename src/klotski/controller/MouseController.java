package klotski.controller;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import klotski.boundary.KlotskiPanel;
import klotski.entity.Board;

public class MouseController extends MouseAdapter  {

	Board board;
	KlotskiPanel klotskiPanel;
	/**
	 * Constructor
	 * @param b : a klotski board
	 * @param kp : the klotski panel
	 */
	public MouseController(Board b, KlotskiPanel kp) {
		board = b;
		klotskiPanel = kp;
	}
	
	/**
	 * Selects a piece and repaints the panel on mouseclick
	 */
	@Override
	public void mousePressed(MouseEvent me) {
		board.SelectPiece((int)me.getX()/100, (int)me.getY()/100);
		klotskiPanel.repaint();
	}


}
