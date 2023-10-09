package labo2;

public class VenteAuto {
	public static void main(String[] args) {

		/* Calcul du montant TVAC qu'un 
		client doit lui payer � l'achat 
		d'une voiture */

		/* 
			// Variable :
				- Prix Hors-TVA, Montant TVA, Montant 
				R�duction, Montant final, Montant TTC, 
				Montant Remise;
				- TVA est de 0.21 (21%);
				- R�duction de 0.3 (3%);
		
			// Op�ration
		   		1) Demande Prix Hors TVA;
		   		2) Montant de la TVA = HTVA * 0.21; 
		   		3) Montant de la r�duction = HTVA * 0.3;
		   		4) Montant final = HTVA + TVA - Reduc;
		   		5) Montant TTC = HTVA + TVA;
		   		6) Montant de la remise = TTC - final;  
		*/ 

		/* 
			// V�rification : 
				1) Prix HTVA : 13505;
				2) TVA : 21%;
				3) Reduc : 3%;
			
				Op�ration :
				1) Montant TVA = 13505 * 0.21 = 2836.05
 				2) Montant de la r�duc = 
				3) Montant final = 13505 + 2836.05 - 490,2315 = 15850,8185
				4) Montant TTC = 
				5) Montant de la remise = 

		*/


		// D�claration de variable 

		double hTVA, montantTVA, montantFinal, montantRemise;
		final double TVA = 0.21, REDUC = 0.03;

		// Affectation 
		System.out.printf("\nIndiquer le montant de la voiture ? ");
		hTVA = Console.lireDouble();

		// Traitement 
		montantTVA = hTVA * TVA;
		montantRemise = (hTVA + montantTVA) * REDUC;
		montantFinal = hTVA + montantTVA - montantRemise;

		// R�sultats 
		System.out.printf("\nMontant de la TVA : %.4f", montantTVA);
		System.out.printf("\nMontant de la remise : %.4f", montantRemise);
		System.out.printf("\nMontant final : %.4f EURO\n", montantFinal);

	}
}