package entidade;

/**
 * @author Izael Effemberg 
 * **/

public enum TipoConexaoVia{
	
		INTRANET("Intranet"),
		INTERNET("Internet"),
		EXTRANET("Extranet"),
		INFOVIA("Infovia");
	
	private final String descricao;
	
	TipoConexaoVia(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}
