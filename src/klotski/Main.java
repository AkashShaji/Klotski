package klotski;

import klotski.boundary.KlotskiApp;
import klotski.entity.*;

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
