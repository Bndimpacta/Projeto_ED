package tad_arvore_binaria;

import java.util.Scanner;

import Projeto_ED.main;

public class tad_arvore_binaria {

	main principal = new main();
	LinkedBinaryTree arvoreBinaria = new LinkedBinaryTree();
	
	public void arvoreBinaria() {
		System.out.println("\n ===== TAD-�RVORE-BIN�RIA ===== \n");
		System.out.println("     Antes!!!\n" +
		"Hora da explica��o");
		System.out.println("\n Uma �rvore bin�ria � uma �rvore ordenada com as seguintes\r\n"
				+ "propriedades:\r\n"
				+ "\r\n"
				+ "Todos os nodos t�m no m�ximo dois filhos.\r\n"
				+ "\r\n"
				+ "Cada nodo filho � rotulado como sendo um filho da direita ou um filho da\r\n"
				+ "esquerda.\r\n"
				+ "\r\n"
				+ "O filho da esquerda precede o filho da direita na ordena��o dos filhos de\r\n"
				+ "um nodo.\r\n"
				+ "\r\n"
				+ "A sub�rvore filho da direita � chamada de sub�rvore direita.\r\n"
				+ "\r\n"
				+ "A sub�rvore filho da esquerda � chamada de sub�rvore esquerda.\r\n"
				+ "\r\n"
				+ "A �rvore bin�ria � pr�pria (ou cheia) se cada nodo tem 0 ou 2 filhos.\r\n"
				+ "\r\n"
				+ "Uma �rvore bin�ria que n�o � pr�pria � impr�pria. \n" 
				+ "Pode-se definir uma �rvore bin�ria de maneira recursiva:\r\n"
				+ "\r\n"
				+ "Uma �rvore bin�ria T:\r\n"
				+ "\r\n"
				+ "� vazia ou\r\n"
				+ "\r\n"
				+ "Possui:\r\n"
				+ "\r\n"
				+ "Um nodo r chamado de raiz de T que armazena um elemento.\r\n"
				+ "\r\n"
				+ "Sub�rvore esquerda de T.\r\n"
				+ "\r\n"
				+ "Sub�rvore direita de T.");
		
		Scanner entrada = new Scanner(System.in);
		int indice = 0;
		String elemento = null;
		boolean back = false;		
		if(back == false) {
			while(!back) {
				System.out.println("\nMetodos");
				System.out.println("\n0 - Sair");
				System.out.println("1 - Inserir");
				System.out.println("2 - Remover");
				System.out.print("Op��o escolhida: ");
				int escolha = entrada.nextInt();
				switch(escolha) {
					case 0: //Sair
						back = true;
					break; 
					case 1: //Inserir
						addRoot(elemento);
					break;
					case 2: //Remover
						//remove(elemento);
					break;
					default: System.out.println("Op��o inv�lida!");
				}
			}
		}else {
			principal.estruturas();
		}
	}

	/*private void remove(String elemento) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nO m�todo remove(v): Insere a raiz em uma �rvore vazia. \n");
		System.out.print("Digite o elemento que ser� removido: ");
		elemento = entrada.next();
		arvoreBinaria.remove(elemento);
		System.out.print(arvoreBinaria.root());
	}*/

	public void addRoot(String elemento) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nO m�todo addRoot(e): Insere a raiz em uma �rvore vazia. \n");
		System.out.print("Digite o elemento que ser� inserido: ");
		elemento = entrada.next();
		arvoreBinaria.root();
		arvoreBinaria.addRoot(elemento);
		arvoreBinaria.desenhaArvore(arvoreBinaria, arvoreBinaria.root(), 0, 0);
	}

	public LinkedBinaryTree<String> BuildExpression(String E){
		ArrayStack<LinkedBinaryTree<String>> S = new ArrayStack<LinkedBinaryTree<String>>();
		
		for (int i=0; i<E.length();i++){
			if(E.charAt(i)!=')' && E.charAt(i)!='(') {
				LinkedBinaryTree<String> arvoreBinaria = new LinkedBinaryTree<String>();
				arvoreBinaria.addRoot(Character.toString(E.charAt(i)));
				S.push(arvoreBinaria);
			}
			else if(E.charAt(i)=='(') { 
				
			}
			else if(E.charAt(i)==')') {
				LinkedBinaryTree<String> T2 = new LinkedBinaryTree<String>();
				T2=S.pop();
				LinkedBinaryTree<String> T = new LinkedBinaryTree<String>();
				T=S.pop();
				LinkedBinaryTree<String> T1 = new LinkedBinaryTree<String>();
				T1=S.pop();
				T.attach(T.root(), T1, T2);
				S.push(T);


			}
			
		}
		return S.pop();
	}
}
