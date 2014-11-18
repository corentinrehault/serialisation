package fr.syntheses.projet2.main;

import fr.syntheses.projet2.Capitale;
import fr.syntheses.projet2.Ville;

/**
 * @author dao303
 *
 */
public class ClasseMain {

	/**
	 * @param args arguments
	 */
	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		/*Ville v0 = new Ville();
		
		System.out.println("Nbre d'instances de la classe Ville : " + Ville.getNbreInstances());
		
		Ville v1 = new Ville("Marseille", "France", 600000);
		
		System.out.println("Nbre d'instances de la classe Ville : " + Ville.getNbreInstances());
		
		Ville v2 = new Ville("Rio", "Brésil", 8000000);
		
		System.out.println("Nbre d'instances de la classe Ville : " + Ville.getNbreInstances());
		
		System.out.println("\n\n" + v1.decrisToi());
		System.out.println(v0.decrisToi());
		System.out.println(v2.decrisToi() + "\n\n");
		System.out.println(v1.comparer(v2));
		
		Capitale cap = new Capitale();
		System.out.println(cap.decrisToi());
		
		Capitale cap2 = new Capitale("Paris", "France", 5000000, "la tour Eiffel");
		System.out.println(cap2.decrisToi());*/
	
		//tableau de villes null
		Ville[] tableau = new Ville[6];
		
		//tableau de noms de villes et de nombre d'habitants
		String[] tab = {"Marseille", "Lille", "Caen", "Lyon", "Paris", "Nantes"};
		int[] tab2 = {123456, 78456, 654987, 75832165, 1594, 213};
		
		//3 premiers Villes, 3 autres Capitales
		for(int i = 0; i < 6; i++) {
			if (i < 3) {
				Ville V = new Ville(tab[i], "France", tab2[i]);
				tableau[i] = V;
			} else {
				Capitale C = new Capitale(tab[i], "France", tab2[i], "la tour Eiffel");
				tableau[i] = C;
			}
		
		for (Ville villa : tableau) {
			System.out.println(villa.decrisToi() + "\n");
		}
		
		}
		
	}

}
