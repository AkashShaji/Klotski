package klotski;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


import javax.swing.JFrame;

import klotski.boundary.KlotskiApp;
import klotski.entity.*;
import klotski.controller.ExitApplicationController;

public class Main {
	
	public static void main(String[] args) {
		
		/*Board b = new Board();
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
		System.out.println(b);*/
		
		Board b = new Board();

		final KlotskiApp app = new KlotskiApp(b);
		app.addWindowListener (new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				new ExitApplicationController(app).windowClosing(null);;
			}

		});

		// Tell app window that we will be responsible for closing application  
		app.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		app.setResizable(false);
		app.setVisible(true);
	}
	
	
}
