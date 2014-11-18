package fr.syntheses.monprojet.main;

import java.util.Date;

import fr.syntheses.monprojet.NonZeroException;
import fr.syntheses.monprojet.Roue;
import fr.syntheses.monprojet.Voiture;



public class Lanceur {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Roue roue = new Roue("Michelin");
		
		Voiture voiture = new Voiture();
		
		System.out.println("hascode de la voiture " + voiture.hashCode());
		
		Date dateDeConst = new Date();
		
		voiture.setAnneeDeConstruction(dateDeConst);
		
		
		voiture.setMarque("renault");
		
		try {
			voiture.setNombreDePorte(0);
			
		} catch (NonZeroException e) {
			
			e.printStackTrace();
			
		} finally {
			
			voiture.setNombreDePorte(4);
		}
		
		
		voiture.setRoue(roue);
		
		System.out.println("voiture quel est la marque des roues ?" + voiture.getRoue().getMarque());
		
		System.out.println("voiture getNombreDePorte ?" + voiture.getNombreDePorte());
		
		System.out.println("voituregetAnneeDeConstruction ?" + voiture.getAnneeDeConstruction());
		
		System.out.println("voiture avance !");
		
		voiture.avancer();
		
		

	}

}
