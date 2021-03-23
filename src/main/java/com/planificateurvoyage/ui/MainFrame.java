package com.planificateurvoyage.ui;

import java.awt.Dimension;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

import com.planificateurvoyage.ui.activite.ActiviteConsultationPanel;
import com.planificateurvoyage.ui.activite.ActiviteCreationPanel;
import com.planificateurvoyage.ui.activite.ActiviteCreationVoyagePanel;
import com.planificateurvoyage.ui.adresse.AdresseConsultationPanel;
import com.planificateurvoyage.ui.adresse.AdresseCreationPanel;
import com.planificateurvoyage.ui.personne.PersonneConsultationPanel;
import com.planificateurvoyage.ui.personne.PersonneCreationPanel;
import com.planificateurvoyage.ui.referentiel.ReferentielCategorieAjoutPanel;
import com.planificateurvoyage.ui.referentiel.ReferentielCodePostalAjoutPanel;
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
	private static final String ADRESSE_CONSULTATION="ADRESSE_CONSULTATION";
	private static final String ADRESSE_CREATION="ADRESSE_CREATION";
	private static final String REFERENTIEL_CATEGORIE_AJOUT="REFERENTIEL_CATEGORIE_AJOUT";
	private static final String REFERENTIEL_CODE_POSTAL_AJOUT="REFERENTIEL_CODE_POSTAL_AJOUT";
	
	// CHAMPS
	private final PersonneConsultationPanel personneConsultation=new PersonneConsultationPanel();
	private final PersonneCreationPanel personneCreation=new PersonneCreationPanel ();
	private final ActiviteConsultationPanel activiteConsultation=new ActiviteConsultationPanel ();
	private final ActiviteCreationPanel activiteCreation=new ActiviteCreationPanel ();
	private final VoyageConsultationPanel voyageConsultation=new VoyageConsultationPanel ();
	private final VoyageCreationPanel voyageCreation=new VoyageCreationPanel ();
	private final ActiviteCreationVoyagePanel activiteCreationVoyage=new ActiviteCreationVoyagePanel ();
	private final AdresseConsultationPanel adresseConsultation=new AdresseConsultationPanel ();
	private final AdresseCreationPanel adresseCreation=new AdresseCreationPanel ();
	private final ReferentielCategorieAjoutPanel referentielCategorieAjout=new ReferentielCategorieAjoutPanel ();
	private final ReferentielCodePostalAjoutPanel referentielCodePostalAjoutPanel=new ReferentielCodePostalAjoutPanel ();
	
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
	
	private AdresseConsultationPanel getAdresseConsultationPanel () {
		return adresseConsultation;
	}
	
	private AdresseCreationPanel getAdresseCreationPanel () {
		return adresseCreation;
	}
	
	private ReferentielCategorieAjoutPanel getReferentielCategorieAjoutPanel () {
		return referentielCategorieAjout;
	}
	
	private ReferentielCodePostalAjoutPanel getReferentielCodePostalAjoutPanel () {
		return referentielCodePostalAjoutPanel;
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
		panneauPrincipal.add(getAdresseConsultationPanel(), ADRESSE_CONSULTATION);	
		panneauPrincipal.add(getAdresseCreationPanel(), ADRESSE_CREATION);	
		panneauPrincipal.add(getReferentielCategorieAjoutPanel(), REFERENTIEL_CATEGORIE_AJOUT);	
		panneauPrincipal.add(getReferentielCodePostalAjoutPanel(), REFERENTIEL_CODE_POSTAL_AJOUT);	
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
			//voirPanneauPrincipal (ACTIVITE_CREATION_VOYAGE);
			voirPanneauPrincipal (VOYAGE_CONSULTATION);
			
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
		
		JMenuItem menuPersonneCreation = new JMenuItem("Cr\u00E9ation");
		menuPersonneCreation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println ("Personne -> création");
				
				voirPanneauPrincipal (PERSONNE_CREATION);

			}
		});
		menuPersonne.add(menuPersonneCreation);
		
		//Activité
		JMenu menuActivite = new JMenu("Activit\u00E9");
		menuBar.add(menuActivite);
		
		JMenuItem menuActiviteConsultation = new JMenuItem("Consultation");
		menuActiviteConsultation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println ("Activité -> consultation");
				
				voirPanneauPrincipal (ACTIVITE_CONSULTATION);

			}
		});
		menuActivite.add(menuActiviteConsultation);
		
		JMenuItem menuActiviteCreation = new JMenuItem("Cr\u00E9ation");
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
		
		JMenuItem menuVoyageCreation = new JMenuItem("Cr\u00E9ation");
		menuVoyageCreation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println ("Voyage -> création");
				
				voirPanneauPrincipal (VOYAGE_CREATION);

			}
		});
		menuVoyage.add(menuVoyageCreation);
		
		JMenu menuAdresse = new JMenu("Adresse");
		menuBar.add(menuAdresse);
		
		JMenuItem menuAdresseConsultation = new JMenuItem("Consultation");
		menuAdresseConsultation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println ("Adresse -> consultation");
				
				voirPanneauPrincipal (ADRESSE_CONSULTATION);

			}
		});
		menuAdresse.add(menuAdresseConsultation);
		
		JMenuItem menuAdresseCreation = new JMenuItem("Cr\u00E9ation");
		menuAdresseCreation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println ("Adresse -> création");
				
				voirPanneauPrincipal (ADRESSE_CREATION);

			}
		});
		menuAdresse.add(menuAdresseCreation);
		
		//////////
		
		JMenu menuReferentiel = new JMenu("R\u00E9f\u00E9rentiel");
		menuBar.add(menuReferentiel);
		
		JMenuItem menuReferentielCategorieAjout = new JMenuItem("Cat\u00E9gorie");
		menuReferentielCategorieAjout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println ("Categorie -> ajout");
				
				voirPanneauPrincipal (REFERENTIEL_CATEGORIE_AJOUT);

			}
		});
		menuReferentiel.add(menuReferentielCategorieAjout);
		
		JMenuItem menuReferentielCodePsotalAjout = new JMenuItem("Code Postal");
		menuReferentielCodePsotalAjout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println ("Code Postal -> ajout");
				
				voirPanneauPrincipal (REFERENTIEL_CODE_POSTAL_AJOUT);

			}
		});
		menuReferentiel.add(menuReferentielCodePsotalAjout);

   }
   
   //METHODE	
	private void voirPanneauPrincipal (String id)
	{
		((CardLayout)(getPanneauPrincipal ().getLayout())).show(getPanneauPrincipal (), id);
	}
	
	
}