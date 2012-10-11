package br.faccamp.domain;
public class Memoria {
	String valorM;
	String valor;
	

	public Memoria (){
		valorM = "0";
	}
	
	
	public Memoria (String valor){ 
		this.valor = valor;
		
	}

	public void salvaMemoria (String valor){
		valorM = valor;
	
	}
	
	public String retornaMemoria(){
			return (valorM);
	}
	
	public void zeraMemoria(){
		valorM = "0";
		
	}
	
	public void SMemoria(String valor){
		double valor1 = new Double(valorM);
		double valor2 = new Double(valor);
		valorM = (valor1 + valor2) +"";
	}


	public void MMemoria(String valor) {
		double valor1 = new Double(valorM);
		double valor2 = new Double(valor);
		valorM = (valor1 - valor2) +"";
		
	}

	}
	
