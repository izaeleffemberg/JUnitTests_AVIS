package excecao;

public class NumeroProcessoException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public NumeroProcessoException(Exception e) {
		super(e);
	}

	public NumeroProcessoException(String msg) {
		super(msg);		
	}

	public NumeroProcessoException() {
		super("O n�mero do processo n�o � v�lido");		
	}

}
