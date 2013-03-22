/**
*	@author fef
*	represents medical mode panel
*/

package gui;

import javax.swing.*;

public class MedicalPanel extends JPanel{
	GridBagLayout gridBag;
    GridBagConstraints cons;

    public MedicalPanel{
    	gridBag = new GridBagLayout();
		cons = new GridBagConstraints();
		this.setLayout(gridBag);
		gridBag.layoutContainer(this);

		
    }
}