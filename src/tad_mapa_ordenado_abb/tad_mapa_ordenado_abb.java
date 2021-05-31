package tad_mapa_ordenado_abb;

import java.util.Scanner;

import Projeto_ED.main;

public class tad_mapa_ordenado_abb {

	BinarySearchTree<Integer, Integer> A = new BinarySearchTree<Integer, Integer>();
	main principal = new main();
	
	public void tadMapaOrdenado() {
		System.out.println("\n ===== TAD-MAPA-ORDENADO-ABB ===== \n");
		System.out.println("     Antes!!!\n" +
		"Hora da explicação");
		System.out.println("\n As árvores de pesquisa são árvores que podem implementar mapas.\r\n"
				+ "\r\n"
				+ "Os métodos fundamentais do TAD mapa:\r\n"
				+ "\r\n"
				+ "get(k): retorna o valor v da entrada (k,v), com chave igual a k, se existir.\r\n"
				+ "\r\n"
				+ "put(k,v): insere a entrada (k,v) conforme o mapeamento de k para v.\r\n"
				+ "\r\n"
				+ "remove(k): remove a entrada com chave igual a k e retorna seu valor.\r\n"
				+ "\r\n"
				+ "O TAD mapa ordenado pode inclui métodos para pesquisar usando\r\n"
				+ "predecessores e sucessores de uma chave, mas seus desempenhos\r\n"
				+ "dependem de uma busca sequencial.\r\n"
				+ "\r\n"
				+ "Árvores binárias são excelentes para armazenar elementos num\r\n"
				+ "mapa, assumindo as chaves possuam uma relação de ordem.\r\n"
				+ "\r\n"
				+ "Uma árvore binária de pesquisa é uma árvore binária T, em que cada\r\n"
				+ "nodo interno v de T armazena um elemento (k, x) que:\r\n"
				+ "\r\n"
				+ "As chaves nos nodos da subárvore esquerda de v são menores ou iguais a k.\r\n"
				+ "\r\n"
				+ "As chaves nos nodos da subárvore direita de v são maiores ou iguais a k.\r\n"
				+ "\r\n"
				+ "Dessa forma, as chaves de T permitem pesquisar uma chave k\r\n"
				+ "comparando cada nodo interno v, que pode parar em v ou continuar\r\n"
				+ "nos filhos à esquerda ou à direita de v.\r\n"
				+ "\r\n"
				+ "Armazenam-se elementos somente nos nodos internos da árvore\r\n"
				+ "binária de pesquisa, os nodos externos servem só como placeholders.\r\n"
				+ "\r\n"
				+ "Esta abordagem simplifica os algoritmos de pesquisa ou alteração.\r\n"
				+ "\r\n"
				+ "Casualmente, poderiam ser permitidas árvores binárias de pesquisa\r\n"
				+ "impróprias, as quais usam melhor o espaço, mas às custas de métodos de\r\n"
				+ "pesquisa e atualizações mais complicados.\r\n"
				+ "\r\n"
				+ "Uma árvore binária de pesquisa deve representar de forma\r\n"
				+ "hierárquica a ordenação de suas chaves, usando relacionamentos\r\n"
				+ "entre pais e filhos.\r\n"
				+ "\r\n"
				+ "Especificamente, um caminhamento inorder dos nodos de uma\r\n"
				+ "árvore binária de pesquisa T deverá visitar as chaves em ordem não\r\n"
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
				System.out.print("Opção escolhida: ");
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
					default: System.out.println("Opção inválida!");
				}
			}
		}else {
			principal.estruturas();
		}
	}

	private void remove(int chave) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nO método removeExternal(v): remove um nodo externo v e seu pai,\r\n"
				+ "substituindo o pai de v pelo irmão de v; um\r\n"
				+ "erro ocorre se v não for um nodo externo.\n");
		System.out.print("Digite a chave correspondente ao seu elemento: ");
		chave = entrada.nextInt();
		if(A.get(chave) == null) {
			System.out.println("null - Não existe nenhum elemento com essa chave");
		}else {
			System.out.println("O elemento dessa chave foi removido ");
			A.remove(chave);
			System.out.println("Resultado = " + A.keySet().toString());
		}
	}

	private void get(int chave) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nO método get(k) em um mapa D que é representado\r\n"
				+ "por uma árvore binária de pesquisa T, enxerga-se a árvore T como\r\n"
				+ "uma árvore de decisão.\n");
		System.out.print("Digite a chave correspondente ao seu elemento: ");
		chave = entrada.nextInt();
		System.out.println("O elemento dessa chave é " + A.get(chave));
		if(A.get(chave) == null) {
			System.out.println("null - Não existe nenhum elemento com essa chave");
		}else {
			System.out.println("O elemento dessa chave é " + A.get(chave));
		}
	}

	private void put(int elemento) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\n O metodo insertAtExternal(v, e): insere o elemento e no nodo externo v, expande v para ser interno colocando\r\n"
				+ "dois novos filhos (vazios) externos; um erro ocorre se v é um nodo interno.");
		System.out.print("Digite o elemento que será inserido: ");
		elemento = entrada.nextInt();
		A.put(elemento, elemento);
		System.out.println("Resultado = " +  A.keySet().toString());
	}
}
