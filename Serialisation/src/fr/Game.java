/**
 * 
 */
package fr;

import java.io.Serializable;

/**
 * @author dao303
 *
 */
public class Game implements Serializable {
	private String nom, style;
	private double prix;
	
	//Cette variable ne sera pas sérialisée avec transient
	
	private transient Notice notice;
	
	public Game(String nom, String style, double prix) {
		this.nom = nom;
		this.style = style;
		this.prix = prix;
		this.notice = new Notice ();
	}
	
	public String toString() {
		return "Nom du jeu : " + this.nom +
				"\nStyle de jeu : " + this.style +
				"\nPrix du jeu : " + this.prix +
				"\n";
	}

}
