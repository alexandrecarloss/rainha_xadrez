package br.com.afsj.model;

import java.util.ArrayList;

public class ArrayPecas extends ArrayList<Peca> {
	
	Peca pecaPosicao(int x, int y) {
		// Retorna a Pe�a que est� na posi��o indicada
		// Retorna null, caso n�o haja pe�as nessa posi��o
		Peca p;
		for (int i = 0; i < this.size(); i++) {
			p = this.get(i);
			if ((p.getPosX() == x) && (p.getPosY() == y))
				return p;
		}
		return null;
	}
	
	ArrayPecas pecasParaPosicao(int x, int y) {
		// Retorna um Array contendo as pe�as que podem ir a uma dada posi��o.
		ArrayPecas pRetorno = new ArrayPecas();
		Peca p;
		for (int i = 0; i < this.size(); i++) {
			p = this.get(i);
			if (p.movimentoOK(x, y))
				pRetorno.add(p);
		}
		return pRetorno;		
	}
	
	boolean posicaoLivreAtaque(int x, int y) {
		// Retorna true se nenhuma pe�a pode atacar esta posi��o
		// Retorna false se pelo menos uma pe�a pode atacar a posi��o
		for (int i = 0; i < this.size(); i++) {
			if (this.get(i).movimentoOK(x, y))
				return false;
		}
		return true;		
		
	}
}
