package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import org.junit.jupiter.api.Test;

import org.junit.Assert;

import klotski.boundary.KlotskiApp;
import klotski.boundary.KlotskiPanel;
import klotski.controller.MoveBlockController;
import klotski.entity.Board;

class MoveBlockTests {

	@Test
	void MovesMadeLblTest() {

		Board b = new Board();
		KlotskiApp k = new KlotskiApp(b);
		// veBlockController mbv = new MoveBlockController(b, new KlotskiPanel(b),
		// movesMade);
		Assert.assertEquals("Moves made: 0", k.lblMovesMade.getText());
		try {
			k.setVisible(true);
			Robot robot = new Robot();
			b.SelectPiece(2, 4);
			// Simulate a key press
			robot.keyPress(KeyEvent.VK_A);
			robot.keyRelease(KeyEvent.VK_A);
			
			Assert.assertEquals("Moves made: 1", k.lblMovesMade.getText());
			k.dispose();


		} catch (Exception e) {
			Assert.fail();
			k.dispose();
		}
		// Trying an illegal move

	}

}
