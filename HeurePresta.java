package labo2;

public class HeurePresta {
	public static void main(String[] args) {

		// Programme faisant la somme des heures prest�es

		// Traitement : 
			// 1) Capture des nombres entiers; 
			// 2) Somme des heures et des minutes;
			// 3) Dur�e de la prestation � l'�tat r�el (les minutes < 60);
			// 4) Assembler Heures et minutes en valeur d�cimal = h + min/100; 
			// 5) Montant de facturation = dur�e de prestation * 18,75 EURO;
		 
		/*	Exemple : 
			  Prestations du lundi ? 7:30
			  Prestations du mardi ? 6:45
			  Prestations du mercredi ? 4:20
			  Prestations du jeudi ? 7:00
			  Prestations du vendredi ? 5:55

			  Dur�e hebdomadaire : 31:30
			  Montant � facturer : 590,63 EUR */
		

		//========Variables========//
		/* Chaines de caract�res */
		String lundi, mardi, mercredi, jeudi, vendredi;
		/* Moontant de Facturation */
		double montantFacture;


		//========Affectation========//
		lundi    = Console.lireString("\nPrestations du lundi : ");
		mardi    = Console.lireString("Prestations du mardi : ");
		mercredi = Console.lireString("Prestations du mercredi : ");
		jeudi    = Console.lireString("Prestations du jeudi : ");
		vendredi = Console.lireString("Prestations du vendredi : ");


		//========Traitement========//
		// Capturer les entiers avant et apr�s le ":"
		/*Variable enti�re doubleP prend l'indice ':'*/
		int doubleP = lundi.indexOf(':');

		/*Lundi*/
		int heureA  = Integer.parseInt(lundi.substring(0,doubleP));
		int minuteA = Integer.parseInt(lundi.substring(doubleP + 1));

		/*mardi*/ 
		int heureB  = Integer.parseInt(mardi.substring(0,doubleP));
		int minuteB = Integer.parseInt(mardi.substring(doubleP + 1));

		/*mercredi*/ 
		int heureC  = Integer.parseInt(mercredi.substring(0,doubleP));
		int minuteC = Integer.parseInt(mercredi.substring(doubleP + 1));

		/*jeudi*/ 
		int heureD  = Integer.parseInt(jeudi.substring(0,doubleP));
		int minuteD = Integer.parseInt(jeudi.substring(doubleP + 1));

		/*vendredi*/ 
		int heureE  = Integer.parseInt(vendredi.substring(0,doubleP));
		int minuteE = Integer.parseInt(vendredi.substring(doubleP + 1));


		//========Op�rationDur�e========//
		// Total des heures
		double totalHeure  = heureA + heureB + heureC + heureD + heureE;
		// Total des minutes
		double totalMinute = minuteA + minuteB + minuteC + minuteD + minuteE;

		// Condition minutes
		/* "Tans que" le total des minutes d�passent 59mins,  
		on augmente le total d'heure d'une heure. */
		while (totalMinute> 59) { 
			totalMinute-=60;
			totalHeure++;
		}	


		//========Affichage de la dur�e========// 
		System.out.printf("\nDur�e hebdomadaire : %.0fh%.0f",totalHeure,totalMinute);


		//========Op�ration Montant facturation========//
		// Assembler la dur�e en valeur d�cimal
		double tauxHeure = totalHeure + totalMinute/60;
		// Montant de la Facturation
		montantFacture = tauxHeure * 18.75;


		//========Affichage du montant de facturation========//
		System.out.printf("\nMontant de facturation : %.2f", montantFacture);

	}

} 