package tad_grafos;
public class vertice {
    int chave,valor;
    public vertice(int chave, int valor){
        this.chave = chave;
        this.valor = valor;
    }
    @Override
    public String toString() {
        return "[ "+chave+" ] "+ valor;
    }
    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
