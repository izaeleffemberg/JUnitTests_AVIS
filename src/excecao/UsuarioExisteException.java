package excecao;

import java.sql.SQLException;

public class UsuarioExisteException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public UsuarioExisteException(Exception e) {
		super(e);
	}

	public UsuarioExisteException(String msg) {
		super(msg);		
	}

	public UsuarioExisteException() {
		super("Já existe um usuario com este login");		
	}
}
