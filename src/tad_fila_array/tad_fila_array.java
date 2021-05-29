package tad_fila_array;

import java.util.Scanner;

import Projeto_ED.main;

public class tad_fila_array {

	main principal = new main();
	Fila filaArray = new Fila();

	public void fila_array() {
		System.out.println("\n ===== TAD-FILA-ARRAY ===== \n");
		System.out.println("     Antes!!!\n" +
		"Hora da explica��o");
		System.out.println("\n Descri��o" + "Description \n");
		
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
				System.out.print("Op��o escolhida: ");
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
					default: System.out.println("Op��o inv�lida!");
				}
			}
		}else {
			principal.estruturas();
		}
	}

	private void size() {

		System.out.println("O tamanho da sua fila � " + filaArray.size());
		
	}

	private void isEmpty() {
		if(filaArray.isEmpty() == true) {
			System.out.println("Sua pilha se encontra vazia.");
		}else {
			System.out.println("Sua pilha n�o se encontra vazia.");
		}
		
	}

	private void get() {
		System.out.println("A sua fila ficou assim");
		System.out.print(filaArray.toString() + "\n");	
	}

	private void dequeue() {
		System.out.println("\nO m�todo Remove o elemento � frente da fila. \n");
		System.out.println("Elemento removido da pilha: " + filaArray.denqueue());
		System.out.print("Resultado = " + filaArray.toString() + "\n");
	}

	public void enqueue(int elemento) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nO m�todo Insere elemento no final da fila. \n");
		System.out.print("Digite o elemento que ser� inserido: ");
		elemento = entrada.nextInt();
		filaArray.enqueue(elemento);
		System.out.print("Resultado = " + filaArray.toString() + "\n");
		
	}
}
