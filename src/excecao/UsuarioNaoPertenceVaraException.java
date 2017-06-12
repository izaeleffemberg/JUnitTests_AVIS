package excecao;

import entidade.Sala;

public class UsuarioNaoPertenceVaraException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public UsuarioNaoPertenceVaraException(Exception e) {
		super(e);
	}

	public UsuarioNaoPertenceVaraException(String msg) {
		super(msg);		
	}

	public UsuarioNaoPertenceVaraException() {
		super("O usu�rio n�o tem acesso a essa vara!");		
	}
}