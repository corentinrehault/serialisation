package fr.monappli;

public class User implements ContratInerface {
	
	private String nom;
	
	private int role;
	
	private int id;
	/* (non-Javadoc)
	 * @see fr.monappli.ContratInerface#getId()
	 */
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}
}