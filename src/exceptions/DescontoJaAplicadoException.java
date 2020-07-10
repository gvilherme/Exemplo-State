package exceptions;

public class DescontoJaAplicadoException extends Exception {

	public DescontoJaAplicadoException() {
		super("O desconto de cada estado só ser aplicado uma vez!");
		// TODO Auto-generated constructor stub
	}

	public DescontoJaAplicadoException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public DescontoJaAplicadoException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public DescontoJaAplicadoException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
