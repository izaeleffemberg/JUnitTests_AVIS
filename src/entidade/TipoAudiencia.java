package entidade;

public enum TipoAudiencia{
	
	
	ADMONITORIA("Admonitória"),
	
	AUDIENCIA_PRELIMINAR("Audiência Preliminar"),
	
	CONCILIACAO("Conciliação"),
	
	ESCLARECIMENTO_PERICIA("Esclarecimento da Perícia"),
	
	INQUIRICAO_TESTEMUNHA_ACUSACAO_CRIMINAL("Inquirição de testemunha de acusação - criminal"),
	
	INSTRUCAO("Instrução"),
	
	INSTRUCAOJULGAMENTO("Instrução e Julgamento"),
	
	JUSTIFICACAO("Justificação"),
	
	SUSPENSAO_CONDICIONAL("Suspensão Condicional"),
	
	TRANSACAO_PENAL("Transação Penal");
	
	private final String descricao;
	
	TipoAudiencia(String descricao)
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
