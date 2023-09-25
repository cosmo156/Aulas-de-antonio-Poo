package conta;


public class ContaBancaria {

    protected double saldo;
    public ContaBancaria() {
        this.saldo = 0;
    }

    private void validaValorNegativo(double valor) throws Exception {
        if (valor < 0)
            throw new Exception("Valor não pode ser negativo");
    }

    public void depositar(double valor) throws Exception {
        validaValorNegativo(valor);
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public double getSaldo() {
        return this.saldo;
    }
}
