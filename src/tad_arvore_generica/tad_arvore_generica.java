package tad_arvore_generica;

import java.util.Scanner;

import Projeto_ED.main;

public class tad_arvore_generica {

	LinkedTree<String> T = new LinkedTree<String>();
	main principal = new main();
	
	public void arvore_binaria() {
		System.out.println("\n ===== TAD-�RVORE-GENERICA ===== \n");
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
						//addRoot(elemento);
					break;
					case 2: //Remover
						//remover();
					break;
					default: System.out.println("Op��o inv�lida!");
				}
			}
		}else {
			principal.estruturas();
		}
	}
}
