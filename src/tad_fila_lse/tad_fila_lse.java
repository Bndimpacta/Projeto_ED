package tad_fila_lse;

import java.util.Scanner;

import Projeto_ED.main;
import tad_fila_array.Fila;

public class tad_fila_lse {

	main principal = new main();
	Fila filaLse = new Fila();

	public void fila_lse() {
		System.out.println("\n ===== TAD-FILA-LSE ===== \n");
		System.out.println("     Antes!!!\n" +
		"Hora da explicação");
		System.out.println("\n Descrição" + "Description \n");
		
		Scanner entrada = new Scanner(System.in);
		String elemento = null;
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

		System.out.println("O tamanho da sua fila é " + filaLse.size());
		
	}

	private void isEmpty() {
		if(filaLse.isEmpty() == true) {
			System.out.println("Sua pilha se encontra vazia.");
		}else {
			System.out.println("Sua pilha não se encontra vazia.");
		}
		
	}

	private void get() {
		System.out.println("A sua fila ficou assim");
		System.out.print(filaLse.toString() + "\n");	
	}

	private void dequeue() {
		System.out.println("\nO método Remove o elemento à frente da fila. \n");
		System.out.println("Elemento removido da pilha: " + filaLse.denqueue());
		System.out.print("Resultado = " + filaLse.toString() + "\n");
	}

	public void enqueue(String elemento) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nO método Insere elemento no final da fila. \n");
		System.out.print("Digite o elemento que será inserido: ");
		elemento = entrada.next();
		filaLse.enqueue(elemento);
		System.out.print("Resultado = " + filaLse.toString() + "\n");
		
	}
}
