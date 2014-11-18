package fr.syntheses.monprojet;

public class NonZeroException extends ArithmeticException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NonZeroException() {
		System.err.println("not zero here  !");
		printStackTrace();
	}
	
	@Override
	public StackTraceElement[] getStackTrace() {
		// TODO Auto-generated method stub
		return super.getStackTrace();
	}
	
	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		super.printStackTrace();
	}

}
