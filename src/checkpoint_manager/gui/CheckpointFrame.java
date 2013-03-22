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

		MedicalPanel medicalPanel = new MedicalPanel();
		TimePanel timePanel = new TimePanel();

		//set the menu as the one defined in CheckpointMenu
		JMenuBar menuBar = new CheckpointMenu(this, medicalPanel, timePanel);
		setJMenuBar(menuBar);

		//set the window properties
		setSize(600,480);
		setLocation(50,50);

		//create panel from class and add to frame.
		// CheckpointPanel checkpointpanel = new CheckpointPanel();
		add(timePanel);

		// set app title and make visible.
		setTitle("Checkpoint Manager Application");
		setVisible(true); 

	}

}