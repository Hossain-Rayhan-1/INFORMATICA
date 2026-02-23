public class App {

    private String nome;
    private int dimensioneMB;
    private int consumoBatteria;

    public App(String nome, int dimensioneMB, int consumoBatteria) {
        this.nome = nome;
        this.dimensioneMB = dimensioneMB;
        this.consumoBatteria = consumoBatteria;
    }

    public String getNome() {
        return nome;
    }

    public int getDimensioneMB() {
        return dimensioneMB;
    }

    public int getConsumoBatteria() {
        return consumoBatteria;
    }
}
