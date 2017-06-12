import Testes.Validacao;

public class Main {

	public static void main(String args[]){
		
		Validacao validacao = new Validacao();
		
		validacao.testeConflitoAgendamento1();
		validacao.testeConflitoAgendamento2();
		validacao.testeConflitoAgendamento3();
		validacao.testeConflitoAgendamento4();
		
		validacao.testeAgendVideoconf1();
		validacao.testeAgendVideoconf2();
		validacao.testeAgendVideoconf3();
		validacao.testeAgendVideoconf4();
		
		validacao.testeBloqueioCaso1();
		validacao.testeBloqueioCaso2();
		validacao.testeBloqueioCaso3();
		validacao.testeBloqueioCaso4();
		
		validacao.agendamentoMelhorCaso();
		validacao.testeVideoconfCasoOtimo();
	}
	
}
