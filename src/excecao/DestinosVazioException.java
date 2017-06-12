package excecao;

public class DestinosVazioException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public DestinosVazioException(Exception e) {
		super(e);
	}

	public DestinosVazioException(String msg) {
		super(msg);		
	}

	public DestinosVazioException() {
		super("� necess�rio escolher pelo menos um destino");		
	}

}
