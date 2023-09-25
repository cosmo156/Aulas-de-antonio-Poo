package interruptor;

import interruptor.Interruptor;
import interruptor.Lampada;

public class Main {
    public static void main(String[] args) {
        Lampada l1 = new Lampada();
        Interruptor interruptor = new Interruptor(l1);

        interruptor.toggle();
        interruptor.toggle();
    }
}
