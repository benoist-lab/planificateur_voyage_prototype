package com.planificateurvoyage.ui.adresse;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class AdresseConsultationPanel extends JPanel {
	
	////////////
	private String data[][]={ {"1","Orly","","","","","",""},    
			{"2","Appartement","28 rue du cheval","","","29200","Brest"},    
			{"3","piscine Plouf","rue du port","","","29200","Brest"},    
			{"4","Théate des Star","96 avenue du centre ville","CDEDEX 36458","","29200","Brest"},
			{"5","Hotel du port","127rue du port","",""," 29200","Brest"}
	};    
    private String column[]={"ID","LIBELLE","LIGNE 1","LIGNE 2","LIGNE 3","CODE POSTAL","VILLE"}; 
    
	private JTable table = new JTable(data,column);
	
	private JScrollPane sp=new JScrollPane(table);
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	////////////
	
	public AdresseConsultationPanel() {
		
		setLayout(null);
		
		JLabel lblTitre = new JLabel("Consultation des Adresses");
		lblTitre.setBounds(102, 5, 245, 25);
		lblTitre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(lblTitre);
		
		// Table
		sp.setBounds(50, 92, 600, 100);
		add(sp);
		
		JButton btnNewButton = new JButton("Ajouter");
		btnNewButton.setBounds(561, 203, 89, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("libelle");
		lblNewLabel.setBounds(51, 53, 46, 14);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(91, 50, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("code postal");
		lblNewLabel_2.setBounds(201, 53, 67, 14);
		add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(277, 50, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ville");
		lblNewLabel_1.setBounds(373, 53, 46, 14);
		add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(406, 50, 86, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("recherche");
		btnNewButton_1.setBounds(536, 49, 101, 23);
		add(btnNewButton_1);
	    
	}
}
