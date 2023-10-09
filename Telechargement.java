package labo2;

public class Telechargement {
	public static void main(String[] args) {

		/* Calculer la dur�e de t�l�chargement par 
		la taille d'un fichiers et le niveau de
		d�bit en Mbps */

		/* Formule :
			1) Dur�e de t�l�chargement : 
				(Taille / Debit)*8
			2) R�sultat en heure r�el : 

		*/

		// D�claration de la variable 
		double tailleFichier, debitMbps;
		int dureeTelechargement;
		int heure, minute, seconde;

		// Affectation 
		System.out.print("\nTaille du fichier (en Mo) : ");
		tailleFichier = Console.lireDouble();

		System.out.print("D�bit (en Mbps) : ");
		debitMbps = Console.lireDouble();

		// Op�ration en seconde
		dureeTelechargement = (int)(tailleFichier/debitMbps*8);


		// Op�ration de dur�e r�el
		heure   = dureeTelechargement/3600;
		minute  = (dureeTelechargement%3600)/60;
		seconde = dureeTelechargement%60;

		System.out.print("\nLa dur�e de t�lechargement est de " + heure + "h" + minute + "min" + seconde + "sec");

	}


}