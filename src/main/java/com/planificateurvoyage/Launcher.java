package com.planificateurvoyage;

import 
 org.springframework.context.support.ClassPathXmlApplicationContext;


public class Launcher {
   public void launch() {

	   //String[] contextPaths = new String[] {"PlanificateurVoyagePrototype1Application/app-context.xml"};
	   String[] contextPaths = new String[] {"app-context.xml"};
       
	   new ClassPathXmlApplicationContext(contextPaths);
   }
}
