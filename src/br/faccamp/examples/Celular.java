package br.faccamp.examples;

public abstract class Celular {
	
	protected String marca;
	
	public Celular(String marca){
		this.marca = marca;
	}
	
	public String qualEhASuaMarca(){
		return marca;
	}

	public abstract String toca() ;
	
	

}
