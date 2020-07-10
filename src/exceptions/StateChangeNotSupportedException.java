package exceptions;

public class StateChangeNotSupportedException extends Exception {

	public StateChangeNotSupportedException() {
		super("Impossível realizar está troca de estados.");
		
	}

	public StateChangeNotSupportedException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public StateChangeNotSupportedException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public StateChangeNotSupportedException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
}
