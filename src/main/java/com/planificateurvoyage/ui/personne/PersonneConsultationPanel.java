package com.planificateurvoyage.ui.personne;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class PersonneConsultationPanel extends JPanel {
	
	////////////
	private String data[][]={ {"1","Dubois","Bertrand"},    
            {"2","Martin","Henri"},    
            {"3","Sachin","Simon"},
            {"5","villebois","Paul"},
            {"6","Legenec","Jacques"},
            {"7","Dupuis","Yvette"}
            
	};    
    private String column[]={"ID","NOM","PRENOM"}; 
    
	private JTable table = new JTable(data,column);
	
	private JScrollPane sp=new JScrollPane(table);
	private JTextField textField;
	private JTextField textField_1;
	////////////
	
	public PersonneConsultationPanel() {
		
		setLayout(null);
		
		JLabel lblTitre = new JLabel("Consultation des personnes");
		lblTitre.setBounds(102, 5, 245, 25);
		lblTitre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(lblTitre);
		
		//Critere de recherche
		JLabel lblNewLabel_1 = new JLabel("nom");
		lblNewLabel_1.setBounds(50, 44, 46, 14);
		add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(102, 41, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("pr\u00E9nom");
		lblNewLabel_2.setBounds(198, 41, 46, 14);
		add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(246, 41, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Recherche");
		btnNewButton_1.setBounds(342, 41, 108, 23);
		add(btnNewButton_1);
		
		// Table
		sp.setBounds(50, 72, 400, 100);
		add(sp);
		
		JButton btnNewButton = new JButton("Ajouter");
		btnNewButton.setBounds(361, 193, 89, 23);
		add(btnNewButton);

	    
	}
}
