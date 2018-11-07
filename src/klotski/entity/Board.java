package klotski.entity;

import java.util.ArrayList;

public class Board {
	
	//Allows for more configurations to eventually be added
	enum config {
		DEFAULT
	}
	
	//Puzzle Pieces are stored in the following format:
	// x,y,width,height
	final int[][] DEFAULT_CONFIG = new int [][] {
			{0,0,1,1},
			{3,0,1,1},
			{0,1,1,2},
			{1,1,1,1},
			{2,1,1,1},
			{3,1,1,2},
			{1,2,2,1},
			{0,3,1,2},
			{1,3,2,2},
			{3,3,1,2}
	};
	
	public PuzzlePiece[][] board;
	
	public ArrayList<PuzzlePiece> pieces;
	
	public PuzzlePiece selectedPiece;
	
	/**
	 * Initializes a board
	 * @param c
	 */
	public Board(config c){
		board = new PuzzlePiece[4][5];
		pieces = new ArrayList<PuzzlePiece>();
		switch(c)
		{
			default:
				for(int[] piece : DEFAULT_CONFIG)
				{
					PlacePiece(new PuzzlePiece(piece[0],piece[1],piece[2],piece[3]));
				}	
		}
	}
	
	public Board(){
		this(config.DEFAULT);
	}
	
	/**
	 * Places a piece object in the specified location
	 * @param x, x coordinate of the bottom left corner
	 * @param y, y coordinate of the bottom left corner
	 * @param width, width of the piece
	 * @param height, height of the piece
	 */
	public void PlacePiece(PuzzlePiece p){
		for(int x = 0; x < p.width; x++) {
			for(int y = 0; y < p.height; y++){
				board[x + p.rootX][y + p.rootY] = p;
			}
		}
			
	}

	/**
	 * Moves the selected piece in a given direction if no collisions occur
	 * @param deltaX, the change in x of the piece
	 * @param deltaY, the change in y of the piece
	 */
	public void MovePiece(int deltaX, int deltaY ){
		//checks to see if piece is selected and whether or not the piece would be out of bounds
		
		if(selectedPiece != null &&
				selectedPiece.rootX + selectedPiece.width + deltaX < 4 &&
				selectedPiece.rootY + selectedPiece.height + deltaY < 5 &&
				selectedPiece.rootX + deltaX >= 0 &&
				selectedPiece.rootY + deltaY >= 0)
		{

			
			//Checking to see if the piece can be moved
			boolean canMove = true;
			
			
			for(int x = selectedPiece.rootX + deltaX; x < selectedPiece.width + selectedPiece.rootX + deltaX; x++)
			{
				for(int y = selectedPiece.rootY + deltaY; y < selectedPiece.height + selectedPiece.rootY + deltaY; y++)
				{
					//If collision is detected, don't move
					if((board[x][y] != null) && (!board[x][y].isSelected))
					{
						canMove = false;
					}
				}
			}
			if(canMove) {
			
				//Clear the piece from the board
				for(int x = 0; x < selectedPiece.width; x++) {
					for(int y = 0; y < selectedPiece.height; y++){
						board[x + selectedPiece.rootX][y + selectedPiece.rootY] = null;
					}
				} 
				//Change the root of the piece
				selectedPiece.rootX +=deltaX;
				selectedPiece.rootY += deltaY;
				//Place the piece
				PlacePiece(selectedPiece);
				

			}
		}		
		
	}
	
	
	/**
	 * Deselects the currently selected piece and selects the piece and the given coordinate
	 */
	public void SelectPiece(int x,int y) {
		if(selectedPiece != null)
		{
			selectedPiece.isSelected = false;
		}
		board[x][y].isSelected = true;
		selectedPiece = board[x][y];
	}
	
	/**
	 * toString for testing purposes
	 */
	public String toString()
	{
		String ret = "";
		for(int y = board[0].length -1; y >= 0;y--)
		{
			for(int x = 0; x<board.length;x++)
			{
				if(board[x][y] != null)
				{
					if(board[x][y].isSelected)
					{
						ret+="sel";
					}
					else
					{
						ret+= board[x][y]; 
					}
				}
				ret+="\t";
			}
			ret+="\n";
		}
		return ret;
	}
		
}
