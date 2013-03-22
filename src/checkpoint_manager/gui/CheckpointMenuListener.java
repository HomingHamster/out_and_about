/**
*	@author fef
*	Listeners for the menubar
*/

package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckpointMenuListener implements ActionListener{
	CheckpointFrame baseFrame;
	MedicalPanel medicalPanel;
	TimePanel timePanel;

	public CheckpointMenuListener(CheckpointFrame baseFrame, 
				MedicalPanel medicalPanel, 
				TimePanel timePanel){
		this.baseFrame = baseFrame;
		this.medicalPanel = medicalPanel;
		this.timePanel = timePanel;
	}

	public void actionPerformed(ActionEvent actionEvent)
	{
		String actionCommand = actionEvent.getActionCommand();
	
		if(actionCommand.equals("Quit")){
			System.exit(0);
		}
	
		else if (actionCommand.equals("Change to Medical Mode")){
			this.baseFrame.remove(this.timePanel);
			this.baseFrame.add(this.medicalPanel);			
            this.baseFrame.invalidate();
            this.baseFrame.validate();
            this.baseFrame.repaint();
		}
	
		else if (actionCommand.equals("Change to Time Mode")){
			this.baseFrame.remove(this.medicalPanel);
			this.baseFrame.add(this.timePanel);		
            this.baseFrame.invalidate();
            this.baseFrame.validate();
            this.baseFrame.repaint();
		}
	}
}