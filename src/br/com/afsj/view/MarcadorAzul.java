package br.com.afsj.view;

import javax.swing.Icon;
import javax.swing.JLabel;

import br.com.afsj.control.Xadrez;

public class MarcadorAzul{
	protected Icon icone;
	protected JLabel imagem;
	
	public MarcadorAzul() {
		this.imagem = new JLabel();
		this.imagem.setHorizontalAlignment(JLabel.LEFT);
		this.imagem.setVerticalAlignment(JLabel.TOP);
	}
	
	public void mover(int posX, int posY) {
		int posXTela = Xadrez.tamanhoQuadrado * posX;
		int posYTela = Xadrez.tamanhoQuadrado * posY;
		
		imagem.setIcon(icone);
		imagem.setBounds(posXTela, posYTela, Xadrez.tamanhoQuadrado, Xadrez.tamanhoQuadrado);
		//contagem de movimento
		//System.out.println(p.getNome()+" movimentou "+p.getMoveCont());
	}
	
	public void setIcone(Icon i) {
		this.icone = i;
	}
	
	public JLabel getImagem() {
		return this.imagem;
	}
}
