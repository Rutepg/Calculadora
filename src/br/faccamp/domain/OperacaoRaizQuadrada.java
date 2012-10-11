package br.faccamp.domain;


	public class OperacaoRaizQuadrada extends OperacaoSimples {
	
		public OperacaoRaizQuadrada(String Operador){
			super(Operador);
		}
	

		@Override
		public String calcula() {
			double valor = new Double (getOperador());
			 if (valor >= 0){
				 valor = Math.sqrt(valor); 
				 
			 return (valor + "");
			 
			 }else{
				 return ("Entrada invalida");
			 }
			
		}
	}


