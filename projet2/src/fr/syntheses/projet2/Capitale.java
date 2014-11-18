/**
 * 
 */
package fr.syntheses.projet2;

/**
 * @author dao303
 *
 */
public class Capitale extends Ville {
	
	/**
	 *  monument.
	 */
	private String monument;
	
	/**
	 * @return the monument
	 */
	public final String getMonument() {
		return monument;
	}

	/**
	 * @param pmonument the monument to set
	 */
	public final void setMonument(final String pMonument) {
		this.monument = pMonument;
	}

	/**
	 *  Capitale.
	 */
	public Capitale() {
		super();
		monument = "aucun";
	}
	
	/**
	 * @param pNom nom
	 * @param pPays pays
	 * @param pNbre hab
	 * @param pMonument monument
	 */
	public Capitale(final String pNom, final String pPays, final int pNbre, final String pMonument) {
		super(pNom, pPays, pNbre);
		this.monument = pMonument;
	}
	
	
	/* (non-Javadoc)
	 * @see fr.syntheses.projet2.Ville#decrisToi()
	 */
	public String decrisToi() {
		String str = super.decrisToi() + "\n \t ==>>" + this.monument + " en est un monument";
		return str;
	}

}
