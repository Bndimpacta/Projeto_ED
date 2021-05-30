package tad_mapa;

import java.util.Scanner;

import Projeto_ED.main;

public class tad_mapa {

	HashTableMap<Integer, String> mapa = new HashTableMap<Integer, String>();
	main principal = new main();
	
	public void tadMapa() {
		System.out.println("\n ===== TAD-MAPA ===== \n");
		System.out.println("     Antes!!!\n" +
		"Hora da explica��o");
		System.out.println("\n Descri��o" + "Description \n");
		
		Scanner entrada = new Scanner(System.in);
		int chave = 0;
		String elemento = null;
		boolean back = false;		
		if(back == false) {
			while(!back) {
				System.out.println("\n Metodos");
				System.out.println("0 - Sair");
				System.out.println("1 - Inserir");
				System.out.println("2 - Retorna o elemento pela sua chave");
				System.out.println("3 - Retorna o tamanho da lista");
				System.out.println("4 - Retorna se lista est� ou n�o vazia.");
				System.out.println("5 - Remover");
				System.out.println("6 - Consultar");
				System.out.print("Op��o escolhida: ");
				int escolha = entrada.nextInt();
				switch(escolha) {
					case 0: //Sair
						back = true;
					break;
					case 1: //Inserir o elemento
						put(chave, elemento);
					break;
					case 2: //Retorna o elemento pela sua chave 
						get(chave);
					break;
					case 3: //Retorna o tamanho da lista
						size();
					break;
					case 4: //Retorna se lista est� ou n�o vazia.
						isEmpty();
					break;
					case 5: //Remover
						remove(chave);
					break;
					case 6:  //Consultar
						System.out.println("Resultado = " + mapa.entrySet());
					break;
					default: System.out.println("Op��o inv�lida!");
				}
			}
		}else {
			principal.estruturas();
		}
	}

	private void remove(int chave) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nO m�todo remove(k): remove o elemento armazenado pela sua chave (k) \n");
		System.out.print("Digite a chave correspondente ao seu elemento: ");
		chave = entrada.nextInt();
		if(mapa.get(chave) == null) {
			System.out.println("null - N�o existe nenhum elemento com essa chave");
		}else {
			System.out.println("O elemento dessa chave foi removido ");
			mapa.remove(chave);
			System.out.println("Resultado = " + mapa.entrySet());
		}
	}

	private void get(int chave) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nO m�todo get(k): retorna o elemento armazenado pela sua chave (k) \n");
		System.out.print("Digite a chave correspondente ao seu elemento: ");
		chave = entrada.nextInt();
		if(mapa.get(chave) == null) {
			System.out.println("null - N�o existe nenhum elemento com essa chave");
		}else {
			System.out.println("O elemento dessa chave � " + mapa.get(chave));
		}
	}

	private void put(int chave, String elemento) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nO m�todo put(k,v): mapa armazena um par chave-valor (k,v), chamado de entradas,\r\n"
				+ "onde k � a chave e v � o valor correspondente. \n");
		System.out.println("O TAD mapa requer que cada chave seja �nica.");
		System.out.println("Exemplo um sistema que armazena um rigistro de estudantes como nome notas e etc, \n" +
		"a chave pode ser o RA do estudante. \n");
		System.out.println("A chave deve ser numerica");
		System.out.print("Digite a chave correspondente ao seu elemento: ");
		chave = entrada.nextInt();
		System.out.print("Digite o elemento que ser� inserido: ");
		elemento = entrada.next();
		mapa.put(chave, elemento);
		System.out.println("Resultado = " + mapa.entrySet());
	}

	private void isEmpty() {
		if(mapa.isEmpty() == true) {
			System.out.println("Sua lista se encontra vazia.");
		}else {
			System.out.println("Sua lista n�o se encontra vazia.");
		}
	}

	private void size() {
		System.out.println("O tamanho da sua lista � " + mapa.size());
		
	}
}
