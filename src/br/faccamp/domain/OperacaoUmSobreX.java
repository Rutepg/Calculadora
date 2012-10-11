package br.faccamp.domain;

	public class OperacaoUmSobreX extends OperacaoSimples {
	
		public OperacaoUmSobreX(String Operador){
			super(Operador);
		}
				
		@Override
		public String calcula() {
			double valor = new Double (getOperador());
		if (valor != 0) {
			 valor = (1 / valor) ; 
			 return (valor + "");
		} else{
			return ("Impossivel dividir por zero");
		}
	}
}
