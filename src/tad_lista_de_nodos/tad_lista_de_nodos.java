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
		int indice = 0;
		String elemento = null;
		boolean back = false;		
		if(back == false) {
			while(!back) {
				System.out.println("\n0 - Sair");
				System.out.println("1 - Inserir no primeiro elemento da lista.");
				System.out.println("3 - Inserir no primeiro elemento da lista.");
				System.out.println("4 - Inserir no último elemento da lista.");
				System.out.println("5 - Remover");
				System.out.println("6 - Consultar");
				System.out.print("Opção escolhida: ");
				int escolha = entrada.nextInt();
				switch(escolha) {
					case 0: //Sair
						back = true;
					break;
					case 1: //Inserir no primeiro elemento da lista
						add(elemento);
					break;
					case 2: //Remover
						addLast(elemento);
					break;
					case 3:  //pilha esta vazia
						System.out.println("result " + listaNodos.toString());
					break;
					default: System.out.println("Opção inválida!");
				}
			}
		}else {
			principal.estruturas();
		}
	}

	public void addLast(String elemento) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nO método aaddLast(e): Insere o novo elemento e como último elemento da lista. \n");
		System.out.print("Digite o elemento que será inserido no final da lista: ");
		elemento = entrada.next();
		if(listaNodos.isEmpty()) { 
			listaNodos.addLast(elemento);
			System.out.println("Teste6" + listaNodos.toString());
		}
	}

	public void add(String elemento) {
		Scanner entrada = new Scanner(System.in);
		switch() {
			case 0:
				break;
			case 1:
				break;
			}
		System.out.println("\nO método addFirst(e): Insere o novo elemento e como o primeiro elemento da lista. \n");
		System.out.print("Digite o elemento que será inserido no inicio da lista: ");
		elemento = entrada.next();
		if(listaNodos.isEmpty()) { 
			listaNodos.addFirst(elemento);
			System.out.println("teste"+listaNodos.toString());
		}
	}
}
