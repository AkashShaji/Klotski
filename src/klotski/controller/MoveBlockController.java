package klotski.controller;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import klotski.boundary.KlotskiPanel;
import klotski.entity.Board;


@SuppressWarnings("serial")

public class MoveBlockController extends JPanel{
	
	Board board;
	KlotskiPanel klotskiPanel;
	JLabel movesMadeLbl;
	public KeyListener listener;
	
	/**
	 * 
	 * @param b : klotski board
	 * @param kp : panel to be repainted
	 * @param lbl : label indicating the number of moves made 
	 */
	public MoveBlockController(Board b, KlotskiPanel kp, JLabel movesLbl) {
		listener = new MoveBlockKeyListener();
		addKeyListener(listener);
		setFocusable(true);
		board = b;
		klotskiPanel = kp;
		movesMadeLbl = movesLbl;
	}
	
	/**
	 * KeyListener class for MoveBlockController
	 *
	 */
	public class MoveBlockKeyListener implements KeyListener {
		
		/**
		 * required for implementation
		 */
		@Override
		public void keyTyped(KeyEvent e) {
		}
		
		/**
		 * required for implementation
		 */
		@Override
		public void keyPressed(KeyEvent e) {
		}
		
		/**
		 * Moves the selected piece up, down, left or right 
		 * after user uses WASD or vim keybindings, then 
		 * repaints the panel and updates moves made.
		 */
		@Override
		public void keyReleased(KeyEvent e) {
			
			char key = (char)e.getKeyCode();
			if(key == 'H' | key == 'A' | e.getKeyCode() == KeyEvent.VK_LEFT)
			{
				board.MovePiece(-1,0);
			}
			else if (key == 'J' | key == 'S' | e.getKeyCode() == KeyEvent.VK_DOWN)
			{
				board.MovePiece(0,1);
				if(board.isWinState() && board.selectedPiece.isKeyPiece)
				{
					JOptionPane.showMessageDialog(klotskiPanel, "Congratulations, you won!");
				}

			}
			else if(key == 'K' | key == 'W' |e.getKeyCode() == KeyEvent.VK_UP)
			{
				board.MovePiece(0,-1);

			}
			else if(key == 'L' | key == 'D' |e.getKeyCode() == KeyEvent.VK_RIGHT)
			{
				board.MovePiece(1,0);

			}
			klotskiPanel.repaint();
			movesMadeLbl.setText("Moves made: " +  board.movesMade);
		}
	}


}
