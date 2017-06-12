package excecao;

import java.util.Iterator;
import java.util.List;

import entidade.Sala;

public class LocalNotEmptyException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public LocalNotEmptyException(Exception e) {
		super(e);
	}
	
	public LocalNotEmptyException(String msg) {
		super(msg);		
	}

	public LocalNotEmptyException() {
		super("O local não pode possuir salas para ser deletado");		
	}
	


}
