package br.faccamp.domain;

public abstract class OperacaoSimples {

	private String Operador;

	public abstract String calcula() ;

	public OperacaoSimples(String Operador) {
		this.Operador = Operador;
	}
	public String getOperador() {
		return Operador;
	}

}
