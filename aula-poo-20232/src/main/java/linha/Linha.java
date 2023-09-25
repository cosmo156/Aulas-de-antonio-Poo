package linha;

public class Linha {
    private Ponto inicio;
    private Ponto fim;

    public Linha(Ponto inicio, Ponto fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public Ponto getInicio() {
        return inicio;
    }

    public void setInicio(Ponto inicio) {
        this.inicio = inicio;
    }

    public Ponto getFim() {
        return fim;
    }

    public void setFim(Ponto fim) {
        this.fim = fim;
    }

    public double getComprimento() {
        return Math.sqrt(
                Math.pow(this.getFim().getX() - this.getInicio().getX(), 2)
                +
                Math.pow(this.getFim().getY() - this.getInicio().getY(), 2)
        );
    }
}
