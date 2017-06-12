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
		super("N�o � poss�vel desfazer o cancelamento dessa audi�ncia. Outro agendamento foi realizado nesse hor�rio enquanto constava como cancelada");		
	}

}