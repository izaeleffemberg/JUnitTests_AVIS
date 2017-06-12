package entidade;

public class Oitiva {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String nome;
	
	private String cpf;
	
	private String rg;
	
	private int incremento;
	
	private boolean chamada = false;

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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public boolean isChamada() {
		return chamada;
	}

	public void setChamada(boolean chamada) {
		this.chamada = chamada;
	}

	public int getIncremento() {
		return incremento;
	}

	public void setIncremento(int incremento) {
		this.incremento = incremento;
	}
	
}
