package ch03;

public class NumberMagic {
	public static void main(String[] args) {

		// Variable //
		int rd; //Numéro random de 0 à 100
		double rp;                         //Réponse

		int e = 10;                        //Nombre d'essaie maximum
		int i;							   //Nombre de tentative

		int choix   = 1; 			       //Choix Restart/Stop
		int restart = 1; 			       //Recommencer
		int stop    = 0;  			       //Arrêt

		while (choix == 1) {
			rd = (int)(Math.random()*100); //Numéro random de 0 à 100
			// Tentative de jeux //
			for(i = 1; i<=e; i++) {
				// Affectation //
				System.out.printf("\nEncoder un nombre entre 0 et 100 : ");
				rp = Console.lireDouble(); 

				// En cas d'erreur ou de nombre invalide //
				while(rp > 100) {
					System.out.printf("\nVeuillez encoder un nombre valide ! \nEncoder un nombre : ");
					rp = Console.lireDouble();
				}

				// Résutat //
				if (rp == rd) { 
				// Valeurs random trouver
					System.out.printf("\nVous avez gagnez ! La réponse était bien " + rd + ". En " + i + "essaie.");
					i = 11;
				} else if(rp>rd) { 
				//Valeurs random non-trouvé
					System.out.printf("\nPlus petit !");   
				} else System.out.printf("\nPlus grand !");
			}

			// Nombre d'essaies dépassé //
			if (i < e) {
				System.out.printf("\n\nVous avez dépassé le nombre d'essais maximum");
			} 

			System.out.print("\n\nVoulez-vous continuer (oui = 1 / non = 0) ? ");
			choix = Console.lireInt();
		}
		

	}
}