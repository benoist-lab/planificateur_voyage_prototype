package com.planificateurvoyage.ui.voyage;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class VoyageConsultationPanel extends JPanel {
	
	////////////
	private String data[][]={
			{"1","07/01/2021 08h30","15/01/2021 17h00","voyage à Pise","réglé","jolie séjour à pise","4","2","4000" },    
			{"2","19/03/2021 09h00","22/03/2021 19h00","week-end au Conquet","réglé","week-end au bord de mer","2","0","200" },    
			{"3","22/03/2021 08h00","28/03/2021 14h00","escale à Brest","non réglé","séjour d'une semaine à Brest et visite des environs","4","5","1568.99" },    
	};    
    private String column[]={"ID","DEBUT","FIN","LIBELLE","STATUT","DESCRIPTION","nb PErsonne","nb Activite","COUT" }; 
    
	private JTable table = new JTable(data,column);
	
	private JScrollPane sp=new JScrollPane(table);
	////////////
	
	public VoyageConsultationPanel() {
		
		setLayout(null);
		
		JLabel lblTitre = new JLabel("Consultation d'un voyage");
		lblTitre.setBounds(102, 5, 245, 25);
		lblTitre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(lblTitre);
		
		// Table
		sp.setBounds(50, 50, 1000, 100);
		add(sp);
		
		JButton btnNewButton = new JButton("Ajouter");
		btnNewButton.setBounds(950, 165, 89, 23);
		add(btnNewButton);
		
	}
	
	
}
