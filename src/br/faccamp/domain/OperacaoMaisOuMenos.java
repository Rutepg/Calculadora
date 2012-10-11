package br.faccamp.domain;

	public class OperacaoMaisOuMenos extends OperacaoSimples {
	
		public OperacaoMaisOuMenos(String Operador){
			super(Operador);
		}	

		@Override
		public String calcula() {
			double valor = new Double (getOperador());
			 valor = valor * (-1); 
			return (valor + "");
		}
	}
