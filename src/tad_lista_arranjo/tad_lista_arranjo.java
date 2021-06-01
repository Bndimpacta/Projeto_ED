package tad_lista_arranjo;

import java.util.Scanner;

import Projeto_ED.main;

public class tad_lista_arranjo {

	main principal = new main();
	ArrayIndexList arranjo = new ArrayIndexList();
	
	public void lista_arranjo() {
		System.out.println("\n ===== TAD-LISTA-ARRANJO ===== \n");
		System.out.println("     Antes!!!\n" +
		"Hora da explicação");
		System.out.println("\n Uma lista arranjo (ou vetor) é uma coleção S de N elementos armazenados em uma certa ordem linear,\n" 
		+ "de maneira que é possível se referir aos elementos de S como 1º, 2º, 3º e assim por diante.\n"
		+ "Usamos o intervalo [0, n - 1] para acessar cada elemento x de S, então o primeiro elemento de S tem índice 0,\n" 
		+ "e o último tem índice n - 1. \n");
		
		Scanner entrada = new Scanner(System.in);
		int indice = 0;
		int numero = 0;
		boolean back = false;		
		if(back == false) {
			while(!back) {
				System.out.println("\n0 - Sair");
				System.out.println("1 - Inserir");
				System.out.println("2 - Remover");
				System.out.println("3 - Consultar");
				System.out.print("Opção escolhida: ");
				int escolha = entrada.nextInt();
				switch(escolha) {
					case 0: //Sair
						back = true;
					break;
					case 1: //Inserir
						add(indice, numero);
					break;
					case 2: //Remover
						remove(indice);
					break;
					case 3: //Consultar
						get();
					break;
					default: System.out.println("Opção inválida!");
				}
			}
		}else {
			principal.estruturas();
		}
	}
	
	public void get() {
		System.out.println("A sua lista ficou assim");
		System.out.print(arranjo.toString() + "\n");
	}

	public void remove(int indice) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nO método remove e retorna o elemento do índice i, deslocando os elementos depois 		dele");
		System.out.print("Digite a posição do numero que será removido: ");
		indice = entrada.nextInt();
		arranjo.remove(indice);
		System.out.print("Resultado = " + arranjo.toString() + "\n");
	}

	public void add(int indice, int numero) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\n***Lembrete***");
		System.out.println("Na primeira incerção da lista a posição deve começar com 0 \n");
		System.out.println("\nO método add(e): insere o registro e na coleção de maiores escores.");
		System.out.print("Digite o numero que será inserido: ");
		numero = entrada.nextInt();
		System.out.print("Agora digite a posição que será inserido: ");
		indice = entrada.nextInt();
		arranjo.add(indice, numero);
		System.out.print("Resultado = " + arranjo.toString() + "\n");
	}
}
