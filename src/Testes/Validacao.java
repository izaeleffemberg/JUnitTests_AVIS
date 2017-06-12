package Testes;

import java.util.ArrayList;
import java.util.Calendar;

import ServiceMock.ServiceAgendamento;
import entidade.Agendamento;
import entidade.LocalVideo;
import entidade.Periodo;
import entidade.Sala;
import entidade.VideoConferencia;
import excecao.BloqueioSalaException;
import excecao.ConflitoAgendamentoException;

public class Validacao {
	
	protected ServiceAgendamento service;
	
	/**
	 * Casos de testes 1, tipo básico;
	 * **/
	
	public void testeConflitoAgendamento1(){

		try {
		service = new ServiceAgendamento();
		
		Sala sala = service.getDao().getLista().get(0).getSala();
		
		Periodo periodo1 = new Periodo();
		
		periodo1.getInicio().set(Calendar.DAY_OF_MONTH, 24);
		periodo1.getInicio().set(Calendar.MONTH, 11);
		periodo1.getInicio().set(Calendar.YEAR, 2016);
		
		periodo1.getInicio().set(Calendar.HOUR_OF_DAY, 14);
		periodo1.getInicio().set(Calendar.MINUTE, 40);
		
		periodo1.getFim().set(Calendar.DAY_OF_MONTH, 24);
		periodo1.getFim().set(Calendar.MONTH, 11);
		periodo1.getFim().set(Calendar.YEAR, 2016);
		
		periodo1.getFim().set(Calendar.HOUR_OF_DAY, 15);
		periodo1.getFim().set(Calendar.MINUTE, 10);

		Agendamento agendamento1 = new Agendamento();
		
		agendamento1.setSala(sala);
		agendamento1.setPeriodo(periodo1);
		
		System.out.println("Caso básico 1");
		service.existeConflito(agendamento1);
		} catch (ConflitoAgendamentoException e){
			System.out.println("ConflitoAgendamentoException disparada, caso de teste atendido");
		}
	}
	
	public void testeConflitoAgendamento2() {

		try {

			service = new ServiceAgendamento();

			Sala sala = service.getDao().getLista().get(0).getSala();

			Periodo periodo1 = new Periodo();

			periodo1.getInicio().set(Calendar.DAY_OF_MONTH, 24);
			periodo1.getInicio().set(Calendar.MONTH, 11);
			periodo1.getInicio().set(Calendar.YEAR, 2016);

			periodo1.getInicio().set(Calendar.HOUR_OF_DAY, 14);
			periodo1.getInicio().set(Calendar.MINUTE, 10);

			periodo1.getFim().set(Calendar.DAY_OF_MONTH, 24);
			periodo1.getFim().set(Calendar.MONTH, 11);
			periodo1.getFim().set(Calendar.YEAR, 2016);

			periodo1.getFim().set(Calendar.HOUR_OF_DAY, 15);
			periodo1.getFim().set(Calendar.MINUTE, 40);

			Agendamento agendamento1 = new Agendamento();

			agendamento1.setSala(sala);
			agendamento1.setPeriodo(periodo1);

			System.out.println("Caso básico 2");
			service.existeConflito(agendamento1);
		} catch (ConflitoAgendamentoException e) {
			System.out.println("ConflitoAgendamentoException disparada, caso de teste atendido");
		}
	}
	
	public void testeConflitoAgendamento3(){
	
		try{
		service = new ServiceAgendamento();
		
		Sala sala = service.getDao().getLista().get(0).getSala();
			
		Periodo periodo1 = new Periodo();
		
		periodo1.getInicio().set(Calendar.DAY_OF_MONTH, 24);
		periodo1.getInicio().set(Calendar.MONTH, 11);
		periodo1.getInicio().set(Calendar.YEAR, 2016);
		
		periodo1.getInicio().set(Calendar.HOUR_OF_DAY, 14);
		periodo1.getInicio().set(Calendar.MINUTE, 10);
		
		periodo1.getFim().set(Calendar.DAY_OF_MONTH, 24);
		periodo1.getFim().set(Calendar.MONTH, 11);
		periodo1.getFim().set(Calendar.YEAR, 2016);
		
		periodo1.getFim().set(Calendar.HOUR_OF_DAY, 15);
		periodo1.getFim().set(Calendar.MINUTE, 10);

		Agendamento agendamento1 = new Agendamento();
		
		agendamento1.setSala(sala);
		agendamento1.setPeriodo(periodo1);
		
		System.out.println("Caso básico 3");
		service.existeConflito(agendamento1);
		
	} catch (ConflitoAgendamentoException e){
		System.out.println("ConflitoAgendamentoException disparada, caso de teste atendido");
	}
	}
	
	public void testeConflitoAgendamento4(){
	try{	
		service = new ServiceAgendamento();
		
		Sala sala = service.getDao().getLista().get(0).getSala();
			
		Periodo periodo1 = new Periodo();
		
		periodo1.getInicio().set(Calendar.DAY_OF_MONTH, 24);
		periodo1.getInicio().set(Calendar.MONTH, 11);
		periodo1.getInicio().set(Calendar.YEAR, 2016);
		
		periodo1.getInicio().set(Calendar.HOUR_OF_DAY, 15);
		periodo1.getInicio().set(Calendar.MINUTE, 10);
		
		periodo1.getFim().set(Calendar.DAY_OF_MONTH, 24);
		periodo1.getFim().set(Calendar.MONTH, 11);
		periodo1.getFim().set(Calendar.YEAR, 2016);
		
		periodo1.getFim().set(Calendar.HOUR_OF_DAY, 16);
		periodo1.getFim().set(Calendar.MINUTE, 10);

		Agendamento agendamento1 = new Agendamento();
		
		agendamento1.setSala(sala);
		agendamento1.setPeriodo(periodo1);
		
		System.out.println("Caso básico 4");
		service.existeConflito(agendamento1);
		
	} catch (ConflitoAgendamentoException e){
		System.out.println("ConflitoAgendamentoException disparada, caso de teste atendido");
	}
	}
	
	/**
	 * Casos de testes 2, tipo Bloqueio de sala;
	 * **/
	
	public void testeBloqueioCaso1 (){
		
		try{
		service = new ServiceAgendamento();
		
		Sala sala = service.getDao().getBloqueios().get(0).getSala();
			
		Periodo periodo1 = new Periodo();
		
		periodo1.getInicio().set(Calendar.DAY_OF_MONTH, 25);
		periodo1.getInicio().set(Calendar.MONTH, 11);
		periodo1.getInicio().set(Calendar.YEAR, 2016);
		
		periodo1.getInicio().set(Calendar.HOUR_OF_DAY, 15);
		periodo1.getInicio().set(Calendar.MINUTE, 10);
		
		periodo1.getFim().set(Calendar.DAY_OF_MONTH, 26);
		periodo1.getFim().set(Calendar.MONTH, 11);
		periodo1.getFim().set(Calendar.YEAR, 2016);
		
		periodo1.getFim().set(Calendar.HOUR_OF_DAY, 13);
		periodo1.getFim().set(Calendar.MINUTE, 10);

		Agendamento agendamento1 = new Agendamento();
		
		agendamento1.setSala(sala);
		agendamento1.setPeriodo(periodo1);
		
		System.out.println("Caso bloqueio 1");
		service.existeBloqueioPorPeriodo(agendamento1);
		} catch (BloqueioSalaException e){
			System.out.println("BloqueioSalaException disparada, caso de teste atendido");
		}
	}
	
	public void testeBloqueioCaso2 (){
		
		try{
		
		service = new ServiceAgendamento();
		
		Sala sala = service.getDao().getBloqueios().get(0).getSala();
			
		Periodo periodo1 = new Periodo();
		
		periodo1.getInicio().set(Calendar.DAY_OF_MONTH, 25);
		periodo1.getInicio().set(Calendar.MONTH, 11);
		periodo1.getInicio().set(Calendar.YEAR, 2016);
		
		periodo1.getInicio().set(Calendar.HOUR_OF_DAY, 14);
		periodo1.getInicio().set(Calendar.MINUTE, 10);
		
		periodo1.getFim().set(Calendar.DAY_OF_MONTH, 26);
		periodo1.getFim().set(Calendar.MONTH, 11);
		periodo1.getFim().set(Calendar.YEAR, 2016);
		
		periodo1.getFim().set(Calendar.HOUR_OF_DAY, 15);
		periodo1.getFim().set(Calendar.MINUTE, 30);

		Agendamento agendamento1 = new Agendamento();
		
		agendamento1.setSala(sala);
		agendamento1.setPeriodo(periodo1);
		
		System.out.println("Caso bloqueio 2");
		service.existeBloqueioPorPeriodo(agendamento1);
		} catch (BloqueioSalaException e){
			System.out.println("BloqueioSalaException disparada, caso de teste atendido");
		}
	}
	
	public void testeBloqueioCaso3 (){
		
		try{
		service = new ServiceAgendamento();
		
		Sala sala = service.getDao().getBloqueios().get(0).getSala();
			
		Periodo periodo1 = new Periodo();
		
		periodo1.getInicio().set(Calendar.DAY_OF_MONTH, 25);
		periodo1.getInicio().set(Calendar.MONTH, 11);
		periodo1.getInicio().set(Calendar.YEAR, 2016);
		
		periodo1.getInicio().set(Calendar.HOUR_OF_DAY, 14);
		periodo1.getInicio().set(Calendar.MINUTE, 10);
		
		periodo1.getFim().set(Calendar.DAY_OF_MONTH, 26);
		periodo1.getFim().set(Calendar.MONTH, 11);
		periodo1.getFim().set(Calendar.YEAR, 2016);
		
		periodo1.getFim().set(Calendar.HOUR_OF_DAY, 10);
		periodo1.getFim().set(Calendar.MINUTE, 30);

		Agendamento agendamento1 = new Agendamento();
		
		agendamento1.setSala(sala);
		agendamento1.setPeriodo(periodo1);
		
		System.out.println("Caso bloqueio 3");
		service.existeBloqueioPorPeriodo(agendamento1);
		} catch (BloqueioSalaException e){
			System.out.println("BloqueioSalaException disparada, caso de teste atendido");
		}
	}
	
	public void testeBloqueioCaso4 (){
		
		try{
		service = new ServiceAgendamento();
		
		Sala sala = service.getDao().getBloqueios().get(0).getSala();
			
		Periodo periodo1 = new Periodo();
		
		periodo1.getInicio().set(Calendar.DAY_OF_MONTH, 25);
		periodo1.getInicio().set(Calendar.MONTH, 11);
		periodo1.getInicio().set(Calendar.YEAR, 2016);
		
		periodo1.getInicio().set(Calendar.HOUR_OF_DAY, 14);
		periodo1.getInicio().set(Calendar.MINUTE, 50);
		
		periodo1.getFim().set(Calendar.DAY_OF_MONTH, 26);
		periodo1.getFim().set(Calendar.MONTH, 11);
		periodo1.getFim().set(Calendar.YEAR, 2016);
		
		periodo1.getFim().set(Calendar.HOUR_OF_DAY, 16);
		periodo1.getFim().set(Calendar.MINUTE, 10);

		Agendamento agendamento1 = new Agendamento();
		
		agendamento1.setSala(sala);
		agendamento1.setPeriodo(periodo1);
		
		System.out.println("Caso bloqueio 4");
		service.existeBloqueioPorPeriodo(agendamento1);
		} catch (BloqueioSalaException e){
			System.out.println("BloqueioSalaException disparada, caso de teste atendido");
		}
	}
	
	/**
	 * Casos de testes 3, conflito no destino da videoconf (caso seja interno);
	 * **/
	public void testeAgendVideoconf1(){
		
		try{
		service = new ServiceAgendamento();
		
		LocalVideo localVideo = service.getDao().getLista().get(1).getVideoConferencia().getOrigem();
		Sala salaDestino = service.getDao().getLista().get(1).getSala();
		
		Sala salaOrigem = new Sala();
		salaOrigem.setNome("Teste de video conf - Origem");
		LocalVideo localVideoOrigem = new LocalVideo();
		localVideoOrigem.setSala(salaOrigem);
		
		VideoConferencia videoConf = new VideoConferencia();
		videoConf.setOrigem(localVideoOrigem);
		videoConf.setDestinos(new ArrayList<LocalVideo>());
		videoConf.getDestinos().add(localVideo);

		Periodo periodo1 = new Periodo();
		
		periodo1.getInicio().set(Calendar.DAY_OF_MONTH, 25);
		periodo1.getInicio().set(Calendar.MONTH, 11);
		periodo1.getInicio().set(Calendar.YEAR, 2016);
		
		periodo1.getInicio().set(Calendar.HOUR_OF_DAY, 14);
		periodo1.getInicio().set(Calendar.MINUTE, 30);
		
		periodo1.getFim().set(Calendar.DAY_OF_MONTH, 25);
		periodo1.getFim().set(Calendar.MONTH, 11);
		periodo1.getFim().set(Calendar.YEAR, 2016);
		
		periodo1.getFim().set(Calendar.HOUR_OF_DAY, 14);
		periodo1.getFim().set(Calendar.MINUTE, 50);

		Agendamento agendamento1 = new Agendamento();
		
		agendamento1.setSala(salaOrigem);
		agendamento1.setPeriodo(periodo1);
		agendamento1.setVideoConferencia(videoConf);
		
		System.out.println("Teste Videoconf 1");
		
		service.existeConflito(agendamento1);

	} catch (ConflitoAgendamentoException e){
			System.out.println("ConflitoAgendamentoException disparada, caso de teste atendido");
	}
		
	}

	public void testeAgendVideoconf2(){
		try{
		service = new ServiceAgendamento();
		
		LocalVideo localVideo = service.getDao().getLista().get(1).getVideoConferencia().getOrigem();
		Sala salaDestino = service.getDao().getLista().get(1).getSala();
		
		Sala salaOrigem = new Sala();
		salaOrigem.setNome("Teste de video conf - Origem");
		LocalVideo localVideoOrigem = new LocalVideo();
		localVideoOrigem.setSala(salaOrigem);
		
		VideoConferencia videoConf = new VideoConferencia();
		videoConf.setOrigem(localVideoOrigem);
		videoConf.setDestinos(new ArrayList<LocalVideo>());
		videoConf.getDestinos().add(localVideo);

		Periodo periodo1 = new Periodo();
		
		periodo1.getInicio().set(Calendar.DAY_OF_MONTH, 25);
		periodo1.getInicio().set(Calendar.MONTH, 11);
		periodo1.getInicio().set(Calendar.YEAR, 2016);
		
		periodo1.getInicio().set(Calendar.HOUR_OF_DAY, 14);
		periodo1.getInicio().set(Calendar.MINUTE, 10);
		
		periodo1.getFim().set(Calendar.DAY_OF_MONTH, 25);
		periodo1.getFim().set(Calendar.MONTH, 11);
		periodo1.getFim().set(Calendar.YEAR, 2016);
		
		periodo1.getFim().set(Calendar.HOUR_OF_DAY, 15);
		periodo1.getFim().set(Calendar.MINUTE, 40);

		Agendamento agendamento1 = new Agendamento();
		
		agendamento1.setSala(salaOrigem);
		agendamento1.setPeriodo(periodo1);
		agendamento1.setVideoConferencia(videoConf);

		System.out.println("Teste Videoconf 2");
		service.existeConflito(agendamento1);
		} catch (ConflitoAgendamentoException e){
			System.out.println("ConflitoAgendamentoException disparada, caso de teste atendido");
		}
	}
	
	public void testeAgendVideoconf3(){
		try{
		service = new ServiceAgendamento();
		
		LocalVideo localVideo = service.getDao().getLista().get(1).getVideoConferencia().getOrigem();
		Sala salaDestino = service.getDao().getLista().get(1).getSala();
		
		Sala salaOrigem = new Sala();
		salaOrigem.setNome("Teste de video conf - Origem");
		LocalVideo localVideoOrigem = new LocalVideo();
		localVideoOrigem.setSala(salaOrigem);
		
		VideoConferencia videoConf = new VideoConferencia();
		videoConf.setOrigem(localVideoOrigem);
		videoConf.setDestinos(new ArrayList<LocalVideo>());
		videoConf.getDestinos().add(localVideo);

		Periodo periodo1 = new Periodo();
		
		periodo1.getInicio().set(Calendar.DAY_OF_MONTH, 25);
		periodo1.getInicio().set(Calendar.MONTH, 11);
		periodo1.getInicio().set(Calendar.YEAR, 2016);
		
		periodo1.getInicio().set(Calendar.HOUR_OF_DAY, 14);
		periodo1.getInicio().set(Calendar.MINUTE, 10);
		
		periodo1.getFim().set(Calendar.DAY_OF_MONTH, 25);
		periodo1.getFim().set(Calendar.MONTH, 11);
		periodo1.getFim().set(Calendar.YEAR, 2016);
		
		periodo1.getFim().set(Calendar.HOUR_OF_DAY, 14);
		periodo1.getFim().set(Calendar.MINUTE, 40);

		Agendamento agendamento1 = new Agendamento();
		
		agendamento1.setSala(salaOrigem);
		agendamento1.setPeriodo(periodo1);
		agendamento1.setVideoConferencia(videoConf);

		System.out.println("Teste Videoconf 3");
		service.existeConflito(agendamento1);
		} catch (ConflitoAgendamentoException e){
			System.out.println("ConflitoAgendamentoException disparada, caso de teste atendido");
		}
	}
	
	public void testeAgendVideoconf4(){
		
		try{
		service = new ServiceAgendamento();
		
		LocalVideo localVideo = service.getDao().getLista().get(1).getVideoConferencia().getOrigem();
		Sala salaDestino = service.getDao().getLista().get(1).getSala();
		
		Sala salaOrigem = new Sala();
		salaOrigem.setNome("Teste de video conf - Origem");
		LocalVideo localVideoOrigem = new LocalVideo();
		localVideoOrigem.setSala(salaOrigem);
		
		VideoConferencia videoConf = new VideoConferencia();
		videoConf.setOrigem(localVideoOrigem);
		videoConf.setDestinos(new ArrayList<LocalVideo>());
		videoConf.getDestinos().add(localVideo);

		Periodo periodo1 = new Periodo();
		
		periodo1.getInicio().set(Calendar.DAY_OF_MONTH, 25);
		periodo1.getInicio().set(Calendar.MONTH, 11);
		periodo1.getInicio().set(Calendar.YEAR, 2016);
		
		periodo1.getInicio().set(Calendar.HOUR_OF_DAY, 14);
		periodo1.getInicio().set(Calendar.MINUTE, 50);
		
		periodo1.getFim().set(Calendar.DAY_OF_MONTH, 25);
		periodo1.getFim().set(Calendar.MONTH, 11);
		periodo1.getFim().set(Calendar.YEAR, 2016);
		
		periodo1.getFim().set(Calendar.HOUR_OF_DAY, 15);
		periodo1.getFim().set(Calendar.MINUTE, 40);

		Agendamento agendamento1 = new Agendamento();
		
		agendamento1.setSala(salaOrigem);
		agendamento1.setPeriodo(periodo1);
		agendamento1.setVideoConferencia(videoConf);
		
		System.out.println("Teste Videoconf 4");
		service.existeConflito(agendamento1);
		} catch (ConflitoAgendamentoException e){
			System.out.println("ConflitoAgendamentoException disparada, caso de teste atendido");
		}
	}
	
	public void agendamentoMelhorCaso (){
		try{
		service = new ServiceAgendamento();
		
		Sala sala = service.getDao().getLista().get(0).getSala();
		
		Periodo periodo1 = new Periodo();
		
		periodo1.getInicio().set(Calendar.DAY_OF_MONTH, 24);
		periodo1.getInicio().set(Calendar.MONTH, 11);
		periodo1.getInicio().set(Calendar.YEAR, 2016);
		
		periodo1.getInicio().set(Calendar.HOUR_OF_DAY, 8);
		periodo1.getInicio().set(Calendar.MINUTE, 10);
		
		periodo1.getFim().set(Calendar.DAY_OF_MONTH, 24);
		periodo1.getFim().set(Calendar.MONTH, 11);
		periodo1.getFim().set(Calendar.YEAR, 2016);
		
		periodo1.getFim().set(Calendar.HOUR_OF_DAY, 9);
		periodo1.getFim().set(Calendar.MINUTE, 15);

		Agendamento agendamento1 = new Agendamento();
		
		agendamento1.setSala(sala);
		agendamento1.setPeriodo(periodo1);
		
		System.out.println("Teste agendamento caso otimo");
		service.existeConflito(agendamento1);
		service.existeBloqueioPorPeriodo(agendamento1);
		
		} catch (RuntimeException e){
			e.printStackTrace();
		}
			System.out.println("Agendamento sem conflito!!!");
	}
	
	public void testeVideoconfCasoOtimo(){
		
		try{
		service = new ServiceAgendamento();
		
		LocalVideo localVideo = service.getDao().getLista().get(1).getVideoConferencia().getOrigem();
		Sala salaDestino = service.getDao().getLista().get(1).getSala();
		
		Sala salaOrigem = new Sala();
		salaOrigem.setNome("Teste de video conf - Origem");
		LocalVideo localVideoOrigem = new LocalVideo();
		localVideoOrigem.setSala(salaOrigem);
		
		VideoConferencia videoConf = new VideoConferencia();
		videoConf.setOrigem(localVideoOrigem);
		videoConf.setDestinos(new ArrayList<LocalVideo>());
		videoConf.getDestinos().add(localVideo);

		Periodo periodo1 = new Periodo();
		
		periodo1.getInicio().set(Calendar.DAY_OF_MONTH, 25);
		periodo1.getInicio().set(Calendar.MONTH, 11);
		periodo1.getInicio().set(Calendar.YEAR, 2016);
		
		periodo1.getInicio().set(Calendar.HOUR_OF_DAY, 8);
		periodo1.getInicio().set(Calendar.MINUTE, 30);
		
		periodo1.getFim().set(Calendar.DAY_OF_MONTH, 25);
		periodo1.getFim().set(Calendar.MONTH, 11);
		periodo1.getFim().set(Calendar.YEAR, 2016);
		
		periodo1.getFim().set(Calendar.HOUR_OF_DAY, 9);
		periodo1.getFim().set(Calendar.MINUTE, 30);

		Agendamento agendamento1 = new Agendamento();
		
		agendamento1.setSala(salaOrigem);
		agendamento1.setPeriodo(periodo1);
		agendamento1.setVideoConferencia(videoConf);
		
		System.out.println("Teste Videoconf 1");
		
		service.existeConflito(agendamento1);

	} catch (ConflitoAgendamentoException e){
			System.out.println("ConflitoAgendamentoException disparada, caso de teste atendido");
	}
		
		System.out.println("Agendamento de videoConf sem conflito!!");
		
	}
	
}