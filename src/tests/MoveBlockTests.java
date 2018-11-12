package tests;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.Assert;
import klotski.boundary.KlotskiApp;
import klotski.entity.Board;

class MoveBlockTests {

	@Test
	//Verifying that key presses work
	void MovesMadeLblTest() {

		Board b = new Board();
		KlotskiApp k = new KlotskiApp(b);
		Assert.assertEquals("Moves made: 0", k.lblMovesMade.getText());
		try {
			k.setVisible(true);
			Robot robot = new Robot();
			b.SelectPiece(2, 4);
			// Simulate a key press
			
			robot.keyPress(KeyEvent.VK_D);
			robot.keyRelease(KeyEvent.VK_D);
			
			robot.keyPress(KeyEvent.VK_W);
			robot.keyRelease(KeyEvent.VK_W);
			
			robot.keyPress(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_S);
			
			robot.keyPress(KeyEvent.VK_A);
			robot.keyRelease(KeyEvent.VK_A);
			
			TimeUnit.MILLISECONDS.sleep(100);
			Assert.assertEquals("Moves made: 1", k.lblMovesMade.getText());
			k.dispose();


		} catch (Exception e) {
			Assert.fail("Application errored");
			k.dispose();
		}
	}
	
	@Test
	//Making sure blocks that can't move aren't being moved
	void IllegalMovesTest() {

		Board b = new Board();
		b.SelectPiece(0, 0);
		String initConfig = b.toString();
		b.SelectPiece(1, 1);
		b.MovePiece(-1,0);
		b.SelectPiece(0, 0);
		Assert.assertEquals(initConfig, b.toString());
		b.SelectPiece(2, 4);
		b.MovePiece(1,0);
		b.SelectPiece(0, 0);
		Assert.assertEquals(initConfig,b.toString());
		b.SelectPiece(3, 2);
		b.MovePiece(0,1);
		b.SelectPiece(0, 0);
		Assert.assertEquals(initConfig,b.toString());
		
	}
	
	@Test
	//Verifying the win check works
	void TestWin() {
		//Clearing the board to make it easier to 'solve'
		Board b = new Board();
		for(int x = 0; x < 4; x++) {
			for(int y = 0; y < 5; y++) {
				if(b.board[x][y] != null && !b.board[x][y].isKeyPiece)
					b.board[x][y] =null;
			}
		}
		Assert.assertTrue(!b.isWinState());
		b.SelectPiece(3,2);
		b.MovePiece(-1, 2);
		Assert.assertTrue(b.isWinState());
	}
	

}
