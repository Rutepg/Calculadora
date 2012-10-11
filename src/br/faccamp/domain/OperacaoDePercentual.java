

package br.faccamp.domain;

public class OperacaoDePercentual extends OperacaoSimples {

	public OperacaoDePercentual(String Operador){
		super(Operador);
	}
	
	public String calcula() {
		double valor = new Double (getOperador());
		return (valor / 100 +"");
}
}
	

