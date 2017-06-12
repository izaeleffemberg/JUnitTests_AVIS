package entidade;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Periodo {

	private static final long serialVersionUID = 1L;
		
	private Calendar inicio;
	private Calendar fim;
	
	public Periodo() {
		inicio = Calendar.getInstance();
		fim = Calendar.getInstance();
	}
	
	public Calendar getInicio() {
		return inicio;
	}
	public void setInicio(Calendar inicio) {
		this.inicio = inicio;
	}
	public Calendar getFim() {
		return fim;
	}
	public void setFim(Calendar fim) {
		this.fim = fim;
	}

	public String toStringDatas() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
		
		return sdf.format(inicio.getTime()) + " até " + sdf2.format(fim.getTime());
	}
	
	@Override
	public String toString() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy 'das' HH:mm");
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm");
		
		return sdf.format(inicio.getTime()) + " as " + sdf2.format(fim.getTime());
	}
	
	public String getPeriodoLongo() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy '-' HH:mm");
		
		return sdf.format(inicio.getTime()) + " até " + sdf.format(fim.getTime());
	}
	
	public String getPeriodoApenasHora() {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		
		return sdf.format(inicio.getTime()) + " às " + sdf.format(fim.getTime());
	}
	
	/**
	 * 
	 * Cria um peridio de 30 minutos se baseando no inicio
	 * Seta o fim como sendo 30 minutos depois do inicio
	 * 
	 * */
	public void periodoDe30Minutos(){
		fim.setTime(inicio.getTime());
		fim.add(Calendar.MINUTE, 29);
	}
	
	public boolean isPeriodoValido() {
		if (this.inicio.before(this.fim)) return true;
		else return false;
	}
	
}
