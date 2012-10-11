package br.faccamp.domain;

public class OperacaoDeSoma extends Operacao {

	public OperacaoDeSoma(String primeiroOperador) {
		super(primeiroOperador);
	}

	@Override
	public String calcula(String segundoOperador) {

		double primeiro = new Double(getPrimeiroOperador());
		double segundo = new Double(segundoOperador);
		return (primeiro + segundo + "");
		
	}

	
}
