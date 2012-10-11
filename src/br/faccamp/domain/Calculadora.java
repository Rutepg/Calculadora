package br.faccamp.domain;

import br.faccamp.view.CalculadoraGUI;

public class Calculadora  {
	
	private CalculadoraGUI gui;
	private Display display;
	private Operacao operacao;
	private OperacaoSimples operacaoSimples;
	private Memoria memoria;
	

	public Calculadora() {
		gui = new CalculadoraGUI(this);
		display = new Display(gui);
	}

	public void processaMC() {
		memoria = new Memoria ();
		memoria.zeraMemoria();
		
	}

	public void processaMR() {
		
	try{
		display.limpa();	
		display.atualiza(memoria.retornaMemoria());	
	}catch (Exception e){
		display.atualiza("0");
	}
	}

	public void processaMS() {
		memoria = new Memoria ();
		memoria.salvaMemoria(display.getConteudo());
	
	}

	public void processaMMais() {
		try{
			memoria.SMemoria(display.getConteudo());
		}catch (NullPointerException e){	
				processaMS();
			}
	}	
	

	public void processaMMenos() {
		try{
			memoria.MMemoria(display.getConteudo());
		}catch (NullPointerException e){	
			memoria = new Memoria ();
			memoria.MMemoria(display.getConteudo());
			}
	}	
	

	public void processaCE() {
		display.atualizaCE();
		
	}

	public void processaC() {
		display.atualizaC();		
	}

	public void processaRaiz() {
		try{
			operacaoSimples = new OperacaoRaizQuadrada(display.getConteudo());
		display.limpa();	
		display.atualiza(operacaoSimples.calcula());		
	}catch (Exception e){
		processaZero();
	}	
	}

	public void processaMaisOuMenos() {
		operacaoSimples = new OperacaoMaisOuMenos(display.getConteudo());
		display.limpa();	
		display.atualiza(operacaoSimples.calcula());
	}

	public void processaFatorial() {
	try{
		operacaoSimples = new OperacaoFatorial(display.getConteudo());
		display.limpa();	
		display.atualiza(operacaoSimples.calcula());
	}catch (Exception e){
		processaZero();
	}
	}
		
	public void processaSete() {
		display.atualiza("7");	
		
	}

	public void processaOito() {
		display.atualiza("8");	
		
	}

	public void processaNove() {
		display.atualiza("9");	
		
	}

	public void processaDivisao() {
		if (operacao==null) {
		operacao = new OperacaoDeDivisao(display.getConteudo());
		display.limpa();	
	}else {
			processaIgual();
		}
	}

	public void processaPorcentual() {
	
		try {
			processaIgual();
		
		operacaoSimples = new OperacaoDePercentual(display.getConteudo());
		display.limpa();	
		display.atualiza(operacaoSimples.calcula());	
		} catch (Exception e) {
			processaZero();
		} 
		}

	public void processaQuatro() {
		display.atualiza("4");	
		
	}

	public void processaCinco() {
			display.atualiza("5");	
	}

	public void processaSeis() {
			display.atualiza("6");	
	}

	public void processaVezes() {
		if (operacao==null) {
		operacao = new OperacaoDeMultiplicacao(display.getConteudo());
		display.limpa();	
	}else {
		processaIgual();
	}
	}


	public void processaUmSobreX() {
	try{
		operacaoSimples = new OperacaoUmSobreX(display.getConteudo());
		display.limpa();	
		display.atualiza(operacaoSimples.calcula());	
	}catch (Exception e){
		processaZero();
	}
	}

	public void processaUm() {
		display.atualiza("1");	
		
	}

	public void processaDois() {
		display.atualiza("2");	
		
	}

	public void processaTres() {
		display.atualiza("3");	
		
	}

	public void processaMenos() {
		if (operacao==null) {
		operacao = new OperacaoDeSubtracao(display.getConteudo());
		display.limpa();
		}
		else {
			processaIgual();
		}
	}

	public void processaXElevadoY() {
		operacao = new OperacaoDeXElevadoAY(display.getConteudo());
		display.limpa();
		
	}

	public void processaZero() {
		display.atualiza("0");
	}

	public void processaVirgula() {
		display.atualizaVirgula(".");
	}

	public void processaIgual() {
		String conteudo = display.getConteudo();
		display.limpa();
		display.atualiza(operacao.calcula(conteudo));
		//empilho operacao
		operacao=null;
	}

	public void processaLog() {
		try{
			operacaoSimples = new OperacaoLog(display.getConteudo());
		
		display.limpa();	
		display.atualiza(operacaoSimples.calcula());	
	}catch (Exception e){
		processaZero();
	}
	}
		
	public void processaMais() {
		if (operacao==null) {
			operacao = new OperacaoDeSoma(display.getConteudo());
			display.limpa();
		}
		else {
			processaIgual();
		}
	}

}
