/**
*	@author fef
*	Class defines menu for CheckpointFrame
*/

package gui;

import javax.swing.*;

public class CheckpointMenu extends JMenuBar{
	//Create menus for menubar
	private JMenu file = new JMenu("File");
	private JMenu checkpoint = new JMenu("Checkpoint Settings");

	//Create options for file menu
	private JMenuItem quit = new JMenuItem("Quit");

	//create options for checkpoint settings menu.
	private JMenuItem medical_mode = new JMenuItem("Change to Medical Mode");
	private JMenuItem time_mode = new JMenuItem("Change to Time Mode");

	public CheckpointMenu(){
		// instantiate listener
		CheckpointMenuListener listener = new CheckpointMenuListener();
		this.add(file);
		this.add(checkpoint);

		// add quit option to file menu and
		// set listener to listen for clicks.
		file.add(quit);
		quit.addActionListener(listener);

		//add medical_mode option to 
		checkpoint.add(medical_mode);
		medical_mode.addActionListener(listener);

		checkpoint.add(time_mode);
		time_mode.addActionListener(listener);

		setVisible(true);
	}
}