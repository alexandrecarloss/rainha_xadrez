package br.com.afsj.model;

import br.com.afsj.control.Xadrez;
import br.com.afsj.model.Peca;

public class Peao extends Peca {
	
	@Override
	public boolean movimentoOK(int x, int y) {
		
		if (posX == -1 && posY == -1) {
			return true;
		}
		if (cor == Xadrez.corBRANCA) {
			if ( (x == posX) && (y == posY-1) ) {
				return true ;
			}
			if(y == 4 && x == posX && y < posY) {
				return true;
			}
		}

		if (cor == Xadrez.corPRETA) {
			if ( (x == posX) && (y == posY+1) ) {
				return true ;
			}
			if(y == 3 && x == posX && y > posY) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean capturarOK(int x, int y)
	{
		return capturar(x, y);
	}
	
	@Override
	public boolean capturar(int x, int y) {
		if (cor == Xadrez.corBRANCA) {
			if ( (x == posX-1 || x == posX+1) && (y == posY-1) ) {
				return true ;
			}
		}

		if (cor == Xadrez.corPRETA) {
			if ( (x == posX-1 || x == posX+1) && (y == posY+1) ) {
				return true ;
			}
		}
		return false;		
	}
	
	public void moverCaptura(int x, int y)
	{
		posX = x;
		posY = y;
	}
}