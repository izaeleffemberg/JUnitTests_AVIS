package entidade;

public enum ResultadoAudiencia {

	REDESIGNADA("Redesignada"),
	
	CONCLUIDA("Concluida"),
	
	COM_ACORDO("Realizado um acordo"),
	
	ACORDO_ADMINISTRATIVO("Acordo Administrativo"),
	
	AUSENCIA_DA_PARTE("Ausencia da Parte"),
	
	SEM_ACORDO("Sem acordo"),
	
	OUTRO_MOTIVO("Outro motivo"),
	
	ACORDO_PENDENTE("Acordo Pendente");
	
	private final String descricao;
	
	ResultadoAudiencia(String descricao)
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
