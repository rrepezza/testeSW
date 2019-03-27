package br.com.repezza.jogo;

import java.util.Random;

public class Dado {
	private int qtdLados;
	private Random novoDado;

	public Dado() {
		novoDado = new Random();
	}
	public Dado(int qtdLados) {
		this();
		this.qtdLados = qtdLados;
	}

	public int jogarDados() {
		if(qtdLados < 2) return qtdLados;
		int pos = 1 + novoDado.nextInt(qtdLados);
		return pos;
	}

	public int getQtdLados() {
		return qtdLados;
	}
	public void setQtdLados(int qtdLados) {
		this.qtdLados = qtdLados;
	}
}
