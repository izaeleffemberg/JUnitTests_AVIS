package entidade;

public class Agendamento {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String descricao;
	
	private TipoAgendamento tipoAgendamento;

	private Periodo periodo;
	
	private Sala sala;
	
	private Audiencia audiencia;
	
	private VideoConferencia videoConferencia;
		
	public Agendamento() {
		periodo = new Periodo();
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

	public TipoAgendamento getTipoAgendamento() {
		return tipoAgendamento;
	}
	public void setTipoAgendamento(TipoAgendamento tipoAgendamento) {
		this.tipoAgendamento = tipoAgendamento;
	}
	public Periodo getPeriodo() {
		return periodo;
	}
	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}
	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	
	public VideoConferencia getVideoConferencia() {
		return videoConferencia;
	}

	public void setVideoConferencia(VideoConferencia videoConferencia) {
		this.videoConferencia = videoConferencia;
	}

	public Audiencia getAudiencia() {
		return audiencia;
	}

	public void setAudiencia(Audiencia audiencia) {
		this.audiencia = audiencia;
	}
	
}
