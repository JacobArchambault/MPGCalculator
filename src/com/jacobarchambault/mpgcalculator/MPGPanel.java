package com.jacobarchambault.mpgcalculator;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MPGPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextField gallonsValue; // To get gallons value
	private JTextField milesValue; // for miles input
	

	/**
	 * Constructor
	 */
	public MPGPanel() {
		// Initialize text fields.
		gallonsValue = new JTextField(
				10);
		milesValue = new JTextField(10);
		// Create a GridLayout manager.
		setLayout(
				new GridLayout(
						2,
						2));
		// Add the labels and text fields to this panel.
		add(
				new JLabel(
						"Total number of gallons:"));
		add(
				gallonsValue);
		add(new JLabel("Number of miles driven:"));
		add(milesValue);
	}

	public void showPropertyTax() {
		// Get the assessmentValue.
		double assessmentValue = Double.parseDouble(
				gallonsValue.getText()) * .6;
		// Get the property tax.
		double propertyTax = assessmentValue * .0064;
		// Display them.
		JOptionPane.showMessageDialog(
				null,
				String.format(
						"Assessment Value: $%,.2f\nProperty tax: $%,.2f",
						assessmentValue,
						propertyTax));
	}
}
