
package entidade;

import excecao.NumeroProcessoException;

public class Processo {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String numero;
	private String reu;
	private String parte;

	private ClasseProcesso classe;
	
	private FotoArquivo dadosProcesso;
	
	private FotoArquivo termoMediacao;
	
	private String vara;
	
	public Processo() {
		classe = new ClasseProcesso();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getReu() {
		return reu;
	}
	public void setReu(String reu) {
		this.reu = reu;
	}
	public String getParte() {
		return parte;
	}
	public void setParte(String parte) {
		this.parte = parte;
	}

	public ClasseProcesso getClasse() {
		return classe;
	}

	public void setClasse(ClasseProcesso classe) {
		this.classe = classe;
	}
	public void formortarNumeroProcesso() throws NumeroProcessoException{
		numero = numero.toUpperCase();
		String aux = "";
		if (numero.length() < 20) 
			throw new NumeroProcessoException("Número de processo inválido!");

		if (numero.contains("S") || numero.contains("T")) {
			aux = numero.substring(numero.length() - 1);
			numero = numero.replace(aux, "");
		}
		
		numero = numero.replace("-", "").replace(".", "");
		
		Long n89 = Long.parseLong(numero.substring(7, 9));
		Long numeroMaior = Long.parseLong(numero.substring(0,7) + numero.substring(9) + "00");
		
		if(98 - (numeroMaior % 97) != n89)
			throw new NumeroProcessoException();
		
		numero = numero.substring(0,7) + "-" + numero.substring(7);
		numero = numero.substring(0,10) + "." + numero.substring(10);
		numero = numero.substring(0,15) + "." + numero.substring(15);
		numero = numero.substring(0,17) + "." + numero.substring(17);
		numero = numero.substring(0,20) + "." + numero.substring(20);
		numero = numero + aux;
	}

	public String getVara() {
		return vara;
	}

	public void setVara(String vara) {
		this.vara = vara;
	}

	public FotoArquivo getDadosProcesso() {
		return dadosProcesso;
	}

	public void setDadosProcesso(FotoArquivo dadosProcesso) {
		this.dadosProcesso = dadosProcesso;
	}

	public FotoArquivo getTermoMediacao() {
		return termoMediacao;
	}

	public void setTermoMediacao(FotoArquivo termoMediacao) {
		this.termoMediacao = termoMediacao;
	}
	
}
