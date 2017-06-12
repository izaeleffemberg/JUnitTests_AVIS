package excecao;

import entidade.Sala;

public class SalaPossuiLocaisVideoException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public SalaPossuiLocaisVideoException(Exception e) {
		super(e);
	}

	public SalaPossuiLocaisVideoException(String msg) {
		super(msg);		
	}

	public SalaPossuiLocaisVideoException() {
		super("A sala não pode ser deletada enquanto houver alguma sala de vídeo associada a ela");		
	}

}
