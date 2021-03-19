package com.planificateurvoyage.ui;

import java.awt.Dimension;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

import com.planificateurvoyage.ui.activite.ActiviteConsultationPanel;
import com.planificateurvoyage.ui.activite.ActiviteCreationPanel;
import com.planificateurvoyage.ui.activite.ActiviteCreationVoyagePanel;
import com.planificateurvoyage.ui.personne.PersonneConsultationPanel;
import com.planificateurvoyage.ui.personne.PersonneCreationPanel;
import com.planificateurvoyage.ui.voyage.VoyageConsultationPanel;
import com.planificateurvoyage.ui.voyage.VoyageCreationPanel;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.CardLayout;



public class MainFrame extends JFrame {
	
	// CONSTANTES
	private static final String PERSONNE_CONSULTATION="PERSONNE_CONSULTATION";
	private static final String PERSONNE_CREATION="PERSONNE_CREATION";
	private static final String ACTIVITE_CONSULTATION="ACTIVITE_CONSULTATION";
	private static final String ACTIVITE_CREATION="ACTIVITE_CREATION";
	private static final String VOYAGE_CONSULTATION="VOYAGE_CONSULTATION";
	private static final String VOYAGE_CREATION="VOYAGE_CREATION";
	private static final String ACTIVITE_CREATION_VOYAGE="ACTIVITE_CREATION_VOYAGE";
	
	// CHAMPS
	private final PersonneConsultationPanel personneConsultation=new PersonneConsultationPanel();
	private final PersonneCreationPanel personneCreation=new PersonneCreationPanel ();
	private final ActiviteConsultationPanel activiteConsultation=new ActiviteConsultationPanel ();
	private final ActiviteCreationPanel activiteCreation=new ActiviteCreationPanel ();
	private final VoyageConsultationPanel voyageConsultation=new VoyageConsultationPanel ();
	private final VoyageCreationPanel voyageCreation=new VoyageCreationPanel ();
	private final ActiviteCreationVoyagePanel activiteCreationVoyage=new ActiviteCreationVoyagePanel ();
	
	private final JPanel panneauPrincipal=new JPanel();

	// GETTERS SETTERS
	public PersonneConsultationPanel getPersonneConsultation() {
		return personneConsultation;
	}
	public PersonneCreationPanel getPersonneCreation() {
		return personneCreation;
	}
	public ActiviteConsultationPanel getActiviteConsultation() {
		return activiteConsultation;
	}
	public ActiviteCreationPanel getActiviteCreation() {
		return activiteCreation;
	}
	public VoyageConsultationPanel getVoyageConsultation() {
		return voyageConsultation;
	}
	public VoyageCreationPanel getVoyageCreation() {
		return voyageCreation;
	}
	public ActiviteCreationVoyagePanel getActiviteCreationVoyage() {
		return activiteCreationVoyage;
	}
	
	private JPanel getPanneauPrincipal () {
		return panneauPrincipal;
	}
	
	private void initPanneauPrincipal (){
		panneauPrincipal.setLayout(new CardLayout());
	
		panneauPrincipal.add(getPersonneConsultation(), PERSONNE_CONSULTATION);
		panneauPrincipal.add(getPersonneCreation(), PERSONNE_CREATION);
		panneauPrincipal.add(getActiviteConsultation(), ACTIVITE_CONSULTATION);
		panneauPrincipal.add(getActiviteCreation(), ACTIVITE_CREATION);	
		panneauPrincipal.add(getVoyageConsultation(), VOYAGE_CONSULTATION);	
		panneauPrincipal.add(getVoyageCreation(), VOYAGE_CREATION);	
		panneauPrincipal.add(getActiviteCreationVoyage(), ACTIVITE_CREATION_VOYAGE);	
	}
	
	//CONSTRUCTEUR
	public MainFrame() {
		super ();
	}
	
	/**
	 * utiliser par Srping pour l'initialisation du Beans
	 */
   public void init() {
	   
	   try {
	       setState(Frame.NORMAL);
		   
	       setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	       setSize(new Dimension(1200, 800));
	       
			getContentPane().add(getPanneauPrincipal (), BorderLayout.CENTER);

			// initialisation des composant craphique
			initMenu ();
			initPanneauPrincipal ();
	
	       /////////////////voirPanneauPrincipal (VOYAGE_CONSULTATION);
			voirPanneauPrincipal (ACTIVITE_CREATION_VOYAGE);
			
	       setVisible(true);
			
	   }catch (Exception e) {
		   e.printStackTrace();
	   }
   }
   
   private void initMenu () {
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		//Personne
		JMenu menuPersonne = new JMenu("Personne");
		menuBar.add(menuPersonne);
		
		JMenuItem menuPersonneConsultation = new JMenuItem("Consultation");
		menuPersonneConsultation.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println ("Personne -> consultation");

				voirPanneauPrincipal (PERSONNE_CONSULTATION);
				
			}
		});
		menuPersonne.add(menuPersonneConsultation);
		
		JMenuItem menuPersonneCreation = new JMenuItem("Création");
		menuPersonneCreation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println ("Personne -> création");
				
				voirPanneauPrincipal (PERSONNE_CREATION);

			}
		});
		menuPersonne.add(menuPersonneCreation);
		
		//Activité
		JMenu menuActivite = new JMenu("Activité");
		menuBar.add(menuActivite);
		
		JMenuItem menuActiviteConsultation = new JMenuItem("Consultation");
		menuActiviteConsultation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println ("Activité -> consultation");
				
				voirPanneauPrincipal (ACTIVITE_CONSULTATION);

			}
		});
		menuActivite.add(menuActiviteConsultation);
		
		JMenuItem menuActiviteCreation = new JMenuItem("Création");
		menuActiviteCreation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println ("Activité -> création");
				
				voirPanneauPrincipal (ACTIVITE_CREATION);

			}
		});
		menuActivite.add(menuActiviteCreation);
		
		JMenu menuVoyage = new JMenu("Voyage");
		menuBar.add(menuVoyage);
		
		JMenuItem menuVoyageConsultation = new JMenuItem("Consultation");
		menuVoyageConsultation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println ("Voyage -> consultation");
				
				voirPanneauPrincipal (VOYAGE_CONSULTATION);

			}
		});
		menuVoyage.add(menuVoyageConsultation);
		
		JMenuItem menuVoyageCreation = new JMenuItem("Création");
		menuVoyageCreation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println ("Voyage -> création");
				
				voirPanneauPrincipal (VOYAGE_CREATION);

			}
		});
		menuVoyage.add(menuVoyageCreation);

   }
   
   //METHODE	
	private void voirPanneauPrincipal (String id)
	{
		((CardLayout)(getPanneauPrincipal ().getLayout())).show(getPanneauPrincipal (), id);
	}
	
	
}