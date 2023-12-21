package interfaces;

import classes.Enseignant;

public interface GestionEnseignant {
    void ajouterEnseignant(Enseignant e);
    boolean rechercherEnseignant(Enseignant e);
    boolean rechercherEnseignant(int id);
    void supprimerEnseignant(Enseignant e);
    void displayEnseignants();
}