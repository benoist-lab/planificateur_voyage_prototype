package com.planificateurvoyage.ui.adresse;

import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdresseCreationPanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	
	public AdresseCreationPanel() {
		setLayout(null);
		
		JLabel lblTitre = new JLabel("Cr\u00E9ation d'une Adresse");
		lblTitre.setBounds(125, 5, 252, 25);
		lblTitre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(lblTitre);
		

		JLabel lblNewLabel = new JLabel("Libell\u00E9");
		lblNewLabel.setBounds(30, 50, 46, 14);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(113, 47, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ligne1");
		lblNewLabel_1.setBounds(30, 75, 46, 14);
		add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(113, 80, 293, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("ligne2");
		lblNewLabel_2.setBounds(30, 114, 46, 14);
		add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(113, 111, 293, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("ligne3");
		lblNewLabel_3.setBounds(30, 150, 46, 14);
		add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(113, 147, 293, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("code Postal");
		lblNewLabel_4.setBounds(30, 191, 80, 14);
		add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"29200", "76400"}));
		comboBox.setBounds(113, 187, 86, 22);
		add(comboBox);
		
		JLabel lblNewLabel_5 = new JLabel("ville");
		lblNewLabel_5.setBounds(209, 191, 46, 14);
		add(lblNewLabel_5);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Brest", "..."}));
		comboBox_1.setBounds(239, 187, 124, 22);
		add(comboBox_1);
		
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.setBounds(154, 266, 89, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Annuler");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(263, 266, 89, 23);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Ajouter");
		btnNewButton_2.setBounds(382, 187, 89, 23);
		add(btnNewButton_2);
	}
}
