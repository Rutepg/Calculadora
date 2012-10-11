package br.faccamp.domain;

public class OperacaoDeXElevadoAY extends Operacao {

	public OperacaoDeXElevadoAY(String primeiroOperador) {
		super(primeiroOperador);
	}

	@Override
	public String calcula(String segundoOperador) {
		double primeiro = new Double(getPrimeiroOperador());
		double segundo = new Double(segundoOperador);
		return Math.pow(primeiro,segundo)+"";
	}

	
}