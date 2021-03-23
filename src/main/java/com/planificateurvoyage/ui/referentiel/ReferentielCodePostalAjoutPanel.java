package com.planificateurvoyage.ui.referentiel;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ReferentielCodePostalAjoutPanel extends JPanel {
	
	
	////////////
	private String data[][]={ {"1","29200","Brest"},
			{"2","29000","Quimper"},
			{"3","29100","Le Juch"},
			{"4","29100","Kerlaz"},
			{"5","29100","Pouldergat"},
			{"6","29100","Poullan-sur-Mer"},

	};    
    private String column[]={"ID","CODE POSTAL","VILLE"}; 
    
	private JTable table = new JTable(data,column);
	
	private JScrollPane sp=new JScrollPane(table);
	private JTextField textField;
	private JTextField textField_1;
	////////////
	
	public ReferentielCodePostalAjoutPanel () {
		setLayout(null);
		
		JLabel lblTitre = new JLabel("Ajout d'un code postal");
		lblTitre.setBounds(125, 5, 252, 25);
		lblTitre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(lblTitre);

		
		// Table
		sp.setBounds(50, 50, 300, 100);
		add(sp);

		
		JLabel lblNewLabel = new JLabel("Nouveau Code postal");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(125, 161, 162, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("code postal");
		lblNewLabel_1.setBounds(53, 198, 74, 14);
		add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(125, 195, 86, 20);
		add(textField);
		textField.setColumns(10);
		
	
		JLabel lblNewLabel_2 = new JLabel("ville");
		lblNewLabel_2.setBounds(50, 223, 46, 14);
		add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(125, 222, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Ajouter");
		btnNewButton.setBounds(50, 253, 89, 23);
		add(btnNewButton);
	}
	
	
	
	
}
