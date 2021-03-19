package com.planificateurvoyage.ui.personne;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;

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
	////////////
	
	public PersonneConsultationPanel() {
		
		setLayout(null);
		
		JLabel lblTitre = new JLabel("Consultation des personnes");
		lblTitre.setBounds(102, 5, 245, 25);
		lblTitre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(lblTitre);
		
		// Table
		sp.setBounds(50, 50, 400, 100);
		add(sp);
		
		JButton btnNewButton = new JButton("Ajouter");
		btnNewButton.setBounds(350, 165, 89, 23);
		add(btnNewButton);
	    
	}
}
