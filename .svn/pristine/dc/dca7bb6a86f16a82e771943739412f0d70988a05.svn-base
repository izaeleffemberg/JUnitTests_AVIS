package DaoMock;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidade.Bloqueio;
import entidade.Agendamento;
import entidade.Sala;
import entidade.Local;
import entidade.LocalVideo;
import entidade.Periodo;
import entidade.VideoConferencia;

public class AgendamentoDAO {
	
	private static List<Agendamento> lista = new ArrayList<Agendamento>();
	private static List<Bloqueio> bloqueios = new ArrayList<Bloqueio>();
	
	public AgendamentoDAO(){
		mockDados();
	}
	
	public void mockDados (){
		
		// Mock 1 - Agendamento comum;
		Local local1 = new Local();
		Sala sala1 = new Sala();
		local1.setNome("Local 1");
		sala1.setNome("Sala 1");
		sala1.setLocal(local1);
		
		Periodo periodo1 = new Periodo();
		
		periodo1.getInicio().set(Calendar.DAY_OF_MONTH, 24);
		periodo1.getInicio().set(Calendar.MONTH, 11);
		periodo1.getInicio().set(Calendar.YEAR, 2016);
		
		periodo1.getInicio().set(Calendar.HOUR_OF_DAY, 14);
		periodo1.getInicio().set(Calendar.MINUTE, 30);
		
		periodo1.getFim().set(Calendar.DAY_OF_MONTH, 24);
		periodo1.getFim().set(Calendar.MONTH, 11);
		periodo1.getFim().set(Calendar.YEAR, 2016);
		
		periodo1.getFim().set(Calendar.HOUR_OF_DAY, 15);
		periodo1.getFim().set(Calendar.MINUTE, 30);

		Agendamento agendamento1 = new Agendamento();
		
		agendamento1.setSala(sala1);
		agendamento1.setPeriodo(periodo1);
		
		// Mock 2 - Agendamento com Videoconf (Sala, localVideo, videoConf);

		Sala sala2 = new Sala();
		sala2.setNome("Sala 2");
		sala2.setLocal(local1);
		LocalVideo localVideo1 = new LocalVideo();
		localVideo1.setSala(sala2);
		localVideo1.setNome("localVideoconf 1");
		
		Sala sala3 = new Sala();
		sala3.setNome("Sala 3");
		sala3.setLocal(local1);
		LocalVideo localVideo2 = new LocalVideo();
		localVideo2.setSala(sala3);
		localVideo2.setNome("localVideoconf 2");
		
		VideoConferencia vc1 = new VideoConferencia();
		vc1.setOrigem(localVideo1);
		vc1.getDestinos().add(localVideo2);
		vc1.setDescricao("Videoconf DAO");

		Periodo periodo2 = new Periodo();
		
		periodo2.getInicio().set(Calendar.DAY_OF_MONTH, 25);
		periodo2.getInicio().set(Calendar.MONTH, 11);
		periodo2.getInicio().set(Calendar.YEAR, 2016);
		
		periodo2.getInicio().set(Calendar.HOUR_OF_DAY, 14);
		periodo2.getInicio().set(Calendar.MINUTE, 20);

		periodo2.getFim().set(Calendar.DAY_OF_MONTH, 25);
		periodo2.getFim().set(Calendar.MONTH, 11);
		periodo2.getFim().set(Calendar.YEAR, 2016);
		
		periodo2.getFim().set(Calendar.HOUR_OF_DAY, 15);
		periodo2.getFim().set(Calendar.MINUTE, 20);

		Agendamento agendamento2 = new Agendamento();
		agendamento2.setSala(localVideo1.getSala());
		agendamento2.setVideoConferencia(vc1);
		agendamento2.setPeriodo(periodo2);
		
		// Mock 3 - Boqueio de Sala;
		
		Sala sala4 = new Sala();
		sala4.setNome("Sala 4");
		sala4.setLocal(local1);

		Bloqueio bloq = new Bloqueio();
		
		Periodo periodo3 = new Periodo();
		
		periodo3.getInicio().set(Calendar.DAY_OF_MONTH, 25);
		periodo3.getInicio().set(Calendar.MONTH, 11);
		periodo3.getInicio().set(Calendar.YEAR, 2016);
		
		periodo3.getInicio().set(Calendar.HOUR_OF_DAY, 14);
		periodo3.getInicio().set(Calendar.MINUTE, 20);

		periodo3.getFim().set(Calendar.DAY_OF_MONTH, 26);
		periodo3.getFim().set(Calendar.MONTH, 11);
		periodo3.getFim().set(Calendar.YEAR, 2016);
		
		periodo3.getFim().set(Calendar.HOUR_OF_DAY, 15);
		periodo3.getFim().set(Calendar.MINUTE, 20);
		
		bloq.setSala(sala4);
		bloq.setPeriodo(periodo3);
		
		// iteracao das listas
		lista.add(agendamento1);
		lista.add(agendamento2);
		bloqueios.add(bloq);
		
	}

	public static List<Agendamento> getLista() {
		return lista;
	}
	
	public void addAgendamentoLista(Agendamento agendamento){
		this.lista.add(agendamento);
	}
	
	public void addBloqueioLista (Bloqueio bloqueio){
		this.bloqueios.add(bloqueio);
	}

	public static void setLista(List<Agendamento> lista) {
		AgendamentoDAO.lista = lista;
	}

	public static List<Bloqueio> getBloqueios() {
		return bloqueios;
	}

	public static void setBloqueios(List<Bloqueio> bloqueios) {
		AgendamentoDAO.bloqueios = bloqueios;
	}
	
}
