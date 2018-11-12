package tests;

import java.awt.event.MouseEvent;

import javax.swing.JPanel;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import klotski.boundary.KlotskiPanel;
import klotski.controller.MouseController;
import klotski.entity.Board;

public class MouseTests {
	
	@Test
	void TestSelection() {
		Board b = new Board();
		KlotskiPanel panel = new KlotskiPanel(b);
		MouseController mouseControl = new MouseController(b, panel);
		panel.addMouseListener(mouseControl);
		MouseEvent m = new FakeMouseEvent(panel,350,250);
		mouseControl.mousePressed(m);
		
		Assert.assertTrue(b.board[3][2].isSelected);
		
		//Testing clicking on a 
		m = new FakeMouseEvent(panel,50,50);
		mouseControl.mousePressed(m);
		Assert.assertTrue(b.board[0][0].isSelected);
		Assert.assertTrue(!b.board[3][2].isSelected);

		//Testing clicking on an empty square
		m = new FakeMouseEvent(panel,50,450);
		mouseControl.mousePressed(m);
		Assert.assertTrue(!b.board[0][0].isSelected);
		
	}
	

	/**
	 * Fake Mouse event to help test mouse clicks
	 *
	 */
	public class FakeMouseEvent extends MouseEvent{
		
		int X;
		int Y;
		
		public int getX()
		{
			return X;
		}
		public int geYX()
		{
			return Y;
		}
		
		public FakeMouseEvent(JPanel panel, int x, int y) {

			super(panel,0, 0, 0, x, y, 1, false);
			
			X = x;
			Y = y;
		}
		private static final long serialVersionUID = 1L;
	}
}
