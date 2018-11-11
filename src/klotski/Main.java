package klotski;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


import javax.swing.JFrame;

import org.junit.Assert;

import klotski.boundary.KlotskiApp;
import klotski.entity.*;
import klotski.controller.ExitApplicationController;

public class Main {
	/**
	 * Initiates a Klotski app and makes it visible
	 * @param args
	 */
	public static void main(String[] args) {		
		final KlotskiApp app = new KlotskiApp(new Board());
		app.setVisible(true);
	}
	
	
}
