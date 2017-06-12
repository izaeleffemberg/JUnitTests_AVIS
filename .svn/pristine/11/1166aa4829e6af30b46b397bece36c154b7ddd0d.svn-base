package excecao;

public class DescancelamentoConflitanteException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public DescancelamentoConflitanteException(Exception e) {
		super(e);
	}

	public DescancelamentoConflitanteException(String msg) {
		super(msg);		
	}

	public DescancelamentoConflitanteException() {
		super("Não é possível desfazer o cancelamento dessa audiência. Outro agendamento foi realizado nesse horário enquanto constava como cancelada");		
	}

}