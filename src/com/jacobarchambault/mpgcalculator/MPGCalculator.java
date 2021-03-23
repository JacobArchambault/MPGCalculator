package com.jacobarchambault.mpgcalculator;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class MPGCalculator extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private MPGPanel mPGPanel; // A panel for entering miles and gallons data

	/**
	 * Constructor
	 */
	public MPGCalculator(
			String title) {
		super(
				title);
		// Specify what happens when the close button is clicked.
		setDefaultCloseOperation(
				WindowConstants.EXIT_ON_CLOSE);
		buildMPGPanel();
		// Build the panel that contains the calculate button.
		buildButtonPanel();
		// Pack and display the window.
		pack();
		setVisible(
				true);
	}

	/**
	 * The buildButtonPanel method creates a panel containing the button for
	 * calculating mpg.
	 */
	private void buildButtonPanel() {
		// Create a button to calculate MPG.
		JButton calcButton = new JButton(
				"Calculate MPG");
		// Add an action listener to the button.
		calcButton.addActionListener(e -> mPGPanel.showMPG());
		// Put the button in its own panel.
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(
				calcButton);
		add(
				buttonPanel,
				BorderLayout.SOUTH);

	}

	private void buildMPGPanel() {
		// Create a MPGPanel object.
		mPGPanel = new MPGPanel();
		// Add it to the content pane.
		add(
				mPGPanel,
				BorderLayout.CENTER);
	}

}
