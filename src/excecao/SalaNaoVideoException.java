package excecao;

import entidade.Sala;

public class SalaNaoVideoException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public SalaNaoVideoException(Exception e) {
		super(e);
	}

	public SalaNaoVideoException(String msg) {
		super(msg);		
	}

	public SalaNaoVideoException(Sala sala) {
		super("A sala " + sala.getNome() + " não possui estrutura para video conferencia");		
	}

}
