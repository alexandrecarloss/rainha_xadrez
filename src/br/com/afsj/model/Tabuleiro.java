package br.com.afsj.model;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import br.com.afsj.control.Xadrez;
import br.com.afsj.view.IBispo;
import br.com.afsj.view.ICavalo;
import br.com.afsj.view.IDama;
import br.com.afsj.view.IPeao;
import br.com.afsj.view.IPeca;
import br.com.afsj.view.ITabuleiro;

public class Tabuleiro {

	protected static JFrame TELA;
	
	public static ArrayPecas listaBrancas = new ArrayPecas();
	public static ArrayPecas listaPretas = new ArrayPecas();

	protected static int corJogadorAtual = Xadrez.corBRANCA;
	protected static Peca pecaMarcada = null;
	protected static IPeca iPecaMarcada = null;
	
	protected static ITabuleiro iTabuleiro = new ITabuleiro();
	
	protected static Peao peaoBranco1 = new Peao();
	protected static IPeao iPeaoBranco1 = new IPeao(peaoBranco1);
	
	protected static Peao peaoBranco2 = new Peao();
	protected static IPeao iPeaoBranco2 = new IPeao(peaoBranco2);

	protected static Peao peaoPreto1 = new Peao();
	protected static IPeao iPeaoPreto1 = new IPeao(peaoPreto1);
	
	protected static Cavalo cavaloPreto1 = new Cavalo();
	protected static ICavalo iCavaloPreto1 = new ICavalo(cavaloPreto1);

	protected static Cavalo cavaloBranco1 = new Cavalo();
	protected static ICavalo iCavaloBranco1 = new ICavalo(cavaloBranco1);
	
	protected static Dama damaBranca = new Dama();
	protected static IDama idamaBranca = new IDama(damaBranca);
	
	protected static Dama damaPreta = new Dama();
	protected static IDama idamaPreta = new IDama(damaPreta);
	
	protected static Bispo bispoBranco1 = new Bispo();
	protected static IBispo iBispoBranco1 = new IBispo(bispoBranco1);
	
	protected static Bispo bispoBranco2 = new Bispo();
	protected static IBispo iBispoBranco2 = new IBispo(bispoBranco2);
	
	protected static Bispo bispoPreto1 = new Bispo();
	protected static IBispo iBispoPreto1 = new IBispo(bispoPreto1);
	
	protected static Bispo bispoPreto2 = new Bispo();
	protected static IBispo iBispoPreto2 = new IBispo(bispoPreto2);
	//protected static Peca peca = new Peca();

	public void iniciar(Tradutor t) {

		TELA = new JFrame(t.traduzir("Xadrez"));

		// Brancas
		peaoBranco1.setCor(Xadrez.corBRANCA);
		peaoBranco1.mover(0, 6);
		iPeaoBranco1.setIconeBranco(new ImageIcon("imagens/Peao-Brancas-Branco.png"));
		iPeaoBranco1.setIconeMarrom(new ImageIcon("imagens/Peao-Brancas-Marrom.png"));
		iPeaoBranco1.mover(0, 6);
		TELA.getContentPane().add(iPeaoBranco1.getImagem());
		listaBrancas.add(peaoBranco1);

		damaBranca.setCor(Xadrez.corBRANCA);
		damaBranca.mover(3, 7);
		idamaBranca.setIconeBranco(new ImageIcon("imagens/Rainha-Brancas-Branco.png"));
		idamaBranca.setIconeMarrom(new ImageIcon("imagens/Rainha-Brancas-Marrom.png"));
		idamaBranca.mover(3, 7);
		TELA.getContentPane().add(idamaBranca.getImagem());
		listaBrancas.add(damaBranca);
		
		peaoBranco2.setCor(Xadrez.corBRANCA);
		peaoBranco2.mover(1, 6);
		iPeaoBranco2.setIconeBranco(new ImageIcon("imagens/Peao-Brancas-Branco.png"));
		iPeaoBranco2.setIconeMarrom(new ImageIcon("imagens/Peao-Brancas-Marrom.png"));
		iPeaoBranco2.mover(1, 6);
		TELA.getContentPane().add(iPeaoBranco2.getImagem());
		listaBrancas.add(peaoBranco2);

		cavaloBranco1.setCor(Xadrez.corBRANCA);
		cavaloBranco1.mover(1, 7);
		iCavaloBranco1.setIconeBranco(new ImageIcon("imagens/Cavalo-Brancas-Branco.png"));
		iCavaloBranco1.setIconeMarrom(new ImageIcon("imagens/Cavalo-Brancas-Marrom.png"));
		iCavaloBranco1.mover(1, 7);
		TELA.getContentPane().add(iCavaloBranco1.getImagem());
		listaBrancas.add(cavaloBranco1);
		
		bispoBranco1.setCor(Xadrez.corBRANCA);
		bispoBranco1.mover(2, 7);
		iBispoBranco1.setIconeBranco(new ImageIcon("imagens/Bispo-Brancas-Branco.png"));
	    iBispoBranco1.setIconeMarrom(new ImageIcon("imagens/Bispo-Brancas-Marrom.png"));
		iBispoBranco1.mover(2, 7);
		TELA.getContentPane().add(iBispoBranco1.getImagem());
		listaBrancas.add(bispoBranco1);
		
		bispoBranco2.setCor(Xadrez.corBRANCA);
		bispoBranco2.mover(5, 7);
		iBispoBranco2.setIconeBranco(new ImageIcon("imagens/Bispo-Brancas-Branco.png"));
		iBispoBranco2.setIconeMarrom(new ImageIcon("imagens/Bispo-Brancas-Marrom.png"));
		iBispoBranco2.mover(5, 7);
		TELA.getContentPane().add(iBispoBranco2.getImagem());
		listaBrancas.add(bispoBranco2);
		
		// Pretas
		peaoPreto1.setCor(Xadrez.corPRETA);
		peaoPreto1.mover(0, 1);
		iPeaoPreto1.setIconeBranco(new ImageIcon("imagens/Peao-Pretas-Branco.png"));
		iPeaoPreto1.setIconeMarrom(new ImageIcon("imagens/Peao-Pretas-Marrom.png"));
		iPeaoPreto1.mover(0, 1);
		TELA.getContentPane().add(iPeaoPreto1.getImagem());
		listaPretas.add(peaoPreto1);

		damaPreta.setCor(Xadrez.corPRETA);
		damaPreta.mover(3, 0);
		idamaPreta.setIconeBranco(new ImageIcon("imagens/Rainha-Pretas-Branco.png"));
		idamaPreta.setIconeMarrom(new ImageIcon("imagens/Rainha-Pretas-Marrom.png"));
		idamaPreta.mover(3, 0);
		TELA.getContentPane().add(idamaPreta.getImagem());
		listaBrancas.add(damaPreta);
		
		cavaloPreto1.setCor(Xadrez.corPRETA);
		cavaloPreto1.mover(1, 0);
		iCavaloPreto1.setIconeBranco(new ImageIcon("imagens/Cavalo-Pretas-Branco.png"));
		iCavaloPreto1.setIconeMarrom(new ImageIcon("imagens/Cavalo-Pretas-Marrom.png"));
		iCavaloPreto1.mover(1, 0);
		TELA.getContentPane().add(iCavaloPreto1.getImagem());
		listaPretas.add(cavaloPreto1);
		
		TELA.getContentPane().add(iTabuleiro.getImagem());
		TELA.setSize(400, 400);
		TELA.setVisible(true);
		TELA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		bispoPreto1.setCor(Xadrez.corPRETA);
		bispoPreto1.mover(2, 0);
		iBispoPreto1.setIconeBranco(new ImageIcon("imagens/Bispo-Pretas-Branco.png"));
		iBispoPreto1.setIconeMarrom(new ImageIcon("imagens/Bispo-Pretas-Marrom.png"));
		iBispoPreto1.mover(2, 0);
		TELA.getContentPane().add(iBispoPreto1.getImagem());
		listaPretas.add(bispoPreto1);
		
		bispoPreto2.setCor(Xadrez.corPRETA);
		bispoPreto2.mover(5, 0);
		iBispoPreto2.setIconeBranco(new ImageIcon("imagens/Bispo-Pretas-Branco.png"));
		iBispoPreto2.setIconeMarrom(new ImageIcon("imagens/Bispo-Pretas-Marrom.png"));
		iBispoPreto2.mover(5, 0);
		TELA.getContentPane().add(iBispoPreto2.getImagem());
		listaPretas.add(bispoPreto2);
		
	}
	
	

	
	public static void avaliarEventoPeca(Peca p, IPeca ip) {
		if (p.getCor() == corJogadorAtual) 
			marcarPeca(p, ip);
		else if (pecaMarcada != null)
			capturarPeca(p, ip);		
	}
	
	public static void avaliarEventoTabuleiro(int x, int y) {
		if ( (pecaMarcada != null) && (x >= 0) && (x <= 7) && (y >=0) && (y <= 7) ) {
			moverPecaMarcada(x, y);
		}
	}

	public static void marcarPeca(Peca p, IPeca ip) {
		if (iPecaMarcada != null)
			iPecaMarcada.desmarcar();
		pecaMarcada = p;
		iPecaMarcada = ip;
		iPecaMarcada.marcar();
	}

	public static void capturarPeca(Peca p, IPeca ip) {
		if (pecaMarcada.capturar(p.getPosX(), p.getPosY())) {
			ip.remover();
			TELA.getContentPane().remove(ip.getImagem());
			iPecaMarcada.desmarcar();
			iPecaMarcada.mover(p.getPosX(), p.getPosY());
			p.remover();
			pecaMarcada = null;
			iPecaMarcada = null;
			if (corJogadorAtual == Xadrez.corBRANCA)
				corJogadorAtual = Xadrez.corPRETA;
			else
				corJogadorAtual = Xadrez.corBRANCA;			
		}
	}
	
	public static void moverPecaMarcada(int x, int y) {
		if (pecaMarcada.mover(x, y)) {
			iPecaMarcada.desmarcar();
			iPecaMarcada.mover(x, y);
			pecaMarcada = null;
			iPecaMarcada = null;
			if (corJogadorAtual == Xadrez.corBRANCA)
				corJogadorAtual = Xadrez.corPRETA;
			else
				corJogadorAtual = Xadrez.corBRANCA;
		}
	}
	
}
