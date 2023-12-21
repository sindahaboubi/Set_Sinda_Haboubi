package Test;

import classes.Enseignant;
import classes.EspritHashSet;
import classes.EspritTreeSet;
import interfaces.GestionEnseignant;

public class Main {
	 public static void main(String[] args) {
	        Enseignant enseignant1 = new Enseignant(1, "Haboubi", "Sinda");
	        Enseignant enseignant2 = new Enseignant(2, "Rabhi", "Mariem");
	        Enseignant enseignant3 = new Enseignant(3, "Halloul", "NourAllah");
	        Enseignant enseignant4 = new Enseignant(4, "Msahli", "Aziz");
	        Enseignant enseignant5 = new Enseignant(5, "Kamoun", "Riadh");

	        GestionEnseignant gestionHashSet = new EspritHashSet();
	        gestionHashSet.ajouterEnseignant(enseignant1);
	        gestionHashSet.ajouterEnseignant(enseignant2);
	        gestionHashSet.ajouterEnseignant(enseignant3);

	        System.out.println("La liste des enseignants dans EspritHashSet sont:");
	        gestionHashSet.displayEnseignants();
	        
	        System.out.println("L'étudiant de ID N°1 existe t-il dans la liste ? " + gestionHashSet.rechercherEnseignant(1));
	        System.out.println("Vérifier l'existance de l'enseignant par objet: " + gestionHashSet.rechercherEnseignant(enseignant1));
	        gestionHashSet.supprimerEnseignant(enseignant1);
	        System.out.println("La liste après suppression de l'enseignant de ID 1 est:");
	        gestionHashSet.displayEnseignants();

	        GestionEnseignant gestionTreeSet = new EspritTreeSet();
	        gestionTreeSet.ajouterEnseignant(enseignant2);
	        gestionTreeSet.ajouterEnseignant(enseignant3);
	        gestionTreeSet.ajouterEnseignant(enseignant4);
	        gestionTreeSet.ajouterEnseignant(enseignant5);

	        System.out.println("Les enseignants dans EspritTreeSet sont :");
	        gestionTreeSet.displayEnseignants();
	    }
}
