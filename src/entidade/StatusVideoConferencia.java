package entidade;


public enum StatusVideoConferencia{
		LIBERADA("LIBERADA"),
		PENDENTE("PENDENTE"),
		REALIZADA("REALIZADA"),
		CANCELADO("CANCELADO");
		
		private final String descricao;
		
		StatusVideoConferencia(String descricao){
			this.descricao = descricao;
		}
		
		public String getDescricao() {
			return descricao;
		}
		
	}
	