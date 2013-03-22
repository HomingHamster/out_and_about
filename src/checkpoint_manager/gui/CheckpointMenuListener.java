/**
*	@author fef
*	Listeners for the menubar
*/

package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckpointMenuListener implements ActionListener{
	public void actionPerformed(ActionEvent actionEvent)
	{
		String actionCommand = actionEvent.getActionCommand();
	
		if(actionCommand.equals("Quit")){
			System.exit(0);
		}
	
		else if (actionCommand.equals("Save")){
		}
	
		else if (actionCommand.equals("Open")){
		}
	}
}