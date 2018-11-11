package klotski.controller;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

/**
 * Controller to confirm request to exist application.
 */
public class ExitApplicationController {

	JFrame app;

	/**
	 * Constructor
	 * @param app : application that needs the controller
	 */
	public ExitApplicationController(JFrame app) {
		this.app = app;
	}

	/**
	 * Asks the user if they would like the exit application and closes it
	 * @param e : unused
	 */
	public void windowClosing() {
		int c = JOptionPane.showConfirmDialog (app, "Do you wish to exit Klotski?");

		if (c == JOptionPane.OK_OPTION) {
			app.setVisible(false);
			app.dispose();
		}

	}

}


