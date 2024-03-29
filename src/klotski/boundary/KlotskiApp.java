package klotski.boundary;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import klotski.controller.ExitApplicationController;
import klotski.controller.MouseController;
import klotski.controller.MoveBlockController;
import klotski.controller.ResetPuzzleController;
import klotski.entity.Board;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class KlotskiApp extends JFrame {

	private JPanel contentPane;
	public JLabel lblMovesMade;
			
	/**
	 * Create the frame.
	 */
	public KlotskiApp(Board b) {
		
		//Initialize the main frame
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 600);
		contentPane = new JPanel();
		contentPane.setPreferredSize(new Dimension(401, 501));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		

		
		//Label for moves made
		lblMovesMade = new JLabel("Moves made: 0");
		lblMovesMade.setFocusable(false);
		
		//Klotski pannel for the puzzle pieces
		JPanel panel = new KlotskiPanel(b);
		panel.addMouseListener(new MouseController(b, (KlotskiPanel)panel));
		panel.setSize(new Dimension(401, 501));
		
		//Adding key listener to frame
		panel.add(new MoveBlockController(b, (KlotskiPanel) panel, lblMovesMade));		


		//Reset puzzle button
		JButton resetApplication = new JButton("Reset Game");
		resetApplication.setFocusable(false);
		resetApplication.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e) {
						new ResetPuzzleController(b,(KlotskiPanel)panel).resetPuzzle();
					}
				});

		//Adding confirmation to both the close buttons
		JButton closeApplication = new JButton("Close");
		closeApplication.setFocusable(false);
		closeApplication.addActionListener( new ActionListener()
			{
				public void actionPerformed(ActionEvent e) {
					new ExitApplicationController(KlotskiApp.this).windowClosing();
				}
		});
		addWindowListener (new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				new ExitApplicationController(KlotskiApp.this).windowClosing();;
			}
		});
		
		//Creating the pane
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(33)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblMovesMade)
						.addComponent(resetApplication))
					.addGap(150)
					.addComponent(closeApplication, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
					.addGap(21))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblMovesMade)
								.addComponent(closeApplication, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
							.addGap(23))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(resetApplication)
							.addContainerGap())))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
