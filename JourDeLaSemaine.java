package labo2;

public class JourDeLaSemaine {

	public static void main(String[] args) {
		// Variables pour les données de départ
		int jour, mois, annee;

		System.out.print("\nJour : ");
		jour = Console.lireInt();

		System.out.print("Mois : ");
		mois = Console.lireInt();
		
		System.out.print("Annee : ");
		annee = Console.lireInt();
	

		// Variables pour le traitement 
		int anneeEnCours, a, b, m;

		// variable pour le résultat
		int JourDeLaSemaine;

		// Traitement
		anneeEnCours = (14 - mois) / 12;
		a = annee - anneeEnCours;
		b = a + a / 4 - a / 100 + a / 400;
		m = mois + 12 * anneeEnCours - 2;
		JourDeLaSemaine = (jour + b + 31 * m / 12) % 7;

		//Affichage du résultat
		System.out.println("\n" + JourDeLaSemaine);

	}
}