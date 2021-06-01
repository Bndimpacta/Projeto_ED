package tad_grafos;

public class aresta {

    boolean loop;
    public aresta(){
        loop = false;
    }

    public boolean isLoop() {
        return loop;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
