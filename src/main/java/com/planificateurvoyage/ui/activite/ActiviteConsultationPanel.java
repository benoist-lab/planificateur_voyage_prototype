package com.planificateurvoyage.ui.activite;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextField;

public class ActiviteConsultationPanel extends JPanel {
	
	////////////
	private String data[][]={ 
			{"1","transport","avion","Orly","1000","vol 427"},    
			{"2","Hébergement","appartement BnB 33","28 du cheval 29200 Brest","50","4 lits"},    
			{"3","Loisir","piscine Plouf","rue du port 29200 Brest","5",""},    
			{"4","Loisir","Théate des Star","96 avenue du centre ville 29200 Brest","50","Cirano de Bergerac"},
			{"5","Hébergement","Hotel du port","127 rue du port 29200 Brest","15","1 lit"},    
			{"5","Hébergement","Hotel du port","127 rue du port 29200 Brest","40","1 lit deux place"} 

            
	};    
    private String column[]={"ID","CATEGORIE","LIBELLE","ADRESSE","COUT","DESCRIPTION"}; 
    
	private JTable table = new JTable(data,column);
	
	private JScrollPane sp=new JScrollPane(table);
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	////////////
	
	public ActiviteConsultationPanel() {
		
		setLayout(null);
		
		JLabel lblTitre = new JLabel("Consultation des activit\u00E9s");
		lblTitre.setBounds(102, 5, 245, 25);
		lblTitre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(lblTitre);
		
		// Table
		sp.setBounds(50, 88, 800, 100);
		add(sp);
		
		JButton btnNewButton = new JButton("Ajouter");
		btnNewButton.setBounds(761, 199, 89, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Cat\u00E9gorie");
		lblNewLabel.setBounds(50, 53, 59, 14);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(112, 50, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("libell\u00E9");
		lblNewLabel_1.setBounds(218, 53, 46, 14);
		add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(261, 50, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("adresse");
		lblNewLabel_2.setBounds(371, 53, 59, 14);
		add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(428, 50, 86, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Recherche");
		btnNewButton_1.setBounds(551, 49, 105, 23);
		add(btnNewButton_1);
		
	}
}
