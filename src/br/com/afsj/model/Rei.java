package br.com.afsj.model;

import java.util.List;

public class Rei extends Peca {
	@Override
    public boolean movimentoOK(int x, int y) {
        if (posX == -1 && posY == -1) {
            return true;
        }

        // O rei pode mover-se uma casa em qualquer direção indepedente de cor
        // por isso aqui não verificamos a cor da peça
        int dx = Math.abs(x - posX);
        int dy = Math.abs(y - posY);

        // Verifica se o movimento é válido
        if ((dx <= 1 && dy <= 1) && (dx != 0 || dy != 0)) {
            return true;
        }

        return false;
    }
    
    public boolean reiEmCheck(List<Peca> pecas, Rei rei) {
        // Verifica se alguma peça do oponente pode capturar o rei
        for (Peca peca : pecas) {
            if (peca.getCor() != rei.getCor() && rei != null)
            {	      	
            	if (peca.capturarOK(rei.getPosX(), rei.getPosY())) {
                	return true;
                }
            }
        }

        return false;
    }

}
