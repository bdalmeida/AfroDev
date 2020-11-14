public class Conta {
    String titular;
    int numeroConta;
    double saldo;
    double novoSaldo;

    void sacar(double qtde){
        novoSaldo = saldo - qtde;
    }

    double depositar(double qtde){
        novoSaldo = this.saldo + qtde;
        this.saldo = novoSaldo;
        return novoSaldo;
    }
}

