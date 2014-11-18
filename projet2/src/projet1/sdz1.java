package projet1;

import java.util.Scanner;

import org.apache.log4j.Logger;


public class sdz1 {
	
	static Logger log = Logger.getLogger(sdz1.class);


	public static void main(String[] args) {
		log.fatal("Entering in main");
		// TODO Auto-generated method stub

		//Déclaration des variables
		Scanner sc = new Scanner(System.in);
		int choix = 0;
		double inCelsius;
		double inFaren;
		double faren;
		double celsius;
		double arrondFaren;
		double arrondCelsius;
		char reponse = 'o';

		while(reponse == 'o')
		{
			log.trace("reponse =" + reponse);
			reponse = 1;
			// Choix du type de conversion
			while(choix != 1 && choix !=2)
			{
				System.out.println("Choix de la conversion :\n \t 1) Celsius en Farenheit \n \t 2) Farenheit en Celsius");
				choix = sc.nextInt();

			}

			// Récupération de la Temp à convertir et conversion
			switch (choix)
			{
			case 1:
				System.out.println("Temp °C à convertir : ");
				inCelsius = sc.nextDouble();
				faren = (1.8) * inCelsius + 32;
				arrondFaren = arrondi (faren,1);
				System.out.println(inCelsius + " °C correspond à : " + arrondFaren + " °F.");
				// vide le scanner
				sc.nextLine();
				break;
			case 2:
				System.out.println("Temp °F à convertir : ");
				inFaren = sc.nextDouble();
				celsius = inFaren -32 * 5 /9;
				arrondCelsius = arrondi (celsius,1);
				System.out.println(inFaren + " °F correspond à  : " + arrondCelsius + " °C.");
				// vide le scanner
				sc.nextLine();
				break;	

			}


			// Recommencer
			while(reponse !='o' && reponse !='n')
			{
				System.out.println("Voulez-vous faire une autre conversion ? (o/n)");
				log.trace("in Recommencer reponse =" + reponse);
			//	reponse = sc.next().toCharArray()[0];
				
				reponse = sc.nextLine().charAt(0);
				System.err.println(" ??? "+ reponse);


			}


			System.out.println("Au revoir...");
			log.info("in Recommencer reponse =" + reponse);
		}

	}	

	public static double arrondi(double A, int B){
		return (double) ((int)(A*Math.pow(10, B) +.5)) / Math.pow(10, B);
	}

}
