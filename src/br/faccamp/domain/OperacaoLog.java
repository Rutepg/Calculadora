package br.faccamp.domain;

	public class OperacaoLog extends OperacaoSimples {
	
		public OperacaoLog(String Operador){
			super(Operador);
		}
	

		@Override
		public String calcula() {
			double valor = new Double (getOperador());
			if (valor != 0) {
			 valor = Math.log10(valor) ; 
			 return (valor + "");
			} else{
			return ("Entrada invalida");
		}
		}
	}
