package ch03;

public class Billet {

	public static void main(String[] args) {

		/* Programme qui décompose un montant monétaire
		en valeurs de billets imposées (200,100,50,20 
		et 10)*/

		/* 
		   Comment décomposer un montant monétaire ?

			1) Diviser le montant par 200 afin de 
			   connaître le nombre de fois qu'il 
			   y'a 200 dans ce montant 
			   => le quotient de la division entière 
			   (euclédienne)
			   Par exemple, 790/200 nous donne 3 Billets

			2) Obtenir le reste de cette même division 
			   Par exemple, 790 modulos 200 nous donne 190euro

			3) On répète les 2 premiers étapes pour les autres 
			   valeurs de billets (100,50,20 et 10)
			   Par exemple,
			   	190 / 100 nous donne 1 billet de 100 EUR
			   	190 mod 100 nous 90 EUR 

			   	90 / 50 nous donne 1 billet de 50 EUR
			   	90 mod 50 nous donne 40 EUR

			   	40 / 20 nous donne 2 billets de 20 EUR 
			   	40 mod 20 nous donne 0 EUR

			   	0/10 nous donne 0 billet de 10 EUR
		*/ 


		//==Déclaration des variables==//
		//Variable entier
		int montant;
		int nbBillets200,nbBillets100,nbBillets50,nbBillets20,nbBillets10;
		//Variable constante
		final int VAL_BILLET1 = 200;
		final int VAL_BILLET2 = 100;
		final int VAL_BILLET3 = 50;
		final int VAL_BILLET4 = 20;
		final int VAL_BILLET5 = 10;
		

		//==Acquisition de la donnée manquante==//
		System.out.println("Montant en EUR : ");
		montant = 790;

		//==Traitement==//
		nbBillets200 = montant / VAL_BILLET1;
		montant %= 200;
		System.out.println(nbBillets200 + "fois 200");

		nbBillets100 = montant / VAL_BILLET2;
		montant %= 100;
		System.out.println(nbBillets100 + "fois 100");


	}
}