package com.planificateurvoyage.ui.activite;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;

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
	////////////
	
	public ActiviteConsultationPanel() {
		
		setLayout(null);
		
		JLabel lblTitre = new JLabel("Consultation des activités");
		lblTitre.setBounds(102, 5, 245, 25);
		lblTitre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(lblTitre);
		
		// Table
		sp.setBounds(50, 50, 800, 100);
		add(sp);
		
		JButton btnNewButton = new JButton("Ajouter");
		btnNewButton.setBounds(750, 165, 89, 23);
		add(btnNewButton);
		
	}
}
