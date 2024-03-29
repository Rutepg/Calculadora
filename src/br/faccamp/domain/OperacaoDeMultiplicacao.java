package br.faccamp.domain;

public class OperacaoDeMultiplicacao extends Operacao {
	public OperacaoDeMultiplicacao(String primeiroOperador) {
		super(primeiroOperador);
	}
	
	@Override
	public String calcula(String segundoOperador) {
		double primeiro = new Double(getPrimeiroOperador());
		double segundo = new Double(segundoOperador);
		return (primeiro*segundo)+"";
	}

	
}