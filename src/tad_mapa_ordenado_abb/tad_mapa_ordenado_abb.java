package tad_mapa_ordenado_abb;

import java.util.Scanner;

import Projeto_ED.main;

public class tad_mapa_ordenado_abb {

	BinarySearchTree<Integer, Integer> A = new BinarySearchTree<Integer, Integer>();
	main principal = new main();
	
	public void tadMapaOrdenado() {
		System.out.println("\n ===== TAD-MAPA-ORDENADO-ABB ===== \n");
		System.out.println("     Antes!!!\n" +
		"Hora da explica��o");
		System.out.println("\n As �rvores de pesquisa s�o �rvores que podem implementar mapas.\r\n"
				+ "\r\n"
				+ "Os m�todos fundamentais do TAD mapa:\r\n"
				+ "\r\n"
				+ "get(k): retorna o valor v da entrada (k,v), com chave igual a k, se existir.\r\n"
				+ "\r\n"
				+ "put(k,v): insere a entrada (k,v) conforme o mapeamento de k para v.\r\n"
				+ "\r\n"
				+ "remove(k): remove a entrada com chave igual a k e retorna seu valor.\r\n"
				+ "\r\n"
				+ "O TAD mapa ordenado pode inclui m�todos para pesquisar usando\r\n"
				+ "predecessores e sucessores de uma chave, mas seus desempenhos\r\n"
				+ "dependem de uma busca sequencial.\r\n"
				+ "\r\n"
				+ "�rvores bin�rias s�o excelentes para armazenar elementos num\r\n"
				+ "mapa, assumindo as chaves possuam uma rela��o de ordem.\r\n"
				+ "\r\n"
				+ "Uma �rvore bin�ria de pesquisa � uma �rvore bin�ria T, em que cada\r\n"
				+ "nodo interno v de T armazena um elemento (k, x) que:\r\n"
				+ "\r\n"
				+ "As chaves nos nodos da sub�rvore esquerda de v s�o menores ou iguais a k.\r\n"
				+ "\r\n"
				+ "As chaves nos nodos da sub�rvore direita de v s�o maiores ou iguais a k.\r\n"
				+ "\r\n"
				+ "Dessa forma, as chaves de T permitem pesquisar uma chave k\r\n"
				+ "comparando cada nodo interno v, que pode parar em v ou continuar\r\n"
				+ "nos filhos � esquerda ou � direita de v.\r\n"
				+ "\r\n"
				+ "Armazenam-se elementos somente nos nodos internos da �rvore\r\n"
				+ "bin�ria de pesquisa, os nodos externos servem s� como placeholders.\r\n"
				+ "\r\n"
				+ "Esta abordagem simplifica os algoritmos de pesquisa ou altera��o.\r\n"
				+ "\r\n"
				+ "Casualmente, poderiam ser permitidas �rvores bin�rias de pesquisa\r\n"
				+ "impr�prias, as quais usam melhor o espa�o, mas �s custas de m�todos de\r\n"
				+ "pesquisa e atualiza��es mais complicados.\r\n"
				+ "\r\n"
				+ "Uma �rvore bin�ria de pesquisa deve representar de forma\r\n"
				+ "hier�rquica a ordena��o de suas chaves, usando relacionamentos\r\n"
				+ "entre pais e filhos.\r\n"
				+ "\r\n"
				+ "Especificamente, um caminhamento inorder dos nodos de uma\r\n"
				+ "�rvore bin�ria de pesquisa T dever� visitar as chaves em ordem n�o\r\n"
				+ "decrescente. \n");
		
		Scanner entrada = new Scanner(System.in);
		int chave = 0;
		int elemento = 0;
		boolean back = false;		
		if(back == false) {
			while(!back) {
				System.out.println("\n Metodos");
				System.out.println("0 - Sair");
				System.out.println("1 - Inserir");
				System.out.println("2 - Retorna o elemento pela sua chave");
				System.out.println("3 - Remover");
				System.out.println("4 - Consultar");
				System.out.print("Op��o escolhida: ");
				int escolha = entrada.nextInt();
				switch(escolha) {
					case 0: //Sair
						back = true;
					break;
					case 1: //Inserir o elemento
						put(elemento);
					break;
					case 2: //Retorna o elemento pela sua chave 
						get(chave);
					break;
					case 3: //Remover
						remove(chave);
					break;
					case 4:  //Consultar
						System.out.println("Resultado = " + A.keySet().toString());
					break;
					default: System.out.println("Op��o inv�lida!");
				}
			}
		}else {
			principal.estruturas();
		}
	}

	private void remove(int chave) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nO m�todo removeExternal(v): remove um nodo externo v e seu pai,\r\n"
				+ "substituindo o pai de v pelo irm�o de v; um\r\n"
				+ "erro ocorre se v n�o for um nodo externo.\n");
		System.out.print("Digite a chave correspondente ao seu elemento: ");
		chave = entrada.nextInt();
		if(A.get(chave) == null) {
			System.out.println("null - N�o existe nenhum elemento com essa chave");
		}else {
			System.out.println("O elemento dessa chave foi removido ");
			A.remove(chave);
			System.out.println("Resultado = " + A.keySet().toString());
		}
	}

	private void get(int chave) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nO m�todo get(k) em um mapa D que � representado\r\n"
				+ "por uma �rvore bin�ria de pesquisa T, enxerga-se a �rvore T como\r\n"
				+ "uma �rvore de decis�o.\n");
		System.out.print("Digite a chave correspondente ao seu elemento: ");
		chave = entrada.nextInt();
		System.out.println("O elemento dessa chave � " + A.get(chave));
		if(A.get(chave) == null) {
			System.out.println("null - N�o existe nenhum elemento com essa chave");
		}else {
			System.out.println("O elemento dessa chave � " + A.get(chave));
		}
	}

	private void put(int elemento) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\n O metodo insertAtExternal(v, e): insere o elemento e no nodo externo v, expande v para ser interno colocando\r\n"
				+ "dois novos filhos (vazios) externos; um erro ocorre se v � um nodo interno.");
		System.out.print("Digite o elemento que ser� inserido: ");
		elemento = entrada.nextInt();
		A.put(elemento, elemento);
		System.out.println("Resultado = " +  A.keySet().toString());
	}
}
