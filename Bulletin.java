package ch03;

public class Bulletin {
	
	public static void main(String[] args) {
		/* Programme qui calcule la moyenne pondérée
		 d'un élève sur base de ses notes et du
		 nombre d'heures de ses cours. */
		 
		/* Informations données :
		    - anglais     : 4h
			- français    : 5h
			- géographie  : 2h
			- math        : 6h
		
		   Moyenne pondérée ?
		    1) Totaliser les heures
			   4 + 5 + 2 + 6 = 17h
			2) Calculer les pondérations des cours
			   a. anglais : 4 / 17
			   b. français : 5 / 17
			   c. ...
			3) Calculer la moyenne pondérée
			   noteAngl x 4 / 17 + noteFranç x 5 / 17 + ...
		*/
		
		/*
		Par exemple, imaginons l'étudiant Bob.ette qui a
		obtenu 13 / 20 en anglais, 5 / 20 en français,
		8 / 20 en géographie, 20 / 20 en math.
		
		Moy. pond. = 13 x 4 / 17 + 5 x 5 / 17 + 8 x 2 / 17 + 20 x 6 / 17
		           = 12,5294117...
				   = 12,5
		*/
		

		//=============Déclarations des variables=============//

		// 1. Données saisies/fournies par l'utilisateur
		double noteAngl, noteFr, noteGeo, noteMath;
		
		// 2. Résultats
		int hTotal;
		double moyPond;
		
		// 3. Données déjà connues
		int hAngl = 4, hFr = 5, hGeo = 2, hMath = 6;
		
		// Acquisition des données manquantes
		System.out.println("\nBULLETIN");

		System.out.printf("\nNote d'Anglais sur 20 : ");
		noteAngl = Console.lireDouble();

		System.out.printf("\nNote de Français sur 20 : ");
		noteFr = Console.lireDouble();

		System.out.printf("\nNote de Géographie sur 20 : ");
		noteGeo = Console.lireDouble();

		System.out.printf("\nNote de Math sur 20 : ");
		noteMath = Console.lireDouble();
		

		//=============Traitement principal=============//
		// 1. Totaliser les heures
		hTotal = hAngl + hFr + hGeo + hMath;
		
		// 2. Calculer la moyenne pondérée
		moyPond = noteAngl * hAngl / hTotal; 
		moyPond =+ noteFr * hFr / hTotal;
		moyPond =+ noteGeo * hGeo / hTotal;
		moyPond =+ noteMath * hMath / hTotal;
		
		// Afficher le résultat
		System.out.printf("\nMoyenne pondérée : %.1f/20", moyPond);
		System.out.printf("\nMoyenne pondérée : %.1f/20", moyPond);
	}
	
}



