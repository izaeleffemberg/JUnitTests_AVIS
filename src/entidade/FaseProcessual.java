package entidade;

public enum FaseProcessual {	
	EM_CURSO("Em Curso"),
	
	ART_334("Art. 334, NCPC"),
	
	PRE_PROCESSUAL("Reclamação Pré-Processual");
	
	private final String descricao;
	
	FaseProcessual(String descricao){
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public String toString(){
		return this.descricao;
	}
}
