package jogo;

public class Item {
    private String nome;
    private int poder;
    private int consumoMana;
    public Item(String nome, int poder, int consumoMana){
        this.nome=nome;
        this.poder=poder;
        this.consumoMana=consumoMana;
    }
    public Item(String nome, int poder){
        this.nome=nome;
        this.poder=poder;
        this.consumoMana=0;

    }

    public String getNome() {
        return this.nome;
    }

    public int getPoder() {
        return this.poder;
    }

    public int getConsumoMana() {
        return this.consumoMana;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
    public void setConsumoMana(int consumoMana){
        this.consumoMana=consumoMana;
    }
}
