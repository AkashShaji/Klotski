package klotski.entity;

public class PuzzlePiece {

	int height;
	int width;
	int rootX;
	int rootY;
	public boolean isSelected;
	
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
