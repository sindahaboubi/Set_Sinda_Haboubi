package classes;

import interfaces.GestionEnseignant;

import java.util.Set;
import java.util.TreeSet;

public class EspritTreeSet implements GestionEnseignant  {
	private Set<Enseignant> enseignants = new TreeSet<>();
	
    @Override
    public void ajouterEnseignant(Enseignant e) {
        enseignants.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        return enseignants.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        for (Enseignant e : enseignants) {
            if (e.getId() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        enseignants.remove(e);
    }

    @Override
    public void displayEnseignants() {
        for (Enseignant e : enseignants) {
            System.out.println(e);
        }
    }
}
