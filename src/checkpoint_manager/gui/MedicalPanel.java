/**
*	@author fef
*	represents medical mode panel
*/

package gui;

import javax.swing.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class MedicalPanel extends JPanel
				implements ItemListener{
	GridBagLayout gridBag;
    GridBagConstraints cons;
    JTextField arrvlTime, dprtTime;
    JCheckBox retired;

    public MedicalPanel(){
    	gridBag = new GridBagLayout();
		cons = new GridBagConstraints();
		this.setLayout(gridBag);
		gridBag.layoutContainer(this);

		DefaultListModel prsnListContents = new DefaultListModel();
		prsnListContents.addElement("Person Personson");
		prsnListContents.addElement("Dude Dudeson");

		//Make a button, add to grid (0,0) and watch for it being clicked
		JList prsnList = new JList(prsnListContents);
		JScrollPane scrollPane = new JScrollPane(prsnList);
    	cons.fill = GridBagConstraints.BOTH;
    	cons.gridx = 0;
    	cons.gridy = 0;
        cons.weighty = 3.0;
        cons.weightx = 1.0;
        cons.gridwidth = 3;
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
        cons.gridwidth = 3;
    	gridBag.setConstraints(arrvlTime, cons);
    	this.add(arrvlTime);

    	dprtTime = new JTextField();
		dprtTime.setText(dateFormat.format(date));
    	cons.fill = GridBagConstraints.HORIZONTAL;
    	cons.anchor = GridBagConstraints.SOUTH;
    	cons.gridx = 0;
    	cons.gridy = 2;
        cons.weighty = 0.0;
        cons.weightx = 1.0;
        cons.gridwidth = 1;
    	gridBag.setConstraints(dprtTime, cons);
    	this.add(dprtTime);

    	JLabel retiredLabel = new JLabel("or Retired?");
    	cons.fill = GridBagConstraints.HORIZONTAL;
    	cons.anchor = GridBagConstraints.SOUTH;
    	cons.gridx = 1;
    	cons.gridy = 2;
        cons.weighty = 0.0;
        cons.weightx = 0.0;
        cons.gridwidth = 1;
    	gridBag.setConstraints(retiredLabel, cons);
    	this.add(retiredLabel);

    	retired = new JCheckBox();
    	cons.fill = GridBagConstraints.HORIZONTAL;
    	cons.anchor = GridBagConstraints.SOUTH;
    	cons.gridx = 2;
    	cons.gridy = 2;
        cons.weighty = 0.0;
        cons.weightx = 0.0;
        cons.gridwidth = 1;
    	gridBag.setConstraints(retired, cons);
    	retired.addItemListener(this);
    	this.add(retired);

		// void updateClockAction(){
		// }

		// Timer t = new Timer(1000, this.updateClockAction);
		// t.start();

		//Make a button, add to grid (0,0) and watch for it being clicked.
    	JButton submit = new JButton("Submit");
    	cons.fill = GridBagConstraints.HORIZONTAL;
    	cons.anchor = GridBagConstraints.SOUTH;
    	cons.gridx = 0;
    	cons.gridy = 3;
        cons.weighty = 0.0;
        cons.weightx = 1.0;
        cons.gridwidth = 3;
    	gridBag.setConstraints(submit, cons);
    	this.add(submit);
    	//submit.addActionListener(buttonListener);
    }
    public void itemStateChanged(ItemEvent e) {
	    Object source = e.getItemSelectable();

	    if (source == retired) {
		    if (e.getStateChange() == ItemEvent.DESELECTED){		    	
		    	this.dprtTime.setEditable(true);
		    } else if (e.getStateChange() == ItemEvent.SELECTED){
		    	this.dprtTime.setEditable(false);
		    }
		}
	        
	}
}