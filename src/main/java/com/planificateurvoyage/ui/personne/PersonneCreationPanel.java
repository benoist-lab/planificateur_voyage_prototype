package com.planificateurvoyage.ui.personne;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PersonneCreationPanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	
	public PersonneCreationPanel() {
		setLayout(null);
		
		JLabel lblTitre = new JLabel("Création d'une personne");
		lblTitre.setBounds(116, 5, 217, 25);
		lblTitre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(lblTitre);
		
		JLabel lblNewLabel = new JLabel("nom");
		lblNewLabel.setBounds(30, 63, 46, 14);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(86, 60, 135, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("pr\u00E9nom");
		lblNewLabel_1.setBounds(30, 88, 46, 14);
		add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(86, 85, 135, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.setBounds(30, 126, 89, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Annuler");
		btnNewButton_1.setBounds(132, 126, 89, 23);
		add(btnNewButton_1);
	}
}
