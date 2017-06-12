package entidade;

import java.util.ArrayList;
import java.util.List;

public class VideoConferencia {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String descricao;
	
	private LocalVideo origem;
	
	private List<LocalVideo> destinos = new ArrayList<LocalVideo>(); 
	
	private String contato;
	private String telefone;
	private boolean checkgravar;
	private String observacao; 
	private String parecer; 
	private String nProcesso;
	private boolean cancelada;
	private String conexao;
	private String nChamado;
	private String solicitante;
	private boolean externa;
		
	private Periodo periodo;
	
	private StatusVideoConferencia status;
	
	private TipoConexaoVia tipoConexaoVia;
	
	public VideoConferencia(){
		
		periodo = new Periodo();
		status = StatusVideoConferencia.PENDENTE;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalVideo getOrigem() {
		return origem;
	}

	public void setOrigem(LocalVideo origem) {
		this.origem = origem;
	}

	public void setDestinos(ArrayList<LocalVideo> destinos) {
		this.destinos = destinos;
	}
	
	public void addDestino (LocalVideo destino){
		this.destinos.add(destino);
	}

	public StatusVideoConferencia getStatus() {
		return status;
	}

	public void setStatus(StatusVideoConferencia status) {
		this.status = status;
	}

	public List<LocalVideo> getDestinos() {
		return destinos;
	}

	public void setDestinos(List<LocalVideo> destinos) {
		this.destinos = destinos;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public boolean isCheckgravar() {
		return checkgravar;
	}

	public void setCheckgravar(boolean checkgravar) {
		this.checkgravar = checkgravar;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getParecer() {
		return parecer;
	}

	public void setParecer(String parecer) {
		this.parecer = parecer;
	}

	public String getnProcesso() {
		return nProcesso;
	}

	public void setnProcesso(String nProcesso) {
		this.nProcesso = nProcesso;
	}

	public boolean isCancelada() {
		return cancelada;
	}

	public void setCancelada(boolean cancelada) {
		this.cancelada = cancelada;
	}

	public String getConexao() {
		return conexao;
	}

	public void setConexao(String conexao) {
		this.conexao = conexao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Periodo getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}

	public String getnChamado() {
		return nChamado;
	}

	public void setnChamado(String nChamado) {
		this.nChamado = nChamado;
	}
	
	public boolean isAutorizada (){
		if ( status == StatusVideoConferencia.LIBERADA )
			return true;
		else 
			return false;
	}

	public TipoConexaoVia getTipoConexaoVia() {
		return tipoConexaoVia;
	}

	public void setTipoConexaoVia(TipoConexaoVia tipoConexaoVia) {
		this.tipoConexaoVia = tipoConexaoVia;
	}
	
	public String getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
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
		VideoConferencia other = (VideoConferencia) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public boolean isExterna() {
		return externa;
	}

	public void setExterna(boolean externa) {
		this.externa = externa;
	}
	
	
}
