package tad_arvore_generica;

import java.util.Scanner;

import Projeto_ED.main;

public class tad_arvore_generica {

	LinkedTree<String> T = new LinkedTree<String>();
	main principal = new main();
	
	public void arvoreGenerica() {
		System.out.println("\n ===== TAD-�RVORE-GENERICA ===== \n");
		System.out.println("     Antes!!!\n" +
		"Hora da explica��o");
		System.out.println("\n Estruturas de dados n�o lineares mais importantes da computa��o.\r\n"
				+ "\r\n"
				+ "�rvore permitem a implementa��o de uma gama de algoritmos\r\n"
				+ "muito mais r�pidos do que estruturas de dados lineares, como listas. \n");
		System.out.println("Sua organiza��o � mais rica do que simplesmente �antes� e �depois�\r\n"
				+ "entre objetos de uma lista, pois s�o hier�rquicos, com alguns objetos\r\n"
				+ "estando �acima� e outros �abaixo�.\r\n"
				+ "\r\n"
				+ "A terminologia vem das �rvores geneal�gicas; assim os termos pai,\r\n"
				+ "filho, ancestral e descendente s�o usados para descrev�-las.");
		
		Scanner entrada = new Scanner(System.in);
		int indice = 0;
		String elemento = null;
		boolean back = false;		
		if(back == false) {
			while(!back) {
				System.out.println("\n0 - Sair");
				System.out.println("1 - Exemplo");
				System.out.print("Op��o escolhida: ");
				int escolha = entrada.nextInt();
				switch(escolha) {
					case 0: //Sair
						back = true;
					break;
					case 1: //Inserir
						TreePosition<String> raiz;
						
						Position<Position<String>> p, s;
					
						PositionList<Position<String>> filhos;
					
						LinkedTree<String> T = criarArvoreT();
						System.out.println("\nPrimeiro de cria a raiz da arvore generica");
						System.out.println("Exemplo: para saber alunos cadastrados em cada turma,\n"
						+ "nome da nossa raiz vai ser Alunos\n");
						System.out.println("\nLogo Depois criaremos os seus 'filhos' como se fosse criar uma raiz de uma arvore");
						System.out.println("Que no exemplo a seguir ser 1�A, 1�B, 1�C, 1�D");
						System.out.println(T.parentheticRepresentation(T, T.root()));
						System.out.println("\nE possivel criar varias ramifica��es 'filhos' de uma raiz,\n" + 
						"e tambem filhos dos filhos");
					break;
					default: System.out.println("Op��o inv�lida!");
				}
			}
		}else {
			principal.estruturas();
		}
	}
	
	/*private void criarArvoreGenerica() {
		boolean parar = false;
		String raiz = null;
		int totalDeFilhos = 0;
		String filhosRaiz = null;
		while(!parar) {
			Scanner entrada = new Scanner(System.in);
			System.out.println("\nPrimeiro vamos criar a raiz da sua arvore generica");
			raiz = entrada.next();
			T.addRoot(raiz);
			System.out.println("\nLogo Depois criaremos os seus filhos como se fosse criar uma raiz de uma arvore");
			System.out.println("Quantos filhos pretende criar para sua raiz ? ");
			totalDeFilhos = entrada.nextInt();
			for(int i = 0;  i < totalDeFilhos; i++) {
				System.out.println("Digite o " + i + "� filho da raiz: ");
				filhosRaiz = entrada.next();
				//criarFilho(raiz, "P&D");
				System.out.println();
			} 
		}
	}*/
	
	private TreeNode<String> criarFilho(TreeNode<String> p, String n) {
		
		PositionList<Position<String>> filhos;
	
		TreeNode<String> aux;
	
		// Obt�m os Filhos de p
	
		filhos = p.getChildren();
	
		// Cria um novo filho
	
		aux = new TreeNode<String>();
	
		aux.setElement(n);
	
		aux.setParent(p);
	
		aux.setChildren(new NodePositionList<Position<String>>());
	
		filhos.addLast(aux);
	
		return aux;
	}
	
	public LinkedTree<String> criarArvoreT() {

		LinkedTree<String> T = new LinkedTree<String>();

		TreeNode<String> raiz, v, m, i, u;

		T.addRoot("Alunos");

		raiz = (TreeNode<String>) T.root();

		raiz.setChildren(new NodePositionList<Position<String>>());

		// Filhos da raiz: Eletronic R'Us

		criarFilho(raiz, "1�A");

		v = criarFilho(raiz, "1�B");

		criarFilho(raiz, "1�C");

		m = criarFilho(raiz, "1�D");
		
		criarFilho(v, "Tuner");
		
		criarFilho(m, "Thiago");

		return T;

		}
}
