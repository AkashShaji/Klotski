package klotski.entity;

public class PuzzlePiece {

	public int height;
	public int width;
	public int rootX;
	public int rootY;
	public boolean isSelected;
	public boolean isKeyPiece;
	
	/**
	 * Initializes a puzzle piece
	 * @param height : the height of the piece
	 * @param width : the width of the piece
	 * @param x : x of the bottom right corner of the piece
	 * @param y : y of the bottom right corner of the piece
	 */
	PuzzlePiece( int x, int y,int w, int h){
		height = h;
		width = w;
		rootX = x;
		rootY = y;
		isSelected = false;
	}
	
	public String toString()
	{
		return(width + "," + height);
	}
	
	
	
}
