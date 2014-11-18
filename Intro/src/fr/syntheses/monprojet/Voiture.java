/**
 * 
 */
package fr.syntheses.monprojet;

import java.util.Date;

/**
 * @author corentin rehault
 * @17 nov. 2014
 * <h1>First Project </h1>
 * Repr�sente la structure d'un objet du monde r�el (abstrait ou concret).
 * Une voiture...
 */


public class Voiture {


	/* propertie  - propri�t� */

	/**
	 * La marque de la voiture
	 */
	private String marque;

	/**
	 * ....
	 */
	private Date anneeDeConstruction;

	/**
	 * .......
	 */
	private int nombreDePorte;
	
	
	/**
	 * Roue de la voiture
	 */
	private Roue roue;


	/* constructor - constructeur */


	/**
	 * Empty constructeur
	 */
	public Voiture() {
		System.out.println("instanciation d'un objet voiture");
	}


	/* getters et setters - accesseur et mutatateur */


	

	/**
	 * @return the roue
	 */
	public Roue getRoue() {
		return roue;
	}


	/**
	 * @param roue the roue to set
	 */
	public void setRoue(Roue roue) {
		this.roue = roue;
	}


	/**
	 * @return the anneeDeConstruction
	 */
	public Date getAnneeDeConstruction() {
		return anneeDeConstruction;
	}


	/**
	 * @param anneeDeConstruction the anneeDeConstruction to set
	 */
	public void setAnneeDeConstruction(Date anneeDeConstruction) {
		this.anneeDeConstruction = anneeDeConstruction;
	}


	/**
	 * @return the nombreDePorte
	 */
	public int getNombreDePorte() {
		return nombreDePorte;
	}


	/**
	 * @param nombreDePorte the nombreDePorte to set
	 */
	public void setNombreDePorte(int nombreDePorte) {
		
		if (nombreDePorte == 0) {
		throw new NonZeroException();	
			
		}
		
		this.nombreDePorte = nombreDePorte;
	}


	/* m�tier - comoportement */

	/**
	 * permet a la voiture d'avancer ..
	 */
	public void avancer() {
		System.out.println("J'avance !!!");

	}


	/**
	 * renvoi le nombre de porte lorsque l'on appui ...
	 * @return int ( nbr de porte)
	 */
	public int tableauDeBordDonnerNbrDePorte() {
		return this.nombreDePorte;
	}


	/**
	 * etc..
	 */
	public void sarreter() {
		System.out.println("je m'arrete !");
	}


	public String getMarque() {
		return marque;
	}


	public void setMarque(String marque) {
		this.marque = marque;
	}











}
