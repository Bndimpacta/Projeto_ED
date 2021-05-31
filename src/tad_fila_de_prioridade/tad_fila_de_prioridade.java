package tad_fila_de_prioridade;

import java.util.Scanner;

import Projeto_ED.main;

public class tad_fila_de_prioridade {

	SortedListPriorityQueue<Integer, String> P = new SortedListPriorityQueue<Integer, String>();
	main principal = new main();
	
	public void filaDePrioridade() {
		System.out.println("\n ===== TAD-FILA-DE-PRIORIDADE ===== \n");
		System.out.println("     Antes!!!\n" +
		"Hora da explicação");
		System.out.println("\n A Fila de Prioridades armazena uma coleção de elementos priorizados\r\n"
				+ "que suporta a inserção de elementos arbitrários, mas a remoção de\r\n"
				+ "elementos ocorre em ordem de prioridade.\r\n"
				+ "\r\n"
				+ "Ou seja, o elemento com prioridade mais alta pode ser removido a qualquer\r\n"
				+ "momento.\r\n"
				+ "\r\n"
				+ "É diferente das EDs posicionais discutidas anteriormente, como\r\n"
				+ "pilhas, filas, listas e árvores.\r\n"
				+ "\r\n"
				+ "Essas EDs armazenam elementos em posições específicas, que são\r\n"
				+ "frequentemente posições em uma estrutura linear de elementos,\r\n"
				+ "determinada pela sequência efetuada de inserções e remoções.\r\n"
				+ "\r\n"
				+ "A fila de prioridade armazena elementos de acordo com suas\r\n"
				+ "prioridades e não tem noção de “posição”. \n");
		
		Scanner entrada = new Scanner(System.in);
		int chave = 0;
		String elemento = null;
		boolean back = false;		
		if(back == false) {
			while(!back) {
				System.out.println("\n Metodos");
				System.out.println("0 - Sair");
				System.out.println("1 - Inserir");
				System.out.println("2 - Retorna o menor elemento");
				System.out.println("3 - Retorna o tamanho da lista");
				System.out.println("4 - Retorna se lista está ou não vazia.");
				System.out.println("5 - Remover");
				System.out.println("6 - Consultar");
				System.out.print("Opção escolhida: ");
				int escolha = entrada.nextInt();
				switch(escolha) {
					case 0: //Sair
						back = true;
					break;
					case 1: //Inserir o elemento
						insert(chave, elemento);
					break;
					case 2: //retorna (mas não remove) uma entrada de P com a menor chave
						min();
					break;
					case 3: //Retorna o tamanho da lista
						size();
					break;
					case 4: //Retorna se lista está ou não vazia.
						isEmpty();
					break;
					case 5: //Remover
						removeMin();
					break;
					case 6:  //Consultar
						System.out.println("Resultado = " + P.toString());
					break;
					default: System.out.println("Opção inválida!");
				}
			}
		}else {
			principal.estruturas();
		}
	}

	private void removeMin() {
		System.out.println("\nO método removeMin(): remove de P e retorna uma entrada com a menor chave; uma condição de erro\r\n"
				+ "ocorre se P estiver vazia. \n");
		if(P.min() == null) {
			System.out.println("Não existe nenhum elemento");
		}else {
			System.out.println("O menor elemento foi removido ");
			P.removeMin();
			System.out.println("Resultado = " + P.toString());
		}
	}

	private void min() {
		System.out.println("\nO metodo min(): retorna (mas não remove) uma entrada de P com a menor chave");
		if(P.min() == null) {
			System.out.print("Não existe nenhum elemento");
		}else {
			System.out.print("O menor elemento é " + P.min());
		}
	}

	private void insert(int chave, String elemento) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nO método insert(k, x): mapa armazena um par chave-valor (k,x), chamado de entradas,\r\n"
				+ "onde k é a chave e v é o valor correspondente. \n");
		System.out.println("O TAD Fila de Prioridade requer que cada chave seja única.");
		System.out.println("Exemplo um sistema que armazena um rigistro de estudantes como nome notas e etc, \n" +
		"a chave pode ser o RA do estudante. \n");
		System.out.println("A chave deve ser numerica");
		System.out.print("Digite a chave correspondente ao seu elemento: ");
		chave = entrada.nextInt();
		System.out.print("Digite o elemento que será inserido: ");
		elemento = entrada.next();
		P.insert(chave, elemento);
		System.out.println("Resultado = " + P.toString());
		
	}

	private void isEmpty() {
		if(P.isEmpty() == true) {
			System.out.println("Sua lista se encontra vazia.");
		}else {
			System.out.println("Sua lista não se encontra vazia.");
		}
	}

	private void size() {
		System.out.println("O tamanho da sua lista é " + P.size());
		
	}
}
