package tad_grafos;
import java.util.Scanner;

public class tad_grafos {

    public void grafos() {
    	System.out.println("\n ===== TAD-GRAFO ===== \n");
		System.out.println("     Antes!!!\n" +
		"Hora da explicação");
		System.out.println(
				 "O Grafo s�o uma estrutura de dados que representa um\r\n"
				+ "conjunto de elementos (pontos) chamados n�s\r\n"
				+ "ou vertices, os quais são unidos (ou conectados)\r\n"
				+ "por outros elementos (linhas) chamados arestas\r\n"
				+ "ou arcos.\r\n"
				+ "\r\n"
				+ "Os n�s do conjunto podem representar\r\n"
				+ "os pontos de cruzamento entre ruas, estradas,\r\n"
				+ "estações de metrô, pontos telefônicos ou de\r\n"
				+ "computadores em uma rede, e as arestas\r\n"
				+ "correspondem às ruas ou estradas propriamente\r\n"
				+ "ditas, trilhos, cabeamento de rede, e assim por\r\n"
				+ "diante.\r\n"
				+ "\r\n"
				+ "Um grafo é um tipo de dados abstrato não  linear\r\n"
				+ "\r\n"
				+ "Grafo é não linear, mas não é hierárquica.\r\n");
		
    	
        Grafo graf = new Grafo();
        int valorInicial;
        int valorFinal;
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU\n"
        + "0 - Sair; \n"
        + "1 - Adicionar Vertice;\n"
        + "2 - Adicionar Aresta;\n"
        + "3 - Remover Vertice;\n"
        + "4 - Remover Aresta;\n"
        + "5 - Printar Grafo;\n"
        + "6 - Printar Grau de um Vertice;\n");
        
        System.out.print("Escolha uma Opção:\n");
        int opt = sc.nextInt();
        while(opt != 0){
            switch(opt){
                case 1://Adicionar Vertice
                    System.out.println("Escolha um valor inicial:");
                    valorInicial = sc.nextInt();
                    graf.inserirVertice(valorInicial, 0);
                    System.out.println("Escolha uma nova Opção:");
                    opt = sc.nextInt();
                    break;
                case 2://Adicionar Aresta
                    System.out.println("Escolha um valor inicial e final para adicionar:");
                    valorInicial = sc.nextInt();
                    valorFinal = sc.nextInt();
                    graf.inserirAresta(valorInicial, valorFinal);
                    System.out.println("Escolha uma nova Opção:");
                    opt = sc.nextInt();
                    break;
                case 3://Remover Vertice
                    System.out.println("Insira a chave do vertice a ser removido:");
                    valorInicial = sc.nextInt();
                    graf.removerVertice(valorInicial);
                    System.out.println("Escolha uma nova Opção:");
                    opt = sc.nextInt();
                    break;
                    
                case 4://Remover Aresta
                    System.out.println("Insira o valor inicial e final da aresta a ser removida:");
                    valorInicial = sc.nextInt();
                    valorFinal = sc.nextInt();
                    graf.removerAresta(valorInicial, valorFinal);
                    System.out.println("Escolha uma nova Opção:");
                    opt = sc.nextInt();
                    break;
                case 5:
                    graf.printGrafo();
                     System.out.println("Escolha uma nova Opção:");
                     opt = sc.nextInt();
                     break;
                case 6:
                    System.out.println("Insira a chave do vertice:");
                    valorInicial = sc.nextInt();
                    System.out.println("\n\n Grau: " + graf.grau(valorInicial));
                    System.out.println("Escolha uma nova Opção:");
                    opt = sc.nextInt();
                    break;

                default:
                    System.out.println("Opção InvÃ¡lida");
                    System.out.println("Escolha uma nova Opção:");
                    opt = sc.nextInt();
                    break;
            }
        }

    }

}

