package fr.syntheses.projet2;

/**
 * @author dao303
 * 
 * Une ville possède un nom, un certain 
 * nombre d'habitants et appartient à un pays.
 */
public class Ville {
	
	/**
	 * Nom de ville.
	 */
	protected String nomVille;
	/**
	 * Nom de pays.
	 */
	protected String nomPays;
	/**
	 * Nombre d'habitants.
	 */
	protected int nbreHab;
	/**
	 * Catégorie.
	 */
	protected char categorie;
	/**
	 * Nbre Instances.
	 */
	protected static int nbreInstances = 0;


	/**
	 * Constructeur par défaut.
	 */
	public Ville() {
		nomVille = "Inconnu";
		nomPays = "Inconnu";
		nbreHab = 0;
		this.setCategorie();
		//On incrémente nos variables de classe à chaque appel aux constructeurs.
		nbreInstances++;
	}
	

	/**
	 * @param pNom the pNom.
	 * @param pPays the pPays
	 * @param pNbre the pNbre
	 */
	public Ville(final String pNom, final String pPays, final int pNbre)
		throws NombreHabitantException, NomVilleException
	{
		if (pNbre<0) {
			throw new NombreHabitantException(pNbre);
		}
		if (pNom.length() < 3) {
			throw new NomVilleException("Le nom de la ville est < 3 caractères ! nom = " + pNom);
		}
		
		else {
		nomVille = pNom;
		nomPays = pPays;
		nbreHab = pNbre;
		this.setCategorie();
		//On incrémente nos variables de classe à chaque appel aux constructeurs.
		nbreInstances++;
		}
	}
	
	

	/**
	 * @return the nomVille
	 */
	public final String getNomVille() {
		return nomVille;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\t" + this.nomVille + " est une ville de " + this.nomPays + ", elle comporte : " + this.nbreHab + " habitant(s) => elle est de catégorie : " + this.categorie;
	}


	/**
	 * @param pnomVille the nomVille to set
	 */
	public final void setNomVille(final String pnomVille) {
		this.nomVille = pnomVille;
	}

	/**
	 * @return the nomPays
	 */
	public final String getNomPays() {
		return nomPays;
	}

	/**
	 * @param pnomPays the nomPays to set
	 */
	public final void setNomPays(final String pnomPays) {
		this.nomPays = pnomPays;
	}

	/**
	 * @return the nbreHab
	 */
	public final int getNbreHab() {
		return nbreHab;
	}

	/**
	 * @param pnbreHab the nbreHab to set
	 */
	public final void setNbreHab(final int pnbreHab) {
		this.nbreHab = pnbreHab;
		this.setCategorie();
	}
	
	/**
	 * @return categorie
	 */
	public final char getCategorie() {
		return categorie;
	}
	
	/**
	 * setCategorie the categorie to set.
	 */
	private void setCategorie() {
		
		int[] bornesSup = {0, Constantes.MILLE, Constantes.DIXMILLE, Constantes.CENTMILLE,  Constantes.CINQCENTMILLE, Constantes.UNMILLION, Constantes.CINQMILLION, Constantes.DIXMILLION};
		char[] categories = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
		
		int i = 0;
		while (i < bornesSup.length && this.nbreHab > bornesSup[i]) {
			i++;
		}
		this.categorie = categories[i];
	}
	
	/**
	 * @param v1 the v1
	 * @return résultat de comparaison
	 */
	public final String comparer(final Ville v1) {
		String str = new String();
		
		if (v1.getNbreHab() > this.nbreHab) {
			str = v1.getNomVille() + " est une ville plus peuplée que " + this.nomVille;
		} else {
			str = this.nomVille + " est une ville plus peuplée que " + v1.getNomVille();
		}
		
		return str;
	}
	
	/**
	 * @return Nombre d'instances utilisées
	 */
	public static int getNbreInstances() {
		return nbreInstances;
	}

}