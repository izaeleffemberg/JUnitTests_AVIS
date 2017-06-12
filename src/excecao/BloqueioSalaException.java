package excecao;

import java.util.List;

import entidade.Agendamento;

public class BloqueioSalaException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public BloqueioSalaException(Exception e) {
		super(e);
	}

	public BloqueioSalaException(String msg) {
		super(msg);		
	}

	public BloqueioSalaException() {
		super("A sala escolhida está bloqueada para o período selecionado");		
	}


}
