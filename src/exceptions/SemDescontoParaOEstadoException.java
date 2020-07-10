package exceptions;

public class SemDescontoParaOEstadoException extends Exception {

	public SemDescontoParaOEstadoException() {
		super("Este estado não possuí nenhum tipo de desconto para ser aplicado.");
		// TODO Auto-generated constructor stub
	}

	public SemDescontoParaOEstadoException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public SemDescontoParaOEstadoException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public SemDescontoParaOEstadoException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
