package fr.syntheses.projet2.main;

import fr.syntheses.projet2.Capitale;
import fr.syntheses.projet2.Constantes;
import fr.syntheses.projet2.NomVilleException;
import fr.syntheses.projet2.NombreHabitantException;
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
		Ville v0 = new Ville();
		
		System.out.println("Nbre d'instances de la classe Ville : " + Ville.getNbreInstances());
		
		Ville v1 = null;
		try {
			v1 = new Ville("Marseille", "France", Constantes.CINQCENTMILLE);
		} catch (NombreHabitantException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NomVilleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Nbre d'instances de la classe Ville : " + Ville.getNbreInstances());
		
		Ville v2 = null;
		try {
			v2 = new Ville("Rio", "Brésil", Constantes.DIXMILLION);
		} catch (NombreHabitantException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NomVilleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Ville v3 = null;
		try {
			v3 = new Ville("Rennes", "France", 12000);
		} catch (NombreHabitantException e) {
			e.printStackTrace();
		} catch (NomVilleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if (v3 == null) {
				v3 = new Ville();
			}
		}
		
		Ville v4 = null;
		try {
			v4 = new Ville("IledeRé", "France", Constantes.DIXMILLE);
		} catch (NombreHabitantException e) {
			e.printStackTrace();
		} catch (NomVilleException e) {
			e.printStackTrace();
		}
		
		System.out.println("Nbre d'instances de la classe Ville : " + Ville.getNbreInstances());
		
		System.out.println("\n\n" + v1.toString());
		System.out.println(v0.toString());
		System.out.println(v2.toString() + "\n\n");
		System.out.println(v1.comparer(v2));
		System.out.println(v3.toString());
		System.out.println(v4.toString());
		
		Capitale cap = new Capitale();
		System.out.println(cap.toString());
		
		Capitale cap2 = null;
		try {
			cap2 = new Capitale("Paris", "France", Constantes.CINQMILLION, "la tour Eiffel");
		} catch (NombreHabitantException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NomVilleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(cap2.toString());
	
		//tableau de villes null
		Ville[] tableau = new Ville[6];
		
		//tableau de noms de villes et de nombre d'habitants
		String[] tab = {"Marseille", "Lille", "Caen", "Lyon", "Paris", "Nantes"};
		int[] tab2 = {Constantes.UNMILLION, Constantes.CINQCENTMILLE, Constantes.CENTMILLE, Constantes.UNMILLION, Constantes.CINQMILLION, Constantes.CINQCENTMILLE};
		
		//3 premiers Villes, 3 autres Capitales
		for (int i = 0; i < 6; i++) {
			if (i < 3) {
				Ville v = null;
				try {
					v = new Ville(tab[i], "France", tab2[i]);
				} catch (NombreHabitantException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NomVilleException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				tableau[i] = v;
			} else {
				Capitale c =  null;
				try {
					c = new Capitale(tab[i], "France", tab2[i], "la tour Eiffel");
				} catch (NombreHabitantException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NomVilleException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				tableau[i] = c;
			}
		
		for (Ville t : tableau) {
			System.out.println(t.toString() + "\n");
		}
		
		}
		
	}

}
