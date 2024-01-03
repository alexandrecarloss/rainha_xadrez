package br.com.afsj.model;

public class Torre extends Peca{
		public boolean movimentoOK(int x, int y) {
		if (posX == -1 && posY == -1) {
	        return true;
	    }
	    
	    int variaX = Math.abs(x - posX);
	    int variaY = Math.abs(y - posY);
	    int pX, pY;
	    if(x == posX) {
	        if(y > posY) {
	            pY = 1;
	        } else {
	            pY = -1;
	        }            
	        int j = posY + pY;
	        //Verificando se existe alguma peça no caminho
	        while (j != y) {
	            Peca pBranca = Tabuleiro.listaBrancas.pecaPosicao(x, j);
	            Peca pPreta = Tabuleiro.listaPretas.pecaPosicao(x, j);
	            if (pBranca != null || pPreta != null) {
	            	//System.out.printf("Falsa em y");
	                return false; 
	            }
	            j += pY;
	        }
	        return true;
	    }
	    
	    if(y == posY) {
	        if(x > posX) {
	            pX = 1;            
	        } else {
	            pX = -1;
	        }
	        int i = posX + pX;
	        //Verificando se existe alguma peça no caminho
	        while (i != x) {
	            Peca pBranca = Tabuleiro.listaBrancas.pecaPosicao(i, y);
	            Peca pPreta = Tabuleiro.listaPretas.pecaPosicao(i, y);
	            if (pBranca != null || pPreta != null) {
	            	//System.out.printf("Falsa em x");
	                return false; 
	            }
	            i += pX;
	        }
	        return true;
	    }
	    return false;
	}
}
