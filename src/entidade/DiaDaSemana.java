package entidade;

public enum DiaDaSemana {
	DOMINGO("DOMINGO"),
	SEGUNDA("SEGUNDA"),
	TERÇA("TERÇA"),
	QUARTA("QUARTA"),
	QUINTA("QUINTA"),
	SEXTA("SEXTA"),
	SABADO("SABADO");
	
	
private final String descricao;
	
	DiaDaSemana(String descricao)
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
