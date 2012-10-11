
package br.faccamp.domain;

public class OperacaoFatorial extends OperacaoSimples {

	public OperacaoFatorial(String Operador){
		super(Operador);
	}


	@Override
	public String calcula() {
		double valor = new Double (getOperador());
		double fatorial =1;
		for (int i=2 ; i <= valor ; i++){ 
			fatorial = (fatorial * i);
		}
		return (fatorial +"");
	}

}
		