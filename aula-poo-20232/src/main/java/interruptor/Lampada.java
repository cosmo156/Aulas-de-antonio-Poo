package interruptor;

public class Lampada {
    public boolean ligada;
    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
        System.out.printf("Lâmpada está %s%n", ligada ? "ligada" : "desligada");
    }
}
