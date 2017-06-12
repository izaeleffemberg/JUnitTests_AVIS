package excecao;

import entidade.Sala;

public class PeriodoFimAntesDeInicioException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public PeriodoFimAntesDeInicioException(Exception e) {
		super(e);
	}

	public PeriodoFimAntesDeInicioException(String msg) {
		super(msg);		
	}

	public PeriodoFimAntesDeInicioException() {
		super("A data final é menor que a data inicial");		
	}
}