package entidade;

import java.util.ArrayList;
import java.util.List;

public class Audiencia {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String descricao;
	
	private Processo processo;
	
	private TipoAudiencia tipo;
	
	private StatusAudiencia status;
	
	private FaseProcessual faseProcessual;
	
	private Agendamento agendamento;
	
	private VideoConferencia videoConferencia;
	
	private String conciliadorJuiz;

	private Usuario usuario;
	
	private Usuario gestorDaPauta;
	
	private List<Oitiva> oitivas;
	
	private boolean externa;
	
	
	private ResultadoAudiencia resultadoAudiencia;
	
	private Boolean redesignada;
	
	public String valorDoAcordo;
		
	public Audiencia() {
		
		agendamento = new Agendamento();
		processo = new Processo();
		usuario = new Usuario();
		
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
	public Agendamento getAgendamento() {
		return agendamento;
	}
	public void setAgendamento(Agendamento agendamento) {
		this.agendamento = agendamento;
	}

	public Processo getProcesso() {
		return processo;
	}

	public void setProcesso(Processo processo) {
		this.processo = processo;
	}

	public TipoAudiencia getTipo() {
		return tipo;
	}

	public void setTipo(TipoAudiencia tipo) {
		this.tipo = tipo;
	}

	public StatusAudiencia getStatus() {
		return status;
	}

	public void setStatus(StatusAudiencia status) {
		this.status = status;
	}

	public String getConciliadorJuiz() {
		return conciliadorJuiz;
	}

	public void setConciliadorJuiz(String conciliadorJuiz) {
		this.conciliadorJuiz = conciliadorJuiz;
	}

	public VideoConferencia getVideoConferencia() {
		return videoConferencia;
	}

	public void setVideoConferencia(VideoConferencia videoConferencia) {
		this.videoConferencia = videoConferencia;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public boolean isExterna() {
		return externa;
	}

	public void setExterna(boolean externa) {
		this.externa = externa;
	}

	public List<Oitiva> getOitivas() {
		return oitivas;
	}

	public void setOitivas(List<Oitiva> oitivas) {
		this.oitivas = oitivas;
	}

	public ResultadoAudiencia getResultadoAudiencia() {
		return resultadoAudiencia;
	}

	public void setResultadoAudiencia(ResultadoAudiencia resultadoAudiencia) {
		this.resultadoAudiencia = resultadoAudiencia;
	}

	public String getValorDoAcordo() {
		return valorDoAcordo;
	}

	public void setValorDoAcordo(String valorDoAcordo) {
		this.valorDoAcordo = valorDoAcordo;
	}
	
	public Boolean getRedesignada() {	
		return redesignada;
	}

	public Usuario getGestorDaPauta() {
		return gestorDaPauta;
	}

	public void setGestorDaPauta(Usuario gestorDaPauta) {
		this.gestorDaPauta = gestorDaPauta;
	}

	public void setRedesignada(Boolean redesignada) {
		this.redesignada = redesignada;
	}
	
	public FaseProcessual getFaseProcessual() {
		return faseProcessual;
	}

	public void setFaseProcessual(FaseProcessual faseProcessual) {
		this.faseProcessual = faseProcessual;
	}
}
