package tad_lista_de_nodos;

import java.util.Scanner;

import Projeto_ED.main;

public class tad_lista_de_nodos {

	main principal = new main();
	NodePositionList listaNodos = new NodePositionList();
	
	public void lista_de_nodos() {
		System.out.println("\n ===== TAD-LISTA-DE-NODOS ===== \n");
		System.out.println("     Antes!!!\n" +
		"Hora da explicação");
		System.out.println("\n Descrição" + "Description \n");
		
		Scanner entrada = new Scanner(System.in);
		int posicao = 0;
		String elemento = null;
		boolean back = false;		
		if(back == false) {
			while(!back) {
				System.out.println("\n Metodos");
				System.out.println("0 - Sair");
				System.out.println("1 - Inserir");
				System.out.println("2 - Retorna a posição do primeiro elemento da lista");
				System.out.println("3 - Retorna a posição do último elemento da lista");
				System.out.println("4 - Retorna o tamanho da lista");
				System.out.println("5 - Retorna se lista está ou não vazia.");
				System.out.println("6 - Remover");
				System.out.println("7 - Consultar");
				System.out.print("Opção escolhida: ");
				int escolha = entrada.nextInt();
				switch(escolha) {
					case 0: //Sair
						back = true;
					break;
					case 1: //Inserir o elemento no inicio ou no final da lista 
						adds(elemento);
					break;
					case 2: //posição do primeiro elemento da lista
						first();
					break;
					case 3: //posição do último elemento da lista
						last();
					break;
					case 4: //Retorna o tamanho da lista
						size();
					break;
					case 5: //Retorna se lista está ou não vazia.
						isEmpty();
					break;
					case 6: //Remover
						remove();
					break;
					case 7:  //Consultar
						System.out.println("resultado = " + listaNodos.toString());
					break;
					default: System.out.println("Opção inválida!");
				}
			}
		}else {
			principal.estruturas();
		}
	}

	private void remove() { //com problemas
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nO metodo remove:  o metodo recebera como parametro o primeiro elemento da lista \n" +
				"é ira excluir o elemento selecionado por você");
		System.out.print("Qual elemento voê deseja remover: ");
		String remover = entrada.next();
		Position<String> removerNodo = listaNodos.find(listaNodos.first(), remover);
		System.out.println("Elemento removido da pilha: " + listaNodos.remove(removerNodo));
	}

	private void isEmpty() {
		if(listaNodos.isEmpty() == true) {
			System.out.println("Sua lista se encontra vazia.");
		}else {
			System.out.println("Sua lista não se encontra vazia.");
		}
	}

	private void size() {
		System.out.println("O tamanho da sua pilha é " + listaNodos.size());
		
	}

	/*public void addAfter(String elemento, int posicao) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nO método addAfter(e): Insere um novo elemento depois da posição p.");
		System.out.print("Digite o elemento que será inserido: ");
		elemento = entrada.next();
		System.out.print("Agora digite a posição que será escolhida: ");
		posicao = entrada.nextInt();
		Position<Integer> node1 = posicao;
		listaNodos.addAfter(node1, elemento);
		System.out.println(listaNodos.toString());
	}

	public void addBefore(String elemento, int posicao) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nO método addBefore(e): Insere um novo elemento antes da posição escolhida.");
		System.out.print("Digite o elemento que será inserido: ");
		elemento = entrada.next();
		System.out.print("Agora digite a posição que será escolhida: ");
		posicao = entrada.nextInt();
	}*/

	private void last() {
		System.out.println("\nO método last(): Retorna a posição do último elemento da lista.");
		Position<Integer> nodeLista = listaNodos.last();
		System.out.print("O último elemento da sua lista é " + nodeLista.elemento());
	}

	private void first() {
		System.out.println("\nO método last(): Retorna a posição do último elemento da lista.");
		Position<Integer> nodeLista = listaNodos.first();
		System.out.print("O último elemento da sua lista é " + nodeLista.elemento());
	}

	private void adds(String elemento) {
		Scanner entrada = new Scanner(System.in);
		int escolha = 0;
		System.out.println("\nDentro dos metodos de Inserir no TAD lista de nodos, \n" +
		"você pode tanto inserir o seu elemento no inicio ou no final da sua lista, \n" + 
		"sendo assim voce escolhe inserir no final ou no inicio da sua lista ? \n");
		System.out.println("0 - Inserir o elemento no inicio da lista.");
		System.out.println("1 - Inserir o elemento no final da lista.");
		System.out.print("Opção escolhida: ");
		escolha = entrada.nextInt();
		switch(escolha) {
			case 0:
				System.out.println("\nO método addFirst(e): Insere o novo elemento como o primeiro elemento da lista. \n");
				System.out.print("Digite o elemento que será inserido no inicio da lista: ");
				elemento = entrada.next();
				listaNodos.addFirst(elemento);
				System.out.println(listaNodos.toString());
				break;
			case 1:
				System.out.println("\nO método addLast(e): Insere o novo elemento como último elemento da lista. \n");
				System.out.print("Digite o elemento que será inserido no final da lista: ");
				elemento = entrada.next();
				listaNodos.addLast(elemento);
				System.out.println(listaNodos.toString());
				break;
			default: System.out.println("Opção inválida!");
		}
	}
}
