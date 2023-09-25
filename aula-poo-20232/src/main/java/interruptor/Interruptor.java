package interruptor;

public class Interruptor {
    private Lampada lampada;

    public Interruptor(Lampada lampada) {
        this.lampada = lampada;
    }

    public void ligar() {
        this.lampada.setLigada(true);
    }

    public void desligar() {
        this.lampada.setLigada(false);
    }

    public void toggle() {
        if (this.lampada.isLigada()) {
            desligar();
        } else {
            ligar();
        }
    }
}
