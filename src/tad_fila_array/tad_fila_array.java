package tad_fila_array;

import java.util.Scanner;

import Projeto_ED.main;

public class tad_fila_array {

	main principal = new main();
	Fila filaArray = new Fila();

	public void fila_array() {
		System.out.println("\n ===== TAD-FILA-ARRAY ===== \n");
		System.out.println("     Antes!!!\n" +
		"Hora da explicação");
		System.out.println("\n Descrição" + "Description \n");
		
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
				System.out.print("Opção escolhida: ");
				int escolha = entrada.nextInt();
				switch(escolha) {
					case 0: //Sair
						back = true;
					break;
					case 1: //Inserir
						enqueue(elemento);
					break;
					case 2: //Remover
						dequeue();
					break;
					case 3:  //pilha esta vazia
						isEmpty();
					break;
					case 4: //Remover
						size();
					break;
					case 5: //Consultar
						get();
					break;
					default: System.out.println("Opção inválida!");
				}
			}
		}else {
			principal.estruturas();
		}
	}

	private void size() {

		System.out.println("O tamanho da sua fila é " + filaArray.size());
		
	}

	private void isEmpty() {
		if(filaArray.isEmpty() == true) {
			System.out.println("Sua pilha se encontra vazia.");
		}else {
			System.out.println("Sua pilha não se encontra vazia.");
		}
		
	}

	private void get() {
		System.out.println("A sua fila ficou assim");
		System.out.print(filaArray.toString() + "\n");	
	}

	private void dequeue() {
		System.out.println("\nO método Remove o elemento à frente da fila. \n");
		System.out.println("Elemento removido da pilha: " + filaArray.denqueue());
		System.out.print("Resultado = " + filaArray.toString() + "\n");
	}

	public void enqueue(int elemento) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nO método Insere elemento no final da fila. \n");
		System.out.print("Digite o elemento que será inserido: ");
		elemento = entrada.nextInt();
		filaArray.enqueue(elemento);
		System.out.print("Resultado = " + filaArray.toString() + "\n");
		
	}
}
