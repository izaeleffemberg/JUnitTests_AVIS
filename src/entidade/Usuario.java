package entidade;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Usuario {
	
	private static final long serialVersionUID = 1L;
	
	private Long idusuario;
	
	private String nome;
	
	private String email;
	
	private String login;
	
	private String senha;
	
	private boolean ativo = true;
	
	private Collection<Log> logs;
	
	private Collection<Local> local;
	
	private List<String> permissoes;

	private List<Vara> varas;
	
	private int qntdDeLogs;
	
	private int posicaoNoRankDeLogs;
	
	private int comparacaoEntrePosicoes;
	
	private String senhaaux;

	public String getSenhaaux() {

		return senhaaux;
	}
	
	public void setSenhaaux(String senhaaux) {

		this.senhaaux = senhaaux;
	}	
	
	public Long getId() {
		return idusuario;
	}
	public void setId(Long id) {
		this.idusuario = id;
	}
	public Long getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(Long idusuario) {
		this.idusuario = idusuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Collection<Log> getLogs() {
		return logs;
	}
	public void setLogs(Collection<Log> logs) {
		this.logs = logs;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public List<String> getPermissoes() {
		return permissoes;
	}
	public void setPermissoes(List<String> permissoes) {
		this.permissoes = permissoes;
	}
	
	public int getQntdDeLogs() {
		return qntdDeLogs;
	}
	public void setQntdDeLogs(int qntdDeLogs) {
		this.qntdDeLogs = qntdDeLogs;
	}
	public int getPosicaoNoRankDeLogs() {
		return posicaoNoRankDeLogs;
	}
	public void setPosicaoNoRankDeLogs(int posicaoNoRankDeLogs) {
		this.posicaoNoRankDeLogs = posicaoNoRankDeLogs;
	}
	public int getComparacaoEntrePosicoes() {
		return comparacaoEntrePosicoes;
	}
	public void setComparacaoEntrePosicoes(int comparacaoEntrePosicoes) {
		this.comparacaoEntrePosicoes = comparacaoEntrePosicoes;
	}
	@Override  
    public boolean equals(Object obj){  
		if (this == obj)  
            return true;  
        if (obj == null)  
            return false;  
        if (!(obj instanceof Usuario))  
            return false;  
        Usuario other = (Usuario) obj;  
        if (getId() != null){  
            if (other.getId() != null)  
                return (getId().equals(other.getId()));  
        } 
        return false;  
    }
	public Collection<Local> getLocal() {
		return local;
	}
	public void setLocal(Collection<Local> local) {
		this.local = local;
	}
	public List<Vara> getVaras() {
		return varas;
	}
	public void setVaras(List<Vara> varas) {
		this.varas = varas;
	}  
	
	public List<String> getNumerosVaras() {
		List<String> numeros = new ArrayList<String>();
		for (Vara vara : getVaras()) {
			numeros.add(vara.getNumero());
		}
		return numeros;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
}
