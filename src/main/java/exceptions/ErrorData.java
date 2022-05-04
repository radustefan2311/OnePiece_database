package exceptions;

public class ErrorData extends Exception {
	
	private static final long serialVersionUID = 1L;
	public ErrorData(String cause){
        super(cause);
    }
}
