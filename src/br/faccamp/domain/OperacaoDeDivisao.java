package br.faccamp.domain;

public class OperacaoDeDivisao extends Operacao {
	public OperacaoDeDivisao(String primeiroOperador) {
		super(primeiroOperador);
	}

	@Override
	public String calcula(String segundoOperador) {
		
		double primeiro = new Double(getPrimeiroOperador());
		double segundo = new Double(segundoOperador);
		
		if (segundo != 0){
			return (primeiro / segundo)+"";
		
	}else{
		return ("Impossivel dividir por zero");
	}

	}
}
