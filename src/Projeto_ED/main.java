package Projeto_ED;

import java.util.Scanner;

import tad_arvore_binaria.tad_arvore_binaria;
import tad_fila_array.tad_fila_array;
import tad_fila_lse.tad_fila_lse;
import tad_lista_arranjo.tad_lista_arranjo;
import tad_lista_de_nodos.tad_lista_de_nodos;
import tad_pilha_array.tad_pilha_array;
import tad_pilha_lse.tad_pilha_lse;

public class main {

	public static void main(String[] args) {
		System.out.println("===== Bem Vindo ===== \n");
		estruturas();
	}
		
	public static void estruturas() {
		tad_lista_arranjo arranjo = new tad_lista_arranjo();
		tad_pilha_array pilhaArray = new tad_pilha_array();
		tad_pilha_lse pilhaLse = new tad_pilha_lse();
		tad_fila_array filaArray = new tad_fila_array();
		tad_fila_lse filaLse = new tad_fila_lse();
		tad_lista_de_nodos listaNodos = new tad_lista_de_nodos(); 
		tad_arvore_binaria arvoreBinaria = new tad_arvore_binaria(); 
		
		Scanner entrada = new Scanner(System.in);
		boolean sair = false;
		while(!sair){
			System.out.println("Escolha uma opção: ");
			System.out.println("0 - Sair");
			System.out.println("1 - TAD-Lista Arranjo");
			System.out.println("2 - TAD-Pilha-Array");
			System.out.println("3 - TAD-Pilha-LSE");
			System.out.println("4 - TAD-Fila-Array");
			System.out.println("5 - TAD-Fila-LSE");
			System.out.println("6 - TAD-Lista de Nodos");
			System.out.println("7 - TAD-Árvore Genérica");
			System.out.println("8 - TAD-Árvore Binária");
			System.out.println("9 - TAD-Fila de Prioridade");
			System.out.println("10 - TAD-Mapa");
			System.out.println("11 - TAD-Dicionário");
			System.out.println("12 - TAD-Mapa Ordenado - ABB");
			System.out.println("13 - TAD-Mapa Ordenado - AVL");
			System.out.println("14 - TAD-Grafos \n");
			System.out.print("Opção escolhida: ");
			int escolha = entrada.nextInt();
			switch(escolha) {
				case 0: //Sair
					sair = true;
					break;
				case 1: //TAD-Lista Arranjo
					arranjo.lista_arranjo();
					break;
				case 2: //TAD-Pilha-Array
					pilhaArray.pilha_array();
					break;
				case 3: //TAD-Pilha-LSE
					pilhaLse.pilha_lse();
					break;
				case 4: //TAD-Fila-Array
					filaArray.fila_array();
					break;
				case 5: //TAD-Fila-LSE
					filaLse.fila_lse();
					break;
				case 6: //TAD-Lista de Nodos
					listaNodos.lista_de_nodos();
					break;
				case 7: 
					//TAD-Árvore Genérica
					break;
				case 8: //TAD-Árvore Binária//Apresenta Erro
					arvoreBinaria.arvore_binaria();
					break;
				case 9: 
					//TAD-Fila de Prioridade
					break;
				case 10: 
					//TAD-Mapa
					break;
				case 11: 
					//TAD-Dicionário
					break;
				case 12: 
					//TAD-Mapa Ordenado - ABB
					break;
				case 13: 
					//TAD-Mapa Ordenado - AVL
					break;
				case 14: 
					//TAD-Grafos
					break;
				default: System.out.println("Opção inválida!");
			}
			System.out.println();
		}
		System.out.println("=== Programa Encerrado ===");
	}
}
