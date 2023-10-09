package ch03;

public class Time {
	public static void main(String[] args) {

		/* Codez un programme capable de
		calculer la somme des temps
		6h 21min 30s et 3h 38min 45s */

		/* Heure   --> 24h
		   Minute  --> 60min
		   Seconde --> 60sec

		   1) Si les secondes > 60 
		      alors, 
		      => Seconde - 60 = MinutesA
		       	 Exemple : 70-60=10min
		   2) Si les minutes > 60
		      alors,
		      => MinuteB - 60 = heures
		         MinuteA + MinuteB = minute 

		*/

		//============Déclaration de la variable============//
		int heure, minute, seconde;
		int heureB, minuteB, secondeB;
		int heureTotal, minuteTotal, secondeTotal;

		//============Affectation des variables============//
		//Heure
		System.out.print("\nEncoder l'heure : ");
		heure = Console.lireInt();

		// En cas d'erreur ou de nombre invalide //
		while(heure > 23) {
			System.out.printf("\nVeuillez encoder une heure de 00 à 23 ! Encoder l'heure : ");
			heure = Console.lireInt();
		}

		//Minute
		System.out.print("Encoder la minute : ");
		minute = Console.lireInt();

		// En cas d'erreur ou de nombre invalide //
		while(minute > 59) {
			System.out.printf("\nVeuillez encoder une minute de 00 à 59 ! Encoder la minute : ");
			minute = Console.lireInt();
		}

		//Seconde
		System.out.print("Encoder la seconde : ");
		seconde = Console.lireInt();

		// En cas d'erreur ou de nombre invalide //
		while(minute > 59) {
			System.out.printf("\nVeuillez encoder une seconde de 00 à 59 ! Encoder la seconde : ");
			seconde = Console.lireInt();
		}

		System.out.print("\n\n" + heure + "h" + minute + "min" + seconde + "sec");


		//============Affectation des variables============//
		//Heure
		System.out.print("\n\nEncoder l'heure : ");
		heureB = Console.lireInt();

		// En cas d'erreur ou de nombre invalide //
		while(heureB > 23) {
			System.out.printf("\nVeuillez encoder une heure de 00 à 23 ! \nEncoder l'heure : ");
			heureB = Console.lireInt();
		}

		//Minute
		System.out.print("Encoder la minute : ");
		minuteB = Console.lireInt();

		// En cas d'erreur ou de nombre invalide //
		while(minuteB > 59) {
			System.out.printf("\nVeuillez encoder une minute de 00 à 59 ! \nEncoder la minute : ");
			minuteB = Console.lireInt();
		}

		//Seconde
		System.out.print("Encoder la seconde : ");
		secondeB = Console.lireInt();

		// En cas d'erreur ou de nombre invalide //
		while(minuteB > 59) {
			System.out.printf("\nVeuillez encoder une seconde de 00 à 59 ! \nEncoder la seconde : ");
			secondeB = Console.lireInt();
		}


		//============Opération============//
		//opération des heures
		heureTotal = heure + heureB;
		//15+15=30 <=> 30-23=6
		if (heureTotal > 23) {
			heureTotal-=23;
		}
		//opération des minutes
		// 48 + 30 = 78 - 19
		minuteTotal = minute + minuteB;
		while (minuteTotal > 59) {
			minuteTotal-=59; //80-59=21
			minuteTotal++;
		}		
		//opération des secondes
		secondeTotal = seconde + secondeB;
		while (secondeTotal > 59) {
			secondeTotal-=59; 
			secondeTotal++;
		}	

		System.out.print("\nLe résultat est de " + heureTotal + "h" + minuteTotal + "min" + secondeTotal + "sec");


	}
}