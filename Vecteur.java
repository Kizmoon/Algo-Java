package labo2;

public class Vecteur {
	public static void main(String[] args) {

		/*
			// Variable :
				- Composante x du vecteur (affectation) => x
				- Composante y du vecteur (affectation) => y
				- Résultat de la norme du vecteur       => normeV
		*/		
			
		// Formule : racine carré de (x^2+y^2)

		//=====Variable=====//
		double x,y;
		double normeV;

		//=====Affectation=====//
		System.out.print("\nComposant x du vecteur : ");
		x = Console.lireDouble();

		System.out.print("Composant y du vecteur : ");
		y = Console.lireDouble();

		//=====Opération=====//
		normeV = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));

		//=====Résultat=====//
		System.out.printf("\nLa norme du vecteur (%.1f et %.1f) : %.1f",x,y,normeV);


	}
}