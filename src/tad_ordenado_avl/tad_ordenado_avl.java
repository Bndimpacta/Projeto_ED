package tad_ordenado_avl;

import java.util.Scanner;

import Projeto_ED.main;

public class tad_ordenado_avl {

	AVLTreeMap<Integer, Integer> avl = new AVLTreeMap<Integer, Integer>();
main principal = new main();
	
	public void tadMapaOrdenadoAvl() {
		System.out.println("\n ===== TAD-MAPA-ORDENADO-ABB ===== \n");
		System.out.println("     Antes!!!\n" +
		"Hora da explica??o");
		System.out.println("\n O desempenho do TAD Mapa Ordenado ? ?rvore Bin?ria de Busca, ?\r\n"
				+ "melhor do que o TAD Mapa.\r\n"
				+ "\r\n"
				+ "Por?m, dependendo da ordem em que as chaves s?o inseridas, o seu\r\n"
				+ "desempenho ser? muito similar ao TAD Mapa.\r\n"
				+ "\r\n"
				+ "Por exemplo, inserir as chaves 10, 20, 30 e 40 nessa sequ?ncia no TAD Mapa\r\n"
				+ "Ordenado ? ?rvore Bin?ria de Busca, resultar? na seguinte configura??o:\r\n"
				+ "\r\n"
				+ "Para evitar esse problema, foi criada a ?rvore\r\n"
				+ "AVL.\r\n"
				+ "\r\n"
				+ "Defini??o de uma ?rvore AVL\r\n"
				+ "\r\n"
				+ "A corre??o se resume em acrescentar uma regra (propriedade) ?\r\n"
				+ "defini??o de ?rvore bin?ria de pesquisa que ir? manter uma altura\r\n"
				+ "?balanceada?.\r\n"
				+ "\r\n"
				+ "Propriedade da altura/balanceamento: para cada nodo interno v de\r\n"
				+ "uma ?rvore bin?ria de busca, T, as alturas dos filhos de v podem\r\n"
				+ "variar em no m?ximo 1.\r\n"
				+ "\r\n"
				+ "Qualquer ?rvore bin?ria de busca T que satisfa?a essa propriedade ?\r\n"
				+ "chamada de ?rvore AVL, conceito que tem o nome tirado das iniciais\r\n"
				+ "de seus autores: Adel'son -Vel'skii e Landis. \n");
		
		Scanner entrada = new Scanner(System.in);
		int chave = 0;
		int elemento = 0;
		boolean back = false;		
		if(back == false) {
			while(!back) {
				System.out.println("\n Metodos");
				System.out.println("0 - Sair");
				System.out.println("1 - Inserir");
				System.out.println("2 - Retorna o elemento pela sua chave");
				System.out.println("3 - Remover");
				System.out.println("4 - Consultar");
				System.out.print("Op??o escolhida: ");
				int escolha = entrada.nextInt();
				switch(escolha) {
					case 0: //Sair
						back = true;
					break;
					case 1: //Inserir o elemento
						put(elemento);
					break;
					case 2: //Retorna o elemento pela sua chave 
						get(chave);
					break;
					case 3: //Remover
						remove(chave);
					break;
					case 4:  //Consultar
						System.out.println("Resultado = " + avl.keySet().toString());
					break;
					default: System.out.println("Op??o inv?lida!");
				}
			}
		}else {
			principal.estruturas();
		}
	}

	private void remove(int chave) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nO m?todo removeExternal(v): remove um nodo externo v e seu pai,\r\n"
				+ "substituindo o pai de v pelo irm?o de v; um\r\n"
				+ "erro ocorre se v n?o for um nodo externo.\n");
		System.out.print("Digite a chave correspondente ao seu elemento: ");
		chave = entrada.nextInt();
		if(avl.get(chave) == null) {
			System.out.println("null - N?o existe nenhum elemento com essa chave");
		}else {
			System.out.println("O elemento dessa chave foi removido ");
			avl.remove(chave);
			System.out.println("Resultado = " + avl.keySet().toString());
		}
	}

	private void get(int chave) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nO m?todo get(k) em um mapa D que ? representado\r\n"
				+ "por uma ?rvore bin?ria de pesquisa T, enxerga-se a ?rvore T como\r\n"
				+ "uma ?rvore de decis?o.\n");
		System.out.print("Digite a chave correspondente ao seu elemento: ");
		chave = entrada.nextInt();
		System.out.println("O elemento dessa chave ? " + avl.get(chave));
		if(avl.get(chave) == null) {
			System.out.println("null - N?o existe nenhum elemento com essa chave");
		}else {
			System.out.println("O elemento dessa chave ? " + avl.get(chave));
		}
	}

	private void put(int elemento) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\n O metodo insertAtExternal(v, e): insere o elemento e no nodo externo v, expande v para ser interno colocando\r\n"
				+ "dois novos filhos (vazios) externos; um erro ocorre se v ? um nodo interno.");
		System.out.print("Digite o elemento que ser? inserido: ");
		elemento = entrada.nextInt();
		avl.put(elemento, elemento);
		System.out.println("Resultado = " +  avl.keySet().toString());
	}
}
