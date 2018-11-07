package klotski;
import java.util.Arrays;

import klotski.entity.*;

public class Main {
	
	public static void main(String[] args) {
		
		Board b = new Board();
		System.out.println(b);
		b.SelectPiece(1,1);
		System.out.println(b);
		b.MovePiece(0,-1);
		System.out.println(b);
		b.MovePiece(0,-1);
		System.out.println(b);
		b.MovePiece(-1,0);
		System.out.println(b);
		b.MovePiece(1,0);
		System.out.println(b);
		
		b.SelectPiece(1,3);
		System.out.println(b);
		b.MovePiece(0,-1);
		System.out.println(b);
		b.MovePiece(-1,0);
		System.out.println(b);
	}
	
	
}
