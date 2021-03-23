package com.planificateurvoyage.ui.referentiel;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ReferentielCategorieAjoutPanel extends JPanel {
	
	
	////////////
	private String data[][]={ {"1","Transport"},
			{"2","H\u00E9bergement"},
			{"3","Restauration"},
			{"4","Loisir"}
	};    
    private String column[]={"ID","LIBELLE"}; 
    
	private JTable table = new JTable(data,column);
	
	private JScrollPane sp=new JScrollPane(table);
	private JTextField textField;
	////////////

	public ReferentielCategorieAjoutPanel () {
		setLayout(null);
		
		JLabel lblTitre = new JLabel("Ajout d'une cat\u00E9gorie");
		lblTitre.setBounds(125, 5, 252, 25);
		lblTitre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(lblTitre);

		
		// Table
		sp.setBounds(50, 50, 300, 100);
		add(sp);
		
		
		JLabel lblNewLabel = new JLabel("Nouvelle cat\u00E9gorie");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(125, 161, 140, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("libell\u00E9");
		lblNewLabel_1.setBounds(53, 198, 46, 14);
		add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(99, 192, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Ajouter");
		btnNewButton.setBounds(50, 223, 89, 23);
		add(btnNewButton);
		
	}
}
