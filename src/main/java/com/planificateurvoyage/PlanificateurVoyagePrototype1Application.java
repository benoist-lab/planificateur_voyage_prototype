package com.planificateurvoyage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
@SpringBootApplication
public class PlanificateurVoyagePrototype1Application {

	public static void main(String[] args) {
		SpringApplication.run(PlanificateurVoyagePrototype1Application.class, args);
	}

}
*/

/*
@SpringBootApplication
public class PlanificateurVoyagePrototype1Application extends JFrame {

	
	
	public PlanificateurVoyagePrototype1Application () {
		super ();
		
		System.out.println ("création de la fenetre");
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				
				System.out.println ("fermeture de la fenetre");
				
				System.exit(0);

            }
		});
		
		this.setSize(1000,1000);
		
		this.setVisible (true);
	}

	public static void main(String[] args) {

        var ctx = new SpringApplicationBuilder(PlanificateurVoyagePrototype1Application.class)
                .headless(false).run(args);

        EventQueue.invokeLater(() -> {

            var ex = ctx.getBean(PlanificateurVoyagePrototype1Application.class);
            ex.setVisible(true);
        });
	}

}
*/


//@SpringBootApplication
public class PlanificateurVoyagePrototype1Application {

//	public static void main(String[] args) {
//		SpringApplication.run(PlanificateurVoyagePrototype1Application.class, args);
//	}
    public static void main(String[] args) {
        Launcher launcher = new Launcher();
        launcher.launch();
    }
}












