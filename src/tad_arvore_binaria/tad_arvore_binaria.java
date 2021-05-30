package tad_arvore_binaria;

import java.util.Scanner;

import Projeto_ED.main;

public class tad_arvore_binaria {

	main principal = new main();
	LinkedBinaryTree arvoreBinaria = new LinkedBinaryTree();
	
	public void arvore_binaria() {
		System.out.println("\n ===== TAD-�RVORE-BIN�RIA ===== \n");
		System.out.println("     Antes!!!\n" +
		"Hora da explica��o");
		System.out.println("\n Descri��o" + "Description \n");
		
		Scanner entrada = new Scanner(System.in);
		int indice = 0;
		String elemento = null;
		boolean back = false;		
		if(back == false) {
			while(!back) {
				System.out.println("\n0 - Sair");
				System.out.println("1 - Inserir");
				System.out.println("2 - Remover");
				System.out.println("3 - desenhar arvore");
				System.out.print("Op��o escolhida: ");
				int escolha = entrada.nextInt();
				switch(escolha) {
					case 0: //Sair
						back = true;
					break;
					case 1: //Inserir
						addRoot(elemento);
					break;
					case 2: //Remover
						//dequeue();
					break;
					case 3:  //pilha esta vazia
						desenhaArvore();
					break;
					default: System.out.println("Op��o inv�lida!");
				}
			}
		}else {
			principal.estruturas();
		}
	}
	
	public void desenhaArvore() {
		arvoreBinaria.desenhaArvore(arvoreBinaria, arvoreBinaria.root(), 0, 0);
	}

	public void addRoot(String elemento) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nO m�todo Insere a raiz em uma �rvore vazia. \n");
		System.out.print("Digite o elemento que ser� inserido: ");
		elemento = entrada.next();
		arvoreBinaria.addRoot(elemento);
		System.out.print(arvoreBinaria.root());
	}
	
}
