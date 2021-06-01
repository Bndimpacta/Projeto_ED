package tad_grafos;
import java.util.Iterator;
import java.util.Vector;

public class Grafo {
    private int quantidadeVertices;
    private Vector vertices, matrizAdjacencia[][];

    public Grafo() {
        this.quantidadeVertices = 0;
        this.vertices = new Vector();
    }
    //remove uma aresta entre dois vertices (a primeira do vector)
    public void removerAresta(int chave1, int chave2) {
        int indice1 = encontraIndice(chave1), indice2 = encontraIndice(chave2);
        if (indice1 != -1 && indice2 != -1 && matrizAdjacencia[indice1][indice2] != null) {
            aresta objetoremovido = (aresta) matrizAdjacencia[indice1][indice2].remove(0);
            matrizAdjacencia[indice2][indice1].remove(objetoremovido);
        }
    }
    //Insere uma aresta entre dois vertices
    public void inserirAresta(int chave1, int chave2) {
        int indice1 = encontraIndice(chave1), indice2 = encontraIndice(chave2);
        if (indice1 != -1 && indice2 != -1) {
            aresta aresta = new aresta();
            if(indice1 == indice2)  
                aresta.setLoop(true); 
            else{
                if (matrizAdjacencia[indice2][indice1] == null)
                    matrizAdjacencia[indice2][indice1] = new Vector();
                matrizAdjacencia[indice2][indice1].add(aresta);
            }
            if (matrizAdjacencia[indice1][indice2] == null)
                matrizAdjacencia[indice1][indice2] = new Vector();
            matrizAdjacencia[indice1][indice2].add(aresta);
        }
    }
    //Insere um vertice ao grafo, aumentando o tamanho da matriz
    public void inserirVertice(int chave, int valor) {
        if (encontraIndice(chave) == -1) {
            vertices.add(new vertice(chave, valor));
            quantidadeVertices++;
            Vector tempMatrizAdjacencia[][] = new Vector[quantidadeVertices][quantidadeVertices];
            for (int linha = 0; linha < quantidadeVertices - 1; linha++)
                for (int coluna = 0; coluna < quantidadeVertices - 1; coluna++)
                    tempMatrizAdjacencia[linha][coluna] = matrizAdjacencia[linha][coluna];
            matrizAdjacencia = tempMatrizAdjacencia;
        }
    }
    //Remove um vertice do grafo, reduzindo a matriz de adjacencia

    public void removerVertice(int chave) {
        int indice = encontraIndice(chave);
        if (indice != -1) {
            vertices.remove(indice);
            quantidadeVertices--;
            Vector tempMatrizAdjacencia[][] = new Vector[quantidadeVertices][quantidadeVertices];
            int controleColuna, controleLinha = 0;
            for (int linha = 0; linha < quantidadeVertices + 1; linha++) {
                if (linha != indice) {//Ignora a linha do indice
                    controleColuna = 0;
                    for (int coluna = 0; coluna < quantidadeVertices + 1; coluna++) {
                        if (coluna != indice) {
                            tempMatrizAdjacencia[controleLinha][controleColuna] = matrizAdjacencia[linha][coluna];
                            if (coluna != indice)
                                controleColuna++;
                        }
                    }
                    controleLinha++;
                }
            }
            matrizAdjacencia = tempMatrizAdjacencia;
        }
    }



    //Busca o indice de uma chave no vector de vertices
    private int encontraIndice(int chave) {
        Iterator I = vertices.iterator();
        int indice = 0;
        while (I.hasNext()) {
            vertice v = (vertice) (I.next());
            if (v.getChave() == chave)
                return indice;
            indice++;
        }
        return -1;
    }
    //Exibe todos os vertices e matriz de adjacencia
    public void printGrafo() {
        System.out.println("\n\nVertices: ([chave] valor)\n");
        for (int f = 0; f < vertices.size(); f++)
            System.out.println(vertices.elementAt(f));
        System.out.println("\n\nMatriz de Adjacencia:\n");
        for (Vector[] linha : matrizAdjacencia) {
            for (Vector coluna : linha) {
                System.out.print((coluna != null) ? "| " + coluna.size() + "\t" : "| 0\t");
            }
            System.out.println("\n");
        }
    }
    //Retorna a quantidade de vertices
    public int ordem() {
        return quantidadeVertices;
    }
    //Retorna o grau de um vertices (Quantidades de arestas sobre o mesmo)
    public int grau(int chave) {
        int indice = encontraIndice(chave), grau = 0;
        if(indice != -1){
            for (int coluna = 0; coluna < quantidadeVertices; coluna++) {
                if(matrizAdjacencia[indice][coluna] != null) {
                    for (Object aresta: matrizAdjacencia[indice][coluna]){
                        aresta = (aresta) aresta;
                        if(((aresta) aresta).isLoop()) grau += 2;
                        else grau += 1;
                        //Loop conta como 2 no grau.
                    }
                }
            }
        }
        return grau;
    } 
 }


