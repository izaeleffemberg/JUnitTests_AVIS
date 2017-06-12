package entidade;


public class LocalVideo {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private Sala sala;
	
	private Sala coringa;
	
	private String nome;
	private String ip;
	private String contato;
	private String responsavel;
	private boolean interno;
	private boolean ativa = true;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	public boolean isInterno() {
		return interno;
	}
	public void setInterno(boolean internoouexterno) {
		this.interno = internoouexterno;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LocalVideo other = (LocalVideo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	public final boolean isAtiva() {
		return ativa;
	}
	public final void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	public Sala getCoringa() {
		return coringa;
	}
	public void setCoringa(Sala coringa) {
		this.coringa = coringa;
	}

}
