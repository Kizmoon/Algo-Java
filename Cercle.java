package ch03;

public class Cercle {

	public static void main(String[] args) {
		// Programme qui calcule le p?rim?tre
		// et l'aire d'un cercle.
		
		//=Formules=//
		// P = 2 . pi . r
		// A = pi . r?
		
		//==Op?ration de d?claration==//
		double rayon; // variable encoder par Utilisateur
		double p, a; // variable ? r?sultat 

 		//==Formule demande==// 
 		System.out.print("\nRayon (en cm) : ");
		rayon = Console.lireDouble(); //R?cup?ration d'une fonction dans la classe Console
		
		//==Op?ration d'affection==//
		p = 2 * Math.PI * rayon; // Calcul de p?rim?tre
		a = Math.PI * rayon * rayon; // Calcul de l'aire

		//==Affichage des r?sultats==//
		System.out.printf("\nLe P?rim?tre = %.3fcm?", p);   // Calcul et affichage du p?rim?tre en float
		System.out.printf("\nL'aire = %.3fcm?\n", a);       // Calcul et affichage de l'aire en float 

		System.out.println("\n---------------------------------------------------------");

		//-------------------------------------Exercice 1---------------------------------------------//
		
		//==Op?ration de d?claration==//
		int i = 7, b = 10;

		//==Op?ration d'affectation et d'affichage==//
		System.out.print("\nExercice 1 : ");

		i = i + b;
		System.out.print("\n7 + 10 = "+ i);

		b = i - b;
		System.out.print("\n7 - 10 = "+ b);
		
		i = i - b;
		System.out.print("\n7 - 10 = "+ i);

		System.out.println("\n\n---------------------------------------------------------");


		//-------------------------------------Exercice 2---------------------------------------------//

		//==Op?ration de d?claration==//
		int e = 7, f,g;

		//==Op?ration d'affectation et d'affichage==//
		System.out.print("\nExercice 2 : ");

		f = (e-2) * 3;
		System.out.print("\n(e-2) * 3 = e <=> " + f);

		g = 2 + b / 7;
		System.out.print("\n2 + b / 7 = g <=> " + g);
		
		e = f % g;
		System.out.print("\nf % g = e <=> " + e);

		System.out.println("\n\n---------------------------------------------------------");


		//-------------------------------------Exercice 3---------------------------------------------//

		//==Op?ration de d?claration==//
		int a1 = 306, b2,b1,b0;

		//==Op?ration d'affectation et d'affichage==//
		System.out.print("\nExercice 3 : ");

		b0 = a1 % 16;
		System.out.print("\na1 % 16 = "+ b0);
		a1 = a1 / 16;
		System.out.print("\na1 / 16 = "+ a1);
		b1 = a1 % 16;
		System.out.print("\na1 % 16 = "+ b1);
		a1 = a1 / 16;
		System.out.print("\na1 / 16 = "+ a1);
		b2 = a1 % 16;
		System.out.print("\na1 % 16 = "+ b2);


	}

}
