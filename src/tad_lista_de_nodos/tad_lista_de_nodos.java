package tad_lista_de_nodos;

import java.util.Scanner;

import Projeto_ED.main;

public class tad_lista_de_nodos {

	main principal = new main();
	NodePositionList listaNodos = new NodePositionList();
	
	public void lista_de_nodos() {
		System.out.println("\n ===== TAD-LISTA-DE-NODOS ===== \n");
		System.out.println("     Antes!!!\n" +
		"Hora da explica��o");
		System.out.println("\n Descri��o" + "Description \n");
		
		Scanner entrada = new Scanner(System.in);
		int posicao = 0;
		String elemento = null;
		boolean back = false;		
		if(back == false) {
			while(!back) {
				System.out.println("\n Metodos");
				System.out.println("0 - Sair");
				System.out.println("1 - Inserir");
				System.out.println("2 - Retorna a posi��o do primeiro elemento da lista");
				System.out.println("3 - Retorna a posi��o do �ltimo elemento da lista");
				System.out.println("4 - Retorna o tamanho da lista");
				System.out.println("5 - Retorna se lista est� ou n�o vazia.");
				System.out.println("6 - Remover");
				System.out.println("7 - Consultar");
				System.out.print("Op��o escolhida: ");
				int escolha = entrada.nextInt();
				switch(escolha) {
					case 0: //Sair
						back = true;
					break;
					case 1: //Inserir o elemento no inicio ou no final da lista 
						adds(elemento);
					break;
					case 2: //posi��o do primeiro elemento da lista
						first();
					break;
					case 3: //posi��o do �ltimo elemento da lista
						last();
					break;
					case 4: //Retorna o tamanho da lista
						size();
					break;
					case 5: //Retorna se lista est� ou n�o vazia.
						isEmpty();
					break;
					case 6: //Remover
						remove();
					break;
					case 7:  //Consultar
						System.out.println("resultado = " + listaNodos.toString());
					break;
					default: System.out.println("Op��o inv�lida!");
				}
			}
		}else {
			principal.estruturas();
		}
	}

	private void remove() { //com problemas
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nO metodo remove:  o metodo recebera como parametro o primeiro elemento da lista \n" +
				"� ira excluir o elemento selecionado por voc�");
		System.out.print("Qual elemento vo� deseja remover: ");
		String remover = entrada.next();
		Position<String> removerNodo = listaNodos.find(listaNodos.first(), remover);
		System.out.println("Elemento removido da pilha: " + listaNodos.remove(removerNodo));
	}

	private void isEmpty() {
		if(listaNodos.isEmpty() == true) {
			System.out.println("Sua lista se encontra vazia.");
		}else {
			System.out.println("Sua lista n�o se encontra vazia.");
		}
	}

	private void size() {
		System.out.println("O tamanho da sua pilha � " + listaNodos.size());
		
	}

	/*public void addAfter(String elemento, int posicao) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nO m�todo addAfter(e): Insere um novo elemento depois da posi��o p.");
		System.out.print("Digite o elemento que ser� inserido: ");
		elemento = entrada.next();
		System.out.print("Agora digite a posi��o que ser� escolhida: ");
		posicao = entrada.nextInt();
		Position<Integer> node1 = posicao;
		listaNodos.addAfter(node1, elemento);
		System.out.println(listaNodos.toString());
	}

	public void addBefore(String elemento, int posicao) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nO m�todo addBefore(e): Insere um novo elemento antes da posi��o escolhida.");
		System.out.print("Digite o elemento que ser� inserido: ");
		elemento = entrada.next();
		System.out.print("Agora digite a posi��o que ser� escolhida: ");
		posicao = entrada.nextInt();
	}*/

	private void last() {
		System.out.println("\nO m�todo last(): Retorna a posi��o do �ltimo elemento da lista.");
		Position<Integer> nodeLista = listaNodos.last();
		System.out.print("O �ltimo elemento da sua lista � " + nodeLista.elemento());
	}

	private void first() {
		System.out.println("\nO m�todo last(): Retorna a posi��o do �ltimo elemento da lista.");
		Position<Integer> nodeLista = listaNodos.first();
		System.out.print("O �ltimo elemento da sua lista � " + nodeLista.elemento());
	}

	private void adds(String elemento) {
		Scanner entrada = new Scanner(System.in);
		int escolha = 0;
		System.out.println("\nDentro dos metodos de Inserir no TAD lista de nodos, \n" +
		"voc� pode tanto inserir o seu elemento no inicio ou no final da sua lista, \n" + 
		"sendo assim voce escolhe inserir no final ou no inicio da sua lista ? \n");
		System.out.println("0 - Inserir o elemento no inicio da lista.");
		System.out.println("1 - Inserir o elemento no final da lista.");
		System.out.print("Op��o escolhida: ");
		escolha = entrada.nextInt();
		switch(escolha) {
			case 0:
				System.out.println("\nO m�todo addFirst(e): Insere o novo elemento como o primeiro elemento da lista. \n");
				System.out.print("Digite o elemento que ser� inserido no inicio da lista: ");
				elemento = entrada.next();
				listaNodos.addFirst(elemento);
				System.out.println(listaNodos.toString());
				break;
			case 1:
				System.out.println("\nO m�todo addLast(e): Insere o novo elemento como �ltimo elemento da lista. \n");
				System.out.print("Digite o elemento que ser� inserido no final da lista: ");
				elemento = entrada.next();
				listaNodos.addLast(elemento);
				System.out.println(listaNodos.toString());
				break;
			default: System.out.println("Op��o inv�lida!");
		}
	}
}
