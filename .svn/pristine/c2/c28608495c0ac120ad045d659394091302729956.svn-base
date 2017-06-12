
package entidade;

public class Sala {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	private String descricao;
	private Long qtdPessoas;
	private boolean ativa = true;

	private Long totalAud;

	private Long audRealizadas;
	
	private Local local;
	
	private boolean coringa = false;
	
	
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	public Long getId() {
		return id;
	}	
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Long getQtdPessoas() {
		return qtdPessoas;
	}
	public void setQtdPessoas(Long qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}
	@Override
	public String toString() {
		return nome + " - " + local.getNome();
	}

	public boolean isCoringa() {
		return coringa;
	}

	public void setCoringa(boolean coringa) {
		this.coringa = coringa;
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
		Sala other = (Sala) obj;
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
	
	public Long getTotalAud() {
		
		return totalAud;
	}

	public void setTotalAud(Long totalAud) {
		this.totalAud = totalAud;
	}

	public Long getAudRealizadas() {
		return audRealizadas;
	}

	public void setAudRealizadas(Long audRealizadas) {
		this.audRealizadas = audRealizadas;
	}
	
}
