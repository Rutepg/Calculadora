package br.faccamp.examples;

public class Iphone extends Celular {
	
	public String cor;

	public Iphone() {
		super("Apple");
		cor = "branco";
	}
	
	public String qualEhASuaMarca(){
		return super.marca + " Sou lind‹o ";
	}
	
	public String toca(){
		return "trim trim";
	}
	
	

}
