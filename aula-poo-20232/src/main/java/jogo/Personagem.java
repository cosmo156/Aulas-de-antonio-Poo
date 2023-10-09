package jogo;

public class Personagem {
    private String nome;
    private int vida;
    private int mana;
    private Arma arma;

    public Personagem(String nome) {
        this.nome = nome;
        this.vida = 100;
        this.mana = 100;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public void receberDano(int dano) {
        this.vida -= dano;
        System.out.printf("%s recebeu dano de %d (Vida: %d)%n",
                this.getNome(), dano, this.getVida());
    }

    public void atacar(Personagem outro) {
        if (arma == null) {
            System.out.printf("%s atacou %s com a mão%n",
                    this.getNome(), outro.getNome());
            outro.receberDano(1);
            return;
        }
        this.setMana(this.getMana() - arma.getConsumoMana());
        System.out.printf("%s atacou %s com %s gastou %d de mana (Mana: %d).%n",
                this.getNome(), outro.getNome(), arma.getNome(), arma.getConsumoMana(),this.getMana());
        outro.receberDano(arma.getPoder()+arma.getConsumoMana());
    }

    public void recuperarVida(Pocao pocao) {
        this.setVida(this.getVida() + (pocao.getPoder()+pocao.getConsumoMana()));
        this.setMana(this.getMana() - pocao.getConsumoMana());
        System.out.printf("%s tomou %s, recuperou %d pontos de vida e gastou %d do mana (Vida: %d), (Mana: %d).%n",
                this.getNome(), pocao.getNome(), (pocao.getPoder()+ pocao.getConsumoMana()), pocao.getConsumoMana(),this.getVida(), this.getMana());
    }
    public void reiniciarVida(){
        this.setVida(100);
        this.setMana(100);
    }
}
