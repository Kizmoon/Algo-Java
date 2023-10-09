package ch04;

public class Matricule {
	public static void main(String[] args) {

		// Variables
		String matricule;
		int anneInsc;

		// Affectation
		matricule = Console.lireString("Matricule Helmo : ");

		// Traitement 
		//  1. Extraire l'année d'inscription (substring) 
		// Exemple : Q2354587
		//          0[123]4567
		anneInsc = Integer.parseInt(matricule.substring(1,3));

		//	2. Convertir en int l'année extraite 

		// Afficher le résultat
		System.out.printf("Période d'insription : 20%d", anneInsc);


	}

}