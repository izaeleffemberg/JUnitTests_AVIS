package entidade;


public enum StatusAudiencia{
	
	AGUARDANDO("Aguardando"), //0
	
	ANDAMENTO("Andamento"),  //1
	
	REALIZADA("Realizada"), //2
	
	REDESIGNADA("Redesignada"), //3
	
	SUSPENSA("Suspensa"), //4
	
	ATRASADA("Atrasada"), //5 
	
	CANCELADA("Cancelada"), //6
	
	NAO_REALIZADA("Não realizada"); //7
	
	
	
	private final String descricao;
	
	StatusAudiencia(String descricao)
	{
		this.descricao = descricao;
	}
	
	public String getDescricao()
	{
		return this.descricao;
	}
	
	public String toString()
	{
		return this.descricao;
	}
}