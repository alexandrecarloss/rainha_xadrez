package br.com.afsj.model;

import br.com.afsj.control.Xadrez;
import br.com.afsj.view.*;

import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class Tabuleiro {

    protected static JFrame TELA;

    public static ArrayPecas listaBrancas = new ArrayPecas();
    public static ArrayPecas listaPretas = new ArrayPecas();

    protected static int corJogadorAtual = Xadrez.corBRANCA;
    protected static Peca pecaMarcada = null;
    protected static IPeca iPecaMarcada = null;

    protected static ITabuleiro iTabuleiro = new ITabuleiro();

    //protected static Peao peaoBranco1 = new Peao();
    //protected static IPeao iPeaoBranco1 = new IPeao(peaoBranco1);
    //protected static Peao peaoBranco2 = new Peao();
    //protected static IPeao iPeaoBranco2 = new IPeao(peaoBranco2);
    
    protected static MarcadorAzul[] marcadoresAzuis = new MarcadorAzul[64];

    protected static Peao[] peoesBrancos = new Peao[8];
    protected static IPeao[] iPeoesBrancos = new IPeao[8];

    protected static Peao[] peoesPretos = new Peao[8];
    protected static IPeao[] iPeoesPretos = new IPeao[8];

    protected static Cavalo cavaloPreto1 = new Cavalo();
    protected static ICavalo iCavaloPreto1 = new ICavalo(cavaloPreto1);
    protected static Cavalo cavaloPreto2 = new Cavalo();
    protected static ICavalo iCavaloPreto2 = new ICavalo(cavaloPreto2);
    protected static Cavalo cavaloBranco1 = new Cavalo();
    protected static ICavalo iCavaloBranco1 = new ICavalo(cavaloBranco1);
    protected static Cavalo cavaloBranco2 = new Cavalo();
    protected static ICavalo iCavaloBranco2 = new ICavalo(cavaloBranco2);
    protected static Torre torreBranca1 = new Torre();
    protected static ITorre iTorreBranca1 = new ITorre(torreBranca1);
    protected static Torre torreBranca2 = new Torre();
    protected static ITorre iTorreBranca2 = new ITorre(torreBranca2);
    protected static Torre torrePreta1 = new Torre();
    protected static ITorre iTorrePreta1 = new ITorre(torrePreta1);
    protected static Torre torrePreta2 = new Torre();
    protected static ITorre iTorrePreta2 = new ITorre(torrePreta2);
    protected static Bispo bispoBranco1 = new Bispo();
    protected static IBispo iBispoBranco1 = new IBispo(bispoBranco1);
    protected static Bispo bispoBranco2 = new Bispo();
    protected static IBispo iBispoBranco2 = new IBispo(bispoBranco2);
    protected static Bispo bispoPreto1 = new Bispo();
    protected static IBispo iBispoPreto1 = new IBispo(bispoPreto1);
    protected static Bispo bispoPreto2 = new Bispo();
    protected static IBispo iBispoPreto2 = new IBispo(bispoPreto2);
    protected static Rei reiBranco = new Rei();
    protected static IRei iReiBranco = new IRei(reiBranco);
    protected static Rei reiPreto = new Rei();
    protected static IRei iReiPreto = new IRei(reiPreto);
    protected static Rainha rainhaBranca = new Rainha();
    protected static IRainha iRainhaBranca = new IRainha(rainhaBranca);
    protected static Rainha rainhaPreta = new Rainha();
    protected static IRainha iRainhaPreta = new IRainha(rainhaPreta);

    //protected static Peca peca = new Peca();

    public void iniciar(Tradutor t) {

        TELA = new JFrame(t.traduzir("Xadrez"));

        // Brancas

		/*

		peaoBranco1.setCor(Xadrez.corBRANCA);
		peaoBranco1.mover(0, 6);
		iPeaoBranco1.setIconeBranco(new ImageIcon("imagens/Peao-Brancas-Branco.png"));
		iPeaoBranco1.setIconeMarrom(new ImageIcon("imagens/Peao-Brancas-Marrom.png"));
		iPeaoBranco1.mover(0, 6);
		TELA.getContentPane().add(iPeaoBranco1.getImagem());
		listaBrancas.add(peaoBranco1);

		peaoBranco2.setCor(Xadrez.corBRANCA);
		peaoBranco2.mover(1, 6);
		iPeaoBranco2.setIconeBranco(new ImageIcon("imagens/Peao-Brancas-Branco.png"));
		iPeaoBranco2.setIconeMarrom(new ImageIcon("imagens/Peao-Brancas-Marrom.png"));
		iPeaoBranco2.mover(1, 6);
		TELA.getContentPane().add(iPeaoBranco2.getImagem());
		listaBrancas.add(peaoBranco2);

		*/
        
        //Inicializar marcadores
        for (int i = 0; i < 64; i++)
        {
        	marcadoresAzuis[i] = new MarcadorAzul();
        	marcadoresAzuis[i].setIcone(new ImageIcon("imagens/Marcador.png"));
        	marcadoresAzuis[i].mover(-1, -1);
			TELA.getContentPane().add(marcadoresAzuis[i].getImagem());
        }

        for (int i = 0; i < 8; i++) {
            peoesBrancos[i] = new Peao();
            peoesBrancos[i].setCor(Xadrez.corBRANCA);
            peoesBrancos[i].mover(i, 6);

            iPeoesBrancos[i] = new IPeao(peoesBrancos[i]);
            iPeoesBrancos[i].setIconeBranco(new ImageIcon("imagens/Peao-Brancas-Branco.png"));
            iPeoesBrancos[i].setIconeMarrom(new ImageIcon("imagens/Peao-Brancas-Marrom.png"));
            iPeoesBrancos[i].mover(i, 6);

            TELA.getContentPane().add(iPeoesBrancos[i].getImagem());
            listaBrancas.add(peoesBrancos[i]);
        }

        torreBranca1.setCor(Xadrez.corBRANCA);
        torreBranca1.mover(0, 7);
        iTorreBranca1.setIconeBranco(new ImageIcon("imagens/Torre-Brancas-Branco.png"));
        iTorreBranca1.setIconeMarrom(new ImageIcon("imagens/Torre-Brancas-Marrom.png"));
        iTorreBranca1.mover(0, 7);
        TELA.getContentPane().add(iTorreBranca1.getImagem());
        listaBrancas.add(torreBranca1);

        torreBranca2.setCor(Xadrez.corBRANCA);
        torreBranca2.mover(7, 7);
        iTorreBranca2.setIconeBranco(new ImageIcon("imagens/Torre-Brancas-Branco.png"));
        iTorreBranca2.setIconeMarrom(new ImageIcon("imagens/Torre-Brancas-Marrom.png"));
        iTorreBranca2.mover(7, 7);
        TELA.getContentPane().add(iTorreBranca2.getImagem());
        listaBrancas.add(torreBranca2);

        cavaloBranco1.setCor(Xadrez.corBRANCA);
        cavaloBranco1.mover(1, 7);
        iCavaloBranco1.setIconeBranco(new ImageIcon("imagens/Cavalo-Brancas-Branco.png"));
        iCavaloBranco1.setIconeMarrom(new ImageIcon("imagens/Cavalo-Brancas-Marrom.png"));
        iCavaloBranco1.mover(1, 7);
        TELA.getContentPane().add(iCavaloBranco1.getImagem());
        listaBrancas.add(cavaloBranco1);

        cavaloBranco2.setCor(Xadrez.corBRANCA);
        cavaloBranco2.mover(6, 7);
        iCavaloBranco2.setIconeBranco(new ImageIcon("imagens/Cavalo-Brancas-Branco.png"));
        iCavaloBranco2.setIconeMarrom(new ImageIcon("imagens/Cavalo-Brancas-Marrom.png"));
        iCavaloBranco2.mover(6, 7);
        TELA.getContentPane().add(iCavaloBranco2.getImagem());
        listaBrancas.add(cavaloBranco2);

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

        reiBranco.setCor(Xadrez.corBRANCA);
        reiBranco.mover(4, 7);
        iReiBranco.setIconeBranco(new ImageIcon("imagens/Rei-Brancas-Branco.png"));
        iReiBranco.setIconeMarrom(new ImageIcon("imagens/Rei-Brancas-Marrom.png"));
        iReiBranco.mover(4, 7);
        TELA.getContentPane().add(iReiBranco.getImagem());
        listaBrancas.add(reiBranco);

        rainhaBranca.setCor(Xadrez.corBRANCA);
        rainhaBranca.mover(3, 7);
        iRainhaBranca.setIconeBranco(new ImageIcon("imagens/Rainha-Brancas-Branco.png"));
        iRainhaBranca.setIconeMarrom(new ImageIcon("imagens/Rainha-Brancas-Marrom.png"));
        iRainhaBranca.mover(3, 7);
        TELA.getContentPane().add(iRainhaBranca.getImagem());
        listaBrancas.add(rainhaBranca);

        // Pretas

        for (int i = 0; i < 8; i++) {
            peoesPretos[i] = new Peao();
            peoesPretos[i].setCor(Xadrez.corPRETA);
            peoesPretos[i].mover(i, 1);

            iPeoesPretos[i] = new IPeao(peoesPretos[i]);
            iPeoesPretos[i].setIconeBranco(new ImageIcon("imagens/Peao-Pretas-Branco.png"));
            iPeoesPretos[i].setIconeMarrom(new ImageIcon("imagens/Peao-Pretas-Marrom.png"));
            iPeoesPretos[i].mover(i, 1);

            TELA.getContentPane().add(iPeoesPretos[i].getImagem());
            listaPretas.add(peoesPretos[i]);
        }
        //peaoPreto1.setCor(Xadrez.corPRETA);
        //peaoPreto1.mover(0, 1);
        //iPeaoPreto1.setIconeBranco(new ImageIcon("imagens/Peao-Pretas-Branco.png"));
        //iPeaoPreto1.setIconeMarrom(new ImageIcon("imagens/Peao-Pretas-Marrom.png"));
        //iPeaoPreto1.mover(0, 1);
        //TELA.getContentPane().add(iPeaoPreto1.getImagem());
        //listaPretas.add(peaoPreto1);

        torrePreta1.setCor(Xadrez.corPRETA);
        torrePreta1.mover(0, 0);
        iTorrePreta1.setIconeBranco(new ImageIcon("imagens/Torre-Pretas-Branco.png"));
        iTorrePreta1.setIconeMarrom(new ImageIcon("imagens/Torre-Pretas-Marrom.png"));
        iTorrePreta1.mover(0, 0);
        TELA.getContentPane().add(iTorrePreta1.getImagem());
        listaPretas.add(torrePreta1);

        torrePreta2.setCor(Xadrez.corPRETA);
        torrePreta2.mover(7, 0);
        iTorrePreta2.setIconeBranco(new ImageIcon("imagens/Torre-Pretas-Branco.png"));
        iTorrePreta2.setIconeMarrom(new ImageIcon("imagens/Torre-Pretas-Marrom.png"));
        iTorrePreta2.mover(7, 0);
        TELA.getContentPane().add(iTorrePreta2.getImagem());
        listaPretas.add(torrePreta2);

        cavaloPreto1.setCor(Xadrez.corPRETA);
        cavaloPreto1.mover(1, 0);
        iCavaloPreto1.setIconeBranco(new ImageIcon("imagens/Cavalo-Pretas-Branco.png"));
        iCavaloPreto1.setIconeMarrom(new ImageIcon("imagens/Cavalo-Pretas-Marrom.png"));
        iCavaloPreto1.mover(1, 0);
        TELA.getContentPane().add(iCavaloPreto1.getImagem());
        listaPretas.add(cavaloPreto1);

        cavaloPreto2.setCor(Xadrez.corPRETA);
        cavaloPreto2.mover(6, 0);
        iCavaloPreto2.setIconeBranco(new ImageIcon("imagens/Cavalo-Pretas-Branco.png"));
        iCavaloPreto2.setIconeMarrom(new ImageIcon("imagens/Cavalo-Pretas-Marrom.png"));
        iCavaloPreto2.mover(6, 0);
        TELA.getContentPane().add(iCavaloPreto2.getImagem());
        listaPretas.add(cavaloPreto2);

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

        reiPreto.setCor(Xadrez.corPRETA);
        reiPreto.mover(4, 0);
        iReiPreto.setIconeBranco(new ImageIcon("imagens/Rei-Pretas-Branco.png"));
        iReiPreto.setIconeMarrom(new ImageIcon("imagens/Rei-Pretas-Marrom.png"));
        iReiPreto.mover(4, 0);
        TELA.getContentPane().add(iReiPreto.getImagem());
        listaPretas.add(reiPreto);

        rainhaPreta.setCor(Xadrez.corPRETA);//branco = 1 preto = 0
        rainhaPreta.mover(3, 0);
        iRainhaPreta.setIconeBranco(new ImageIcon("imagens/Rainha-Pretas-Branco.png"));
        iRainhaPreta.setIconeMarrom(new ImageIcon("imagens/Rainha-Pretas-Marrom.png"));
        iRainhaPreta.mover(3, 0);
        TELA.getContentPane().add(iRainhaPreta.getImagem());
        listaPretas.add(rainhaPreta);
        
        TELA.getContentPane().add(iTabuleiro.getImagem());
        TELA.setSize(400, 400);
        TELA.setVisible(true);
        TELA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void avaliarEventoPeca(Peca p, IPeca ip) {
        if (p.getCor() == corJogadorAtual)
            marcarPeca(p, ip);
        else if (pecaMarcada != null)
            capturarPeca(p, ip);
    }

    public static void avaliarEventoTabuleiro(int x, int y) {
        moverPecaMarcada(x, y);
    }
    
    public static int casaLivre(int x, int y) // 0 = Livre, 1 = Peca inimiga, 2 = Peca aliada
    {
    	for (int i = 0; i < listaBrancas.size(); i++)
		{
    		if (listaBrancas.get(i).getPosX() == x && listaBrancas.get(i).getPosY() == y)
    		{
    			if (pecaMarcada.getCor() == Xadrez.corBRANCA) return 2;
    			else return 1;
    		}
    			
		}
    	for (int i = 0; i < listaPretas.size(); i++)
		{
    		if (listaPretas.get(i).getPosX() == x && listaPretas.get(i).getPosY() == y)
    		{
    			if (pecaMarcada.getCor() == Xadrez.corPRETA) return 2;
    			else return 1;
    		}
    			
		}
    	
    	return 0;
    }
    
    public static void marcarCasas(Peca p)
    {
    	int i = 0;
    	for (int y = 0; y < 8; y++)
    	{
    		for (int x = 0; x < 8; x++)
        	{
    			if (p instanceof Peao)
    			{
    				if (p.capturar(x, y))
        			{
        				if (casaLivre(x,y) == 1)
        				{
        					marcadoresAzuis[i++].mover(x, y);
        					continue;
        				}
        			}
    				else if (p.movimentoOK(x, y))
            		{
            			if (casaLivre(x, y) == 0)marcadoresAzuis[i++].mover(x, y);
            		}
    			}
    			
    			else if (p.movimentoOK(x, y))
        		{
        			if (casaLivre(x, y) == 0 || casaLivre(x, y) == 1)marcadoresAzuis[i++].mover(x, y);
        		}
        	}
    	}
    }
    
    public static void desmarcarCasas()
    {
    	int i = 0;
    	for (int x = 0; x < 8; x++)
    	{
    		for (int y = 0; y < 8; y++)
        	{
        		marcadoresAzuis[i++].mover(-1, -1);
        	}
    	}
    }

    public static void marcarPeca(Peca p, IPeca ip) {
        if (iPecaMarcada != null)
        {
        	iPecaMarcada.desmarcar();
        	desmarcarCasas();
        }
            
        pecaMarcada = p;
        iPecaMarcada = ip;
        iPecaMarcada.marcar();
        marcarCasas(p);

    }

    public static void capturarPeca(Peca p, IPeca ip) {
    	int oldX = pecaMarcada.getPosX();
    	int oldY = pecaMarcada.getPosY();
    	
    	int oldOX = p.getPosX();
    	int oldOY = p.getPosY();
    	
        if (pecaMarcada.capturar(p.getPosX(), p.getPosY())) {
        	pecaMarcada.moverIrrestrito(p.getPosX(), p.getPosY());
            p.remover();

            //Verifica se a captura mantém ou salva o rei do xeque
        	Rei rei = (corJogadorAtual == Xadrez.corBRANCA) ? reiBranco : reiPreto;
        	List<Peca> pecasDoOponente = (corJogadorAtual == Xadrez.corBRANCA) ? listaPretas : listaBrancas;
        	
        	if (rei.reiEmCheck(pecasDoOponente, rei)) {
        		// Desfaz o movimento
        		pecaMarcada.moverIrrestrito(oldX, oldY);
        		p.moverIrrestrito(oldOX, oldOY);
        		System.out.println("Movimento inválido. Rei ficaria em xeque.");
        		return;
        	}
        	
        	//Caso não haja perigo para o rei, o processo continua normalmente
        	desmarcarCasas();
        	ip.remover();
            TELA.getContentPane().remove(ip.getImagem());
            iPecaMarcada.desmarcar();
            iPecaMarcada.mover(pecaMarcada.getPosX(), pecaMarcada.getPosY());
            pecaMarcada = null;
            iPecaMarcada = null;
            if (corJogadorAtual == Xadrez.corBRANCA)
            {
            	//listaPretas.remove(p);
            	corJogadorAtual = Xadrez.corPRETA;
            }
            else
            {
            	corJogadorAtual = Xadrez.corBRANCA;
            }
                
        }
    }

    public static void moverPecaMarcada(int x, int y) {
        if (pecaMarcada == null) {
        	//Peça não pode ser marcada por ser do outro jogador
            if (corJogadorAtual == 0) {
                System.out.println("Jogador peças pretas faça sua jogada.");
            } else System.out.println("Jogador peças brancas faça sua jogada.");
            return;
        } 
        
        	
        int oldX = pecaMarcada.getPosX();
    	int oldY = pecaMarcada.getPosY();

    	Rei rei = (corJogadorAtual == Xadrez.corBRANCA) ? reiBranco : reiPreto;
    	List<Peca> pecasDoOponente = (corJogadorAtual == Xadrez.corBRANCA) ? listaPretas : listaBrancas;
    	
    	//Verifica se a peça marcada é o rei e se não foi movido
       	if (pecaMarcada instanceof Rei && pecaMarcada.getMoveCont() == 0) {
       		//Tenta realizar o movimento roque
        	if (movimentoRoque(rei, pecasDoOponente, x, y, oldX, oldY)) 
        		//Caso haja roque, saia do método
        		return;
        }
        //Movimento genérico de peça
        if (pecaMarcada.mover(x, y)) {        
        // Verifica se o movimento coloca o rei em xeque
        	if (rei.reiEmCheck(pecasDoOponente, rei)) {
        		// Desfaz o movimento
        		pecaMarcada.moverIrrestrito(oldX, oldY);
        		System.out.println("Movimento inválido. Rei ficaria em xeque.");
        		return;
        	}
    			
        	pecaMarcada.setMoveCont(pecaMarcada.getMoveCont()+1); //Aumenta a contagem de movimentos dessa peça
        	iPecaMarcada.desmarcar();
        	desmarcarCasas();
        	iPecaMarcada.mover(x, y);
        	pecaMarcada = null;
        	iPecaMarcada = null;
        	if (corJogadorAtual == Xadrez.corBRANCA)
        		corJogadorAtual = Xadrez.corPRETA;
        	else
        		corJogadorAtual = Xadrez.corBRANCA;	       
        }
    }
    
    public static boolean movimentoRoque(Rei rei, List<Peca> pecasDoOponente, int x, int y, int oldX, int oldY)
    //Retorna False = falha; True = sucesso
    {
    	List<Peca> todasPecas = new ArrayList<Peca>();
    	todasPecas.addAll(listaBrancas);
    	todasPecas.addAll(listaPretas);
    	
    	//Verifica possibilidade de roque pequeno
        if (x == 6 && y == rei.getPosY()) {
        	for (Peca peca : todasPecas)
        	{
        		if ((peca.getPosX() == 5 && peca.getPosY() == rei.getPosY())) {
                    System.out.println("Movimento não permitido pois tem peças no caminho.");
                    return false;
        		}
        	}
        	for (Peca peca : todasPecas)
        	{
        		if (peca instanceof Torre && peca.getCor() == rei.getCor() && peca.getPosX() == 7 && peca.getMoveCont() == 0) {
                	if (pecaMarcada.mover(pecaMarcada.getPosX()+1, pecaMarcada.getPosY()))
                	{
                		if (rei.reiEmCheck(pecasDoOponente, rei)) {
            				// Desfaz o movimento
            				pecaMarcada.moverIrrestrito(oldX, oldY);
            				System.out.println("Movimento inválido. Rei ficaria em xeque.");
            				return false;
            			}
                	}
                	
                	if (pecaMarcada.mover(pecaMarcada.getPosX()+1, pecaMarcada.getPosY()))
                	{
                		if (rei.reiEmCheck(pecasDoOponente, rei)) {
            				// Desfaz o movimento
            				pecaMarcada.moverIrrestrito(oldX, oldY);
            				System.out.println("Movimento inválido. Rei ficaria em xeque.");
            				return false;
            			}
                	}
                    	
                    System.out.println("Roque Pequeno");
                    
                    iPecaMarcada.desmarcar();
                    iPecaMarcada.mover(pecaMarcada.getPosX(), pecaMarcada.getPosY());
                    pecaMarcada = null;
                    iPecaMarcada = null;

                    //Move a torre
                    if (peca.getCor() == Xadrez.corBRANCA)
                    	marcarPeca(peca, iTorreBranca2);
                    else
                    	marcarPeca(peca, iTorrePreta2);
                    pecaMarcada.mover(pecaMarcada.getPosX()-2, pecaMarcada.getPosY());
                    iPecaMarcada.desmarcar();
                    iPecaMarcada.mover(pecaMarcada.getPosX(), pecaMarcada.getPosY());
                    iPecaMarcada = null;
                    desmarcarCasas();
                    if (corJogadorAtual == Xadrez.corBRANCA)
                        corJogadorAtual = Xadrez.corPRETA;
                    else
                        corJogadorAtual = Xadrez.corBRANCA;
                    return true;
                }
                
            }
        	//Verifica possibilidade de roque grande 
        } else if (x == 2 && y == rei.getPosY()) {
        	for (Peca peca : todasPecas)
        	{
        		if ((peca.getPosX() == 1 && peca.getPosY() == rei.getPosY())) {
                    System.out.println("Movimento não permitido pois tem peças no caminho.");
                    return false;
        		}
        		if ((peca.getPosX() == 3 && peca.getPosY() == rei.getPosY())) {
                    System.out.println("Movimento não permitido pois tem peças no caminho.");
                    return false;
        		}
        	}
        	for (Peca peca : todasPecas)
            {
        		if (peca instanceof Torre && peca.getCor() == rei.getCor() && peca.getPosX() == 0 && peca.getMoveCont() == 0) {
        			if (pecaMarcada.mover(pecaMarcada.getPosX()-1, pecaMarcada.getPosY()))
                	{
                		if (rei.reiEmCheck(pecasDoOponente, rei)) {
            				// Desfaz o movimento
            				pecaMarcada.moverIrrestrito(oldX, oldY);
            				System.out.println("Movimento inválido. Rei ficaria em xeque.");
            				return false;
            			}
                	}
                	
                	if (pecaMarcada.mover(pecaMarcada.getPosX()-1, pecaMarcada.getPosY()))
                	{
                		if (rei.reiEmCheck(pecasDoOponente, rei)) {
            				// Desfaz o movimento
            				pecaMarcada.moverIrrestrito(oldX, oldY);
            				System.out.println("Movimento inválido. Rei ficaria em xeque.");
            				return false;
            			}
                	}
         
                    System.out.println("Roque Grande");
                    //Move o rei
                    iPecaMarcada.desmarcar();
                    iPecaMarcada.mover(pecaMarcada.getPosX(), pecaMarcada.getPosY());
                    pecaMarcada = null;
                    iPecaMarcada = null;
		
                    //Move a torre
                    if (peca.getCor() == Xadrez.corBRANCA)
                    	marcarPeca(peca, iTorreBranca1);
                    else
                    	marcarPeca(peca, iTorrePreta1);
                    pecaMarcada.mover(pecaMarcada.getPosX()+3, pecaMarcada.getPosY());
                    iPecaMarcada.desmarcar();
                    iPecaMarcada.mover(pecaMarcada.getPosX(), pecaMarcada.getPosY());
                    pecaMarcada = null;
                    iPecaMarcada = null;
                    desmarcarCasas();
                    if (corJogadorAtual == Xadrez.corBRANCA)
                        corJogadorAtual = Xadrez.corPRETA;
                    else
                        corJogadorAtual = Xadrez.corBRANCA;
                    return true;
        		}
            }
        
        }
        
        return false;
    }
}



