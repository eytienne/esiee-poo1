package d;

import pers.Employe;
import pers.Personne;
import util.Adresse;

public class Appli {

	public static void main(String[] args) {
		Personne martin = new Personne();
		martin.setNom("MARTIN");
		martin.setPrenom("Pierre");
		martin.setAge(28);
		martin.setAdresse(new Adresse("3, rue de la Pompe", "", "75013", "Paris"));

		martin.affiche(); // MARTIN Pierre 28

		Personne durand = new Personne("DURAND", "Alain", 30, new Adresse("Bd Gambetta", "", "78300", "Poissy"));
		String n = durand.getNom();
		String p = durand.getPrenom();
		int a = durand.getAge();
		Adresse ad = durand.getAdresse();
		System.out.println(n + " " + p + " " + a + " " + ad.toString());
		// DURAND Alain 30

		Employe legoff = new Employe();
		legoff.affiche();
		legoff.setNom("LEGOFF");
		legoff.setPrenom("Eve");
		legoff.setAge(32);
		legoff.setSalaire(4000.0);
		legoff.setAdresse(ad);
		legoff.affiche();

		Employe duval = new Employe("DUVAL", "Sophie", 25, 3000.0);
		duval.setAdresse(new Adresse("10, rue de l'Entreprise", "Pole galilee 1", "95000", "Cergy"));
		duval.affiche();
	}

}
