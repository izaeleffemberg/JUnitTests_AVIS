package entidade;

import java.util.Date;

public class Log  {

	private static final long serialVersionUID = 1L;

	private Long id;
	
	private Usuario usuario;
	
	private Date data;
	
	private String nomeTabela;
	
	private Long idLinhaTabela;
	
	private int tipoTransacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getNomeTabela() {
		return nomeTabela;
	}

	public void setNomeTabela(String nomeTabela) {
		this.nomeTabela = nomeTabela;
	}

	public Long getIdLinhaTabela() {
		return idLinhaTabela;
	}

	public void setIdLinhaTabela(Long idLinhaTabela) {
		this.idLinhaTabela = idLinhaTabela;
	}

	public int getTipoTransacao() {
		return tipoTransacao;
	}

	public void setTipoTransacao(int tipoTransacao) {
		this.tipoTransacao = tipoTransacao;
	}

}
