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
		super("O número do processo não é válido");		
	}

}
