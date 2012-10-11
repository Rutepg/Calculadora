package br.faccamp.domain;

import br.faccamp.view.CalculadoraGUI;

public class Display {
	
	private CalculadoraGUI gui;

	public Display(CalculadoraGUI gui) {
		this.gui = gui;
	}
	
	public void limpa() {
		gui.atualizaDisplay("");	
	}

	public void atualiza(String texto) {
		if (getConteudo().equalsIgnoreCase("")) {
			gui.atualizaDisplay(texto);	
		}
		else {
			gui.atualizaDisplay((getConteudo()+texto));	
		}
		
	}
	
	public void atualizaVirgula(String texto) {
		if (getConteudo().equalsIgnoreCase("")) {
			gui.atualizaDisplay("0.");
		}
		
		if (getConteudo().indexOf(".") == -1) {
			atualiza(texto);
		}
	}
	 

	public void atualizaC (){
		gui.atualizaDisplay("");
	}
	
	public void atualizaCE (){
		gui.atualizaDisplay("");
	}

	
	public String getConteudo() {
		return gui.getDisplay();	
	}
}
