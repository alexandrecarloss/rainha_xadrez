package br.com.afsj.model;

public abstract class Peca {
	
	// Atributos
	protected int cor;
	protected int posX = -1;
	protected int posY = -1;
	protected int moveCont = 0;
	
	// M�todos
	public int getCor() {
		return cor;
	}
	public void setCor(int cor) {
		this.cor = cor;
	}
	public int getPosX() {
		return posX;
	}
	public int getPosY() {
		return posY;
	}
	public int getMoveCont() {
		return moveCont;
	}
	public void setMoveCont(int moveCont) {
		this.moveCont = moveCont;
	}
	public String getNome(){
		return this.getClass().getName();
	}
	
	public boolean mover(int x, int y) {
		if ( this.movimentoOK(x,y) ) {
			posX = x;
			posY = y;
			return true;
		}
		return false;
	}
	public abstract boolean movimentoOK(int x, int y);
	
	public boolean capturarOK(int x, int y)
	{
		// Verifica se a peça pode capturar o que houver na casa
		if ( this.movimentoOK(x,y) ) {
			return true;
		}
		return false;
	}
	
	public void remover() {
		this.posX = -2;
		this.posY = -2;
	}
	public boolean capturar(int x, int y) {
		return mover(x,y);
	}
	public void moverIrrestrito(int x, int y) {
		posX = x;
		posY = y;
	}
}
