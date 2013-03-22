/**
*	@author fef
*	Defines the frame for use by staff at checkpoint.
*/

package gui;

import javax.swing.*;


public class CheckpointFrame extends JFrame {

	public CheckpointFrame(){
		//make sure application finishes when this frame
		//is closed.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//set the menu as the one defined in CheckpointMenu
		JMenuBar menuBar = new CheckpointMenu();
		setJMenuBar(menuBar);

		//set the window properties
		setSize(600,480);
		setLocation(50,50);

		//create panel from class and add to frame.
		// CheckpointPanel checkpointpanel = new CheckpointPanel();
		// add(checkpointpanel);

		// set app title and make visible.
		setTitle("Checkpoint Manager Application");
		setVisible(true); 

	}

}