package tad_pilha_lse;

import java.util.Scanner;

import Projeto_ED.main;

public class tad_pilha_lse {

	main principal = new main();
	NodeStack pilhaLse = new NodeStack();
	
	public void pilha_lse() {
		System.out.println("\n ===== TAD-PILHA-ARRAY ===== \n");
		System.out.println("     Antes!!!\n" +
		"Hora da explicação");
		System.out.println("\n Descrição " + " Description \n");
		
		Scanner entrada = new Scanner(System.in);
		int indice = 0;
		int elemento = 0;
		boolean back = false;		
		if(back == false) {
			while(!back) {
				System.out.println("\n0 - Sair");
				System.out.println("1 - Inserir");
				System.out.println("2 - Remover");
				System.out.println("3 - Verifica se sua pilha esta vazia");
				System.out.println("4 - Verifica o tamanho da sua pilha");
				System.out.println("5 - Consultar");
				System.out.println("6 - topo da pilha");
				System.out.print("Opção escolhida: ");
				int escolha = entrada.nextInt();
				switch(escolha) {
					case 0: //Sair
						back = true;
					break;
					case 1: //Inserir
						push(elemento);
					break;
					case 2: //Remover
						pop();
					break;
					case 3: //pilha esta vazia
						isEmpty();
					break;
					case 4: //tamanho da sua pilha
						size();
					break;
					case 5: //Consultar
						get();
					break;
					case 6: //Topo da pilha
						top();
					break;
					default: System.out.println("Opção inválida!");
				}
			}
		}else {
			principal.estruturas();
		}
	}
	
	private void top() {
		System.out.println("Retorna o elemento no topo da pilha sem retirá-lo; ocorre erro se a pilha\r\n"
				+ "estiver vazia.\n");
		System.out.println("O elemento que está no topo da pilha: " + pilhaLse.top);
	}

	private void get() {
		System.out.println("A sua pilha ficou assim");
		System.out.print(pilhaLse.toString() + "\n");
	}

	public void size() {
		System.out.println("O tamanho da sua pilha é " + pilhaLse.size());
	}

	public void isEmpty() {
		if(pilhaLse.isEmpty() == true) {
			System.out.println("Sua pilha se encontra vazia.");
		}else {
			System.out.println("Sua pilha não se encontra vazia.");
		}
		
	}

	public void pop() {
		System.out.println("Remove o elemento no topo da pilha e o retorna; ocorre um erro se a pilha\r\n"
				+ "estiver vazia.");
		System.out.println("Elemento removido da pilha: " + pilhaLse.pop());
		System.out.print("Resultado = " + pilhaLse.toString() + "\n");
	}

	public void push(int elemento) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nO método push(e): Insere o objeto e no topo da pilha. \n");
		System.out.print("Digite o elemento que será inserido: ");
		elemento = entrada.nextInt();
		pilhaLse.push(elemento);
		System.out.print("Resultado = " + pilhaLse.toString() + "\n");
	}
}
