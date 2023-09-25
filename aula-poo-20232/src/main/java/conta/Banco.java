package conta;

public class Banco {
    public ContaBancaria conta1;
    public ContaBancaria conta2;

    public Banco(ContaBancaria conta1, ContaBancaria conta2) {
        this.conta1 = conta1;
        this.conta2 = conta2;
    }

    private ContaBancaria getConta(int numeroConta) throws Exception {
        if (numeroConta == 1) {
            return this.conta1;
        } else if (numeroConta == 2) {
            return this.conta2;
        } else {
            throw new Exception("Conta não existe.");
        }
    }

    public void depositar(int numeroConta, double valor) throws Exception {
        ContaBancaria conta = getConta(numeroConta);

        conta.depositar(valor);
    }

    public void saque(int numeroConta, double valor) throws Exception {
        ContaBancaria conta = getConta(numeroConta);

        conta.sacar(valor);
    }

    public void transferencia(int nroContaOrigem, int nroContaDestino, double valor) throws Exception {
        var origem = getConta(nroContaOrigem);
        var destino = getConta(nroContaDestino);

        origem.sacar(valor);
        destino.depositar(valor);
    }
}
// http://10.12.128.248:8080