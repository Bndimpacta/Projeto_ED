package tad_arvore_generica;

import java.util.Scanner;

import Projeto_ED.main;

public class tad_arvore_generica {

	LinkedTree<String> T = new LinkedTree<String>();
	main principal = new main();
	
	public void arvoreGenerica() {
		System.out.println("\n ===== TAD-ÁRVORE-GENERICA ===== \n");
		System.out.println("     Antes!!!\n" +
		"Hora da explicação");
		System.out.println("\n Estruturas de dados não lineares mais importantes da computação.\r\n"
				+ "\r\n"
				+ "Árvore permitem a implementação de uma gama de algoritmos\r\n"
				+ "muito mais rápidos do que estruturas de dados lineares, como listas. \n");
		System.out.println("Sua organização é mais rica do que simplesmente “antes” e “depois”\r\n"
				+ "entre objetos de uma lista, pois são hierárquicos, com alguns objetos\r\n"
				+ "estando “acima” e outros “abaixo”.\r\n"
				+ "\r\n"
				+ "A terminologia vem das árvores genealógicas; assim os termos pai,\r\n"
				+ "filho, ancestral e descendente são usados para descrevê-las.");
		
		Scanner entrada = new Scanner(System.in);
		int indice = 0;
		String elemento = null;
		boolean back = false;		
		if(back == false) {
			while(!back) {
				System.out.println("\n0 - Sair");
				System.out.println("1 - Exemplo");
				System.out.print("Opção escolhida: ");
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
						System.out.println("Que no exemplo a seguir ser 1ºA, 1ºB, 1ºC, 1ºD");
						System.out.println(T.parentheticRepresentation(T, T.root()));
						System.out.println("\nE possivel criar varias ramificações 'filhos' de uma raiz,\n" + 
						"e tambem filhos dos filhos");
					break;
					default: System.out.println("Opção inválida!");
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
				System.out.println("Digite o " + i + "º filho da raiz: ");
				filhosRaiz = entrada.next();
				//criarFilho(raiz, "P&D");
				System.out.println();
			} 
		}
	}*/
	
	private TreeNode<String> criarFilho(TreeNode<String> p, String n) {
		
		PositionList<Position<String>> filhos;
	
		TreeNode<String> aux;
	
		// Obtém os Filhos de p
	
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

		criarFilho(raiz, "1ºA");

		v = criarFilho(raiz, "1ºB");

		criarFilho(raiz, "1ºC");

		m = criarFilho(raiz, "1ºD");
		
		criarFilho(v, "Tuner");
		
		criarFilho(m, "Thiago");

		return T;

		}
}
