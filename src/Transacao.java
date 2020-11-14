import java.util.Scanner;

public class Transacao {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.titular = "Bruno";
        conta1.numeroConta = 123456;
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Digite seu saldo: ");
        //double saldo = sc.nextDouble(conta1.saldo);
        conta1.saldo=200;
        System.out.println("Titular : " + conta1.titular);
        System.out.println("Numero da conta: " + conta1.numeroConta);
        System.out.println("Saldo: " + conta1.saldo);

        //System.out.println("Quanto vocÊ quer depositar: ");
        //double depositar = sc.nextDouble(conta1.depositar());
        conta1.depositar(50);
        System.out.println("Depositei 50" );
        System.out.println("Novo saldo: " + conta1.novoSaldo);

        System.out.println("Saquei 100");
        conta1.sacar(100);
        System.out.println("Novo saldo: " + conta1.novoSaldo);
    }
}
