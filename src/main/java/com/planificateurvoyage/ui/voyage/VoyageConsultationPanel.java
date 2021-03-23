package com.planificateurvoyage.ui.voyage;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JComboBox;

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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	////////////
	
	public VoyageConsultationPanel() {
		
		setLayout(null);
		
		JLabel lblTitre = new JLabel("Consultation d'un voyage");
		lblTitre.setBounds(102, 5, 245, 25);
		lblTitre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(lblTitre);
		
		// Table
		sp.setBounds(50, 93, 1000, 100);
		add(sp);
		
		JButton btnNewButton = new JButton("Ajouter");
		btnNewButton.setBounds(961, 204, 89, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("libell\u00E9");
		lblNewLabel.setBounds(50, 58, 46, 14);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(86, 55, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ann\u00E9e");
		lblNewLabel_1.setBounds(198, 58, 46, 14);
		add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(238, 55, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("status");
		lblNewLabel_2.setBounds(352, 58, 46, 14);
		add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(389, 54, 89, 22);
		add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("nb personne");
		lblNewLabel_3.setBounds(511, 58, 73, 14);
		add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(582, 55, 86, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Recherche");
		btnNewButton_1.setBounds(694, 54, 113, 23);
		add(btnNewButton_1);
		
	}
}
