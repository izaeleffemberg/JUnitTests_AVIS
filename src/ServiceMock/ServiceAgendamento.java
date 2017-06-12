package ServiceMock;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.omg.PortableServer.ThreadPolicyOperations;

import DaoMock.AgendamentoDAO;
import entidade.Agendamento;
import entidade.Bloqueio;
import entidade.LocalVideo;
import entidade.Sala;
import excecao.ConflitoAgendamentoException;
import excecao.BloqueioSalaException;


public class ServiceAgendamento {

	protected AgendamentoDAO dao;
	
	public ServiceAgendamento (){
		dao = new AgendamentoDAO();
	}
	
	public void verificarConflitosVideoConf(Agendamento agendamento) throws ConflitoAgendamentoException{
			
		//existeConflito(agendamento); // verificação da origem, caso anteriormente testado no teste basico;
		
		if (agendamento.getVideoConferencia() != null){

			Calendar horaInicial = agendamento.getPeriodo().getInicio();
			Calendar horaFinal = agendamento.getPeriodo().getFim();
			
			for (LocalVideo l : agendamento.getVideoConferencia().getDestinos()) {
								
				for (Agendamento agend : dao.getLista()) {
					
					if (agend.getSala().equals(l.getSala())) {
						
						if (horaInicial.after(agend.getPeriodo().getInicio()) && horaFinal.before(agend.getPeriodo().getFim()) ){
							String mensagem = "Já existem agendamentos nesse período e destino. ";
							throw new ConflitoAgendamentoException(mensagem);
						} else if (horaInicial.before(agend.getPeriodo().getInicio()) && horaFinal.after(agend.getPeriodo().getFim())){
							String mensagem = "Já existem agendamentos nesse período e destino. ";
							throw new ConflitoAgendamentoException(mensagem);
						} else if (horaInicial.before(agend.getPeriodo().getInicio()) && horaFinal.before(agend.getPeriodo().getFim()) && horaFinal.after(agend.getPeriodo().getInicio())){
							String mensagem = "Já existem agendamentos nesse período e destino. ";
							throw new ConflitoAgendamentoException(mensagem);
						} else if (horaInicial.after(agend.getPeriodo().getInicio()) && horaFinal.after(agend.getPeriodo().getFim()) && horaInicial.before(agend.getPeriodo().getFim()) ){
							String mensagem = "Já existem agendamentos nesse período e destino. ";
							throw new ConflitoAgendamentoException(mensagem);
						}
					}
				}
				
			}
		}
		
	}
	
	public void existeConflito(Agendamento agendamento) {
		
				Calendar horaInicial = agendamento.getPeriodo().getInicio();
				Calendar horaFinal = agendamento.getPeriodo().getFim();
				
				for (Agendamento agend : dao.getLista()) {
					
					if (agend.getSala().equals(agendamento.getSala())) {
						
						if (horaInicial.after(agend.getPeriodo().getInicio()) && horaFinal.before(agend.getPeriodo().getFim()) ){
							String mensagem = "Já existem agendamentos nesse período e destino. ";
							throw new ConflitoAgendamentoException(mensagem);
						} else if (horaInicial.before(agend.getPeriodo().getInicio()) && horaFinal.after(agend.getPeriodo().getFim())){
							String mensagem = "Já existem agendamentos nesse período e destino. ";
							throw new ConflitoAgendamentoException(mensagem);
						} else if (horaInicial.before(agend.getPeriodo().getInicio()) && horaFinal.before(agend.getPeriodo().getFim()) && horaFinal.after(agend.getPeriodo().getInicio())){
							String mensagem = "Já existem agendamentos nesse período e destino. ";
							throw new ConflitoAgendamentoException(mensagem);
						} else if (horaInicial.after(agend.getPeriodo().getInicio()) && horaFinal.after(agend.getPeriodo().getFim()) && horaInicial.before(agend.getPeriodo().getFim()) ){
							String mensagem = "Já existem agendamentos nesse período e destino. ";
							throw new ConflitoAgendamentoException(mensagem);
						}
					}
				}
			
			}

	public void existeBloqueioPorPeriodo(Agendamento agendamento) {
			
			Calendar horaInicial = agendamento.getPeriodo().getInicio();
			Calendar horaFinal = agendamento.getPeriodo().getFim();
			
			for (Bloqueio bloq : dao.getBloqueios()) {
				
				if (bloq.getSala().equals(agendamento.getSala())) {
					
					if (horaInicial.after(bloq.getPeriodo().getInicio()) && horaFinal.before(bloq.getPeriodo().getFim()) ){
						String mensagem = "A sala escolhida encontra-se bloqueada para o período selecionado.";
						throw new BloqueioSalaException(mensagem);
					} else if (horaInicial.before(bloq.getPeriodo().getInicio()) && horaFinal.after(bloq.getPeriodo().getFim())){
						String mensagem = "A sala escolhida encontra-se bloqueada para o período selecionado.";
						throw new BloqueioSalaException(mensagem);
					} else if (horaInicial.before(bloq.getPeriodo().getInicio()) && horaFinal.before(bloq.getPeriodo().getFim()) && horaFinal.after(bloq.getPeriodo().getInicio())){
						String mensagem = "A sala escolhida encontra-se bloqueada para o período selecionado.";
						throw new BloqueioSalaException(mensagem);
					} else if (horaInicial.after(bloq.getPeriodo().getInicio()) && horaFinal.after(bloq.getPeriodo().getFim()) && horaInicial.before(bloq.getPeriodo().getFim()) ){
						String mensagem = "A sala escolhida encontra-se bloqueada para o período selecionado. ";
						throw new BloqueioSalaException(mensagem);
					}
				}
			}
		
	}

	public AgendamentoDAO getDao() {
		return dao;
	}

	public void setDao(AgendamentoDAO dao) {
		this.dao = dao;
	}
	
}
