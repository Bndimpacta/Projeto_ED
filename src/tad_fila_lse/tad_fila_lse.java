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
		"Hora da explica��o");
		System.out.println("\nA fila � uma cole��o de objetos que s�o inseridos e removidos de acordo com o princ�pio:\n" 
				+ "�o primeiro que entra � o primeiro que sai�(First-In-First-Out: FIFO).\n" 
				+"A implementa��o com LSE � eficiente, e define-se que a frente da fila seja o in�cio da lista e que o final da fila seja\n" 
				+ "o final da lista.\r\n"
				+ "Definem-se duas vari�veis f e r em que f � um �ndice de uma c�lula de Q que guarda o primeiro elemento da fila\n" 
				+ "(que � o pr�ximo candidato � remo��o no caso de uma opera��o dequeue), a n�o ser que a fila esteja vazia (e neste caso f = r).\n"
				+ "J� o r � um �ndice para a pr�xima posi��o livre em Q.\r\n"
				+ "Inicialmente, atribui-se f = r = 0, indicando que a fila est� vazia. Quando se remove um elemento da frente da fila,\n" 
				+ "incrementa-se f para indicar a pr�xima c�lula. Da mesma forma, quando se acrescenta um elemento, ele � armazenado em Q[r],\n" 
				+ "e incrementa-se r para indicar a pr�xima c�lula livre em Q. Esse esquema permite implementar os m�todos front,\n"
				+ "enqueue e dequeue sem o custo adicional de deslocamento dos elementos.\r\n"
				+ " \n");
		
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

		System.out.println("O tamanho da sua fila � " + filaLse.size());
		
	}

	private void isEmpty() {
		if(filaLse.isEmpty() == true) {
			System.out.println("Sua pilha se encontra vazia.");
		}else {
			System.out.println("Sua pilha n�o se encontra vazia.");
		}
		
	}

	private void get() {
		System.out.println("A sua fila ficou assim");
		System.out.print(filaLse.toString() + "\n");	
	}

	private void dequeue() {
		System.out.println("\nO m�todo Remove o elemento � frente da fila. \n");
		System.out.println("Elemento removido da pilha: " + filaLse.denqueue());
		System.out.print("Resultado = " + filaLse.toString() + "\n");
	}

	public void enqueue(String elemento) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nO m�todo Insere elemento no final da fila. \n");
		System.out.print("Digite o elemento que ser� inserido: ");
		elemento = entrada.next();
		filaLse.enqueue(elemento);
		System.out.print("Resultado = " + filaLse.toString() + "\n");
		
	}
}
