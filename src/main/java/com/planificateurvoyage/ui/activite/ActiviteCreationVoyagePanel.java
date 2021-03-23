package com.planificateurvoyage.ui.activite;

import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class ActiviteCreationVoyagePanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	public ActiviteCreationVoyagePanel() {
		setLayout(null);
		
		JLabel lblTitre = new JLabel("Création d'une activité");
		lblTitre.setBounds(125, 5, 200, 25);
		lblTitre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(lblTitre);
		
		JLabel lblNewLabel = new JLabel("categorie");
		lblNewLabel.setBounds(28, 50, 70, 14);
		add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Transport", "H\u00E9bergement", "Restauration", "Loisir"}));
		comboBox.setBounds(108, 41, 109, 22);
		add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("libell\u00E9");
		lblNewLabel_1.setBounds(28, 75, 70, 14);
		add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(108, 72, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("adresse");
		lblNewLabel_2.setBounds(28, 100, 70, 14);
		add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(108, 97, 241, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("cout");
		lblNewLabel_3.setBounds(28, 125, 70, 14);
		add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(108, 122, 86, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Euros");
		lblNewLabel_4.setBounds(203, 125, 46, 14);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Description");
		lblNewLabel_5.setBounds(28, 150, 70, 14);
		add(lblNewLabel_5);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(108, 153, 241, 68);
		add(textArea);
		
		
		JLabel lblNewLabel_6 = new JLabel("Date d\u00E9but");
		lblNewLabel_6.setBounds(28, 240, 70, 14);
		add(lblNewLabel_6);
		
		textField_3 = new JTextField();
		textField_3.setBounds(108, 237, 124, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("D");
		btnNewButton_2.setBounds(242, 236, 27, 23);
		add(btnNewButton_2);
		
		JLabel lblNewLabel_7 = new JLabel("Date fin");
		lblNewLabel_7.setBounds(28, 265, 46, 14);
		add(lblNewLabel_7);
		
		textField_4 = new JTextField();
		textField_4.setBounds(108, 268, 124, 20);
		add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("D");
		btnNewButton_3.setBounds(242, 269, 27, 18);
		add(btnNewButton_3);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.setBounds(160, 328, 89, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Annuler");
		btnNewButton_1.setBounds(259, 328, 89, 23);
		add(btnNewButton_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("forfaitaire");
		chckbxNewCheckBox.setBounds(242, 121, 97, 23);
		add(chckbxNewCheckBox);

	}
}
