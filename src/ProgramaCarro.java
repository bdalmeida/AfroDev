import java.util.Scanner;

public class ProgramaCarro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Carro celta = new Carro();

        celta.ligar();
        celta.velocidadeAtual =10.0;
        System.out.println("Você esta na Marcha: " + celta.pegaMarcha());
        celta.mostraVelocidade();

        System.out.println("Quanto você quer acelerar?");
        double qtdeAceleracao = sc.nextDouble();
        celta.acelera(qtdeAceleracao);
        celta.mostraVelocidade();
        System.out.println("Você esta na Marcha: " + celta.pegaMarcha());



    }
}
