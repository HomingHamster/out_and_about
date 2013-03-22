/**
*	@author fef
*	represents time mode panel
*/

package gui;

import javax.swing.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class TimePanel extends JPanel{
	GridBagLayout gridBag;
    GridBagConstraints cons;
    JTextField arrvlTime;

    public TimePanel(){
    	gridBag = new GridBagLayout();
		cons = new GridBagConstraints();
		this.setLayout(gridBag);
		gridBag.layoutContainer(this);

		DefaultListModel prsnListContents = new DefaultListModel();
		prsnListContents.addElement("Person Personson");
		prsnListContents.addElement("Dude Dudeson");
		prsnListContents.addElement("Dude Personson");
		prsnListContents.addElement("Person Dudeson");
		prsnListContents.addElement("Person Personson");
		prsnListContents.addElement("Dude Dudeson");
		prsnListContents.addElement("Dude Personson");
		prsnListContents.addElement("Person Dudeson");
		prsnListContents.addElement("Person Personson");
		prsnListContents.addElement("Dude Dudeson");
		prsnListContents.addElement("Dude Personson");
		prsnListContents.addElement("Person Dudeson");
		prsnListContents.addElement("Person Personson");
		prsnListContents.addElement("Dude Dudeson");
		prsnListContents.addElement("Dude Personson");
		prsnListContents.addElement("Person Dudeson");
		prsnListContents.addElement("Person Personson");
		prsnListContents.addElement("Dude Dudeson");
		prsnListContents.addElement("Dude Personson");
		prsnListContents.addElement("Person Dudeson");
		prsnListContents.addElement("Person Personson");
		prsnListContents.addElement("Dude Dudeson");
		prsnListContents.addElement("Dude Personson");
		prsnListContents.addElement("Person Dudeson");
		prsnListContents.addElement("Person Personson");
		prsnListContents.addElement("Dude Dudeson");
		prsnListContents.addElement("Dude Personson");
		prsnListContents.addElement("Person Dudeson");
		prsnListContents.addElement("Person Personson");
		prsnListContents.addElement("Dude Dudeson");
		prsnListContents.addElement("Dude Personson");
		prsnListContents.addElement("Person Dudeson");
		prsnListContents.addElement("Person Personson");
		prsnListContents.addElement("Dude Dudeson");
		prsnListContents.addElement("Dude Personson");
		prsnListContents.addElement("Person Dudeson");

		//Make a button, add to grid (0,0) and watch for it being clicked
		JList prsnList = new JList(prsnListContents);
		JScrollPane scrollPane = new JScrollPane(prsnList);
    	cons.fill = GridBagConstraints.BOTH;
    	cons.gridx = 0;
    	cons.gridy = 0;
        cons.weighty = 3.0;
        cons.weightx = 1.0;
    	gridBag.setConstraints(scrollPane, cons);
    	this.add(scrollPane);

    	DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();

		//Make a button, add to grid (0,0) and watch for it being clicked.
    	arrvlTime = new JTextField();
		arrvlTime.setText(dateFormat.format(date));
    	cons.fill = GridBagConstraints.HORIZONTAL;
    	cons.anchor = GridBagConstraints.SOUTH;
    	cons.gridx = 0;
    	cons.gridy = 1;
        cons.weighty = 0.0;
        cons.weightx = 1.0;
    	gridBag.setConstraints(arrvlTime, cons);
    	this.add(arrvlTime);

		// void updateClockAction(){
		// }

		// Timer t = new Timer(1000, this.updateClockAction);
		// t.start();

		//Make a button, add to grid (0,0) and watch for it being clicked.
    	JButton submit = new JButton("Submit");
    	cons.fill = GridBagConstraints.HORIZONTAL;
    	cons.anchor = GridBagConstraints.SOUTH;
    	cons.gridx = 0;
    	cons.gridy = 2;
        cons.weighty = 0.0;
        cons.weightx = 1.0;
    	gridBag.setConstraints(submit, cons);
    	this.add(submit);
    	//submit.addActionListener(buttonListener);
    }
}