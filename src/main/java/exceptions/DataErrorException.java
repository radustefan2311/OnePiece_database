package exceptions;

public class DataErrorException extends Exception {
	
	private static final long serialVersionUID = 1L;
	public DataErrorException(String cause){
        super(cause);
    }
}
