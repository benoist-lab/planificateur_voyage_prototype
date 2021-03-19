package com.planificateurvoyage.ui.voyage;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class VoyageCreationPanel extends JPanel {
	private JTextField textField;
	
	//////////// Personne
	private String dataPersonne[][]={ {"1","Dubois","Bertrand","X"},    
            {"2","Martin","Henri","X"}    
	};    
    private String columnPersonne[]={"ID","NOM","PRENOM",""}; 
    
	private JTable tablePersonne = new JTable(dataPersonne,columnPersonne);
	
	private JScrollPane spPersonne=new JScrollPane(tablePersonne);
	////////////

	//////////// Activite
	private String dataActivite[][]={ 
			{"22/03/2021 08h00","22/03/2021 10h00","10","transport","train","Saint Lazard","100","200","train n°3669","X"},    
			{"22/03/2021 08h00","28/03/2021 14h00","2","Hébergement","appartement BnB 33","28 du cheval 29200 Brest","50","?100?","4 lits","X"},    
			{"23/03/2021 14h00","23/03/2021 18h00","3","Loisir","piscine Plouf","rue du port 29200 Brest","5","10","","X"},    
			{"24/03/2021 14h00","24/03/2021 18h00","3","Loisir","piscine Plouf","rue du port 29200 Brest","5","10","","X"},    
			{"24/03/2021 19h00","23/03/2021 23h00","4","Loisir","Théate des Star","96 avenue du centre ville 29200 Brest","50","100","Cirano de Bergerac","X"},
			{"25/03/2021 14h00","25/03/2021 18h00","3","Loisir","piscine Plouf","rue du port 29200 Brest","5","10","","X"},    
	};    
    private String columnActivite[]={"DEBUT","FIN", "ID","CATEGORIE","LIBELLE","ADRESSE","COUT U.","COUT","DESCRIPTION",""}; 
    
	private JTable tableActivite = new JTable(dataActivite,columnActivite);
	
	private JScrollPane spActivite=new JScrollPane(tableActivite);
	private JTextField textField_1;
	////////////
	
	public VoyageCreationPanel() {
		setLayout(null);
		
		JLabel lblTitre = new JLabel("Création d'un voyage");
		lblTitre.setBounds(131, 5, 188, 25);
		lblTitre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(lblTitre);
		
		JLabel lblNewLabel = new JLabel("Liebell\u00E9");
		lblNewLabel.setBounds(24, 51, 82, 14);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(116, 48, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("statut");
		lblNewLabel_1.setBounds(231, 51, 63, 14);
		add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Non R\u00E9gl\u00E9", "R\u00E9gl\u00E9", "Annul\u00E9"}));
		comboBox.setBounds(304, 47, 95, 22);
		add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Description");
		lblNewLabel_2.setBounds(24, 84, 82, 14);
		add(lblNewLabel_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(116, 79, 283, 64);
		add(textArea);
		
		JLabel lblNewLabel_3 = new JLabel("Personnes");
		lblNewLabel_3.setBounds(24, 154, 82, 14);
		add(lblNewLabel_3);
		
		// Table
		spPersonne.setBounds(116, 154, 400, 100);
		add(spPersonne);
		
		JButton btnNewButton = new JButton("Ajouter");
		btnNewButton.setBounds(430, 265, 89, 23);
		add(btnNewButton);
		
		
		JLabel lblNewLabel_4 = new JLabel("Activité");
		lblNewLabel_4.setBounds(24, 297, 46, 14);
		add(lblNewLabel_4);
		
		
		// Table
		spActivite.setBounds(116, 297, 800, 100);
		add(spActivite);
		
		JButton btnNewButtonActivite = new JButton("Ajouter");
		btnNewButtonActivite.setBounds(820, 400, 89, 23);
		add(btnNewButtonActivite);
		
		textField_1 = new JTextField();
		textField_1.setBounds(655, 401, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("total");
		lblNewLabel_5.setBounds(583, 404, 72, 14);
		add(lblNewLabel_5);
		
		
		
		JButton btnValider = new JButton("Valider");
		btnValider.setBounds(721, 434, 89, 23);
		add(btnValider);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setBounds(820, 434, 89, 23);
		add(btnAnnuler);
		
	}
	
}
