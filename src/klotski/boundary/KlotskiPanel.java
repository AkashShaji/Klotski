package klotski.boundary;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import klotski.entity.Board;
import klotski.entity.PuzzlePiece;

@SuppressWarnings("serial")
public class KlotskiPanel extends JPanel {

	Board board;

	public KlotskiPanel(Board b) {
		this.board = b;		
	}

	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.GRAY);
		super.paintComponent(g);
		g.fillRect(0,0,board.BOARD_WIDTH * 100 + 1,board.BOARD_HEIGHT * 100 + 1);
		
		for(int x = 0; x < board.BOARD_WIDTH; x++)
		{
			for(int y = 0; y < board.BOARD_HEIGHT; y++)
			{
				if(board.board[x][y] != null && board.board[x][y].rootX == x && board.board[x][y].rootY == y )
				{
					if(board.board[x][y].isSelected)
					{
						drawKlotskiBlock(g,Color.BLUE,board.board[x][y]);
					
					}
					else if(board.board[x][y].isKeyPiece)
					{
						drawKlotskiBlock(g,Color.RED,board.board[x][y]);
					}
					else
					{
						drawKlotskiBlock(g,Color.cyan,board.board[x][y]);
					}
				}
			}
		}
	}
	
	public void drawKlotskiBlock(Graphics g, Color c, PuzzlePiece p)
	{
		int gap = 2;
		g.setColor(Color.GRAY);
		g.fillRect(p.rootX * 100, p.rootY * 100, p.width * 100, p.height * 100);
		g.setColor(c);
		g.fillRect(p.rootX * 100+gap, p.rootY * 100+gap, p.width * 100-gap, p.height * 100-gap);
		
		
		
	}
}
