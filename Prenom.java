package ch04;

public class Prenom {
	public static void main(String[] args) {

		// D�claration variable
		String prenom, msg, reste;
		char lettre1;

		// Acquisition du pr�nom
		System.out.print("\nEncoder votre pr�nom : ");
		prenom = Console.lireString();

		// Traitement 
		// 1. Focaliser le pr�nom
		// Exemple : "juLiE" devient "Julie"
	    //   		  01234           01234
		
		//	a) Obtenir la premi�re lettre et la mettre en majuscule
		lettre1 = prenom.charAt(0);
		lettre1 = Character.toUpperCase(lettre1);

		//	b) Obtenir le reste des lettres et les mettres en minuscule
		reste = prenom.substring(1);
		reste = reste.toLowerCase();

		//  c) Assembler les lettres du pr�nom
		prenom = lettre1 + reste;
		

		//2. Affichage du message 
		msg = "Bienvenue " + prenom + " !"; 

		// Affichage du message
		System.out.printf(msg);



	}

}