package br.faccamp.examples;

import java.util.ArrayList;
import java.util.List;

public class Operadora {

	private List<Celular> celulares;

	public Operadora() {
		celulares = new ArrayList<Celular>();
	}

	public void adicionaCelulares(Celular celular) {
		celulares.add(celular);
	}

	public String getMarcaCelulares() {
		String todasAsMarcas = "";
		for (Celular celular : celulares) {
			celular.toca();
		}
		return todasAsMarcas;
	}
}
