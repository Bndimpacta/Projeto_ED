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
		System.out.println("\nA fila é uma coleção de objetos que são inseridos e removidos de acordo com o princípio:\n" 
				+ "“o primeiro que entra é o primeiro que sai”(First-In-First-Out: FIFO).\n" 
				+"A implementação com LSE é eficiente, e define-se que a frente da fila seja o início da lista e que o final da fila seja\n" 
				+ "o final da lista.\r\n"
				+ "Definem-se duas variáveis f e r em que f é um índice de uma célula de Q que guarda o primeiro elemento da fila\n" 
				+ "(que é o próximo candidato à remoção no caso de uma operação dequeue), a não ser que a fila esteja vazia (e neste caso f = r).\n"
				+ "Já o r é um índice para a próxima posição livre em Q.\r\n"
				+ "Inicialmente, atribui-se f = r = 0, indicando que a fila está vazia. Quando se remove um elemento da frente da fila,\n" 
				+ "incrementa-se f para indicar a próxima célula. Da mesma forma, quando se acrescenta um elemento, ele é armazenado em Q[r],\n" 
				+ "e incrementa-se r para indicar a próxima célula livre em Q. Esse esquema permite implementar os métodos front,\n"
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
