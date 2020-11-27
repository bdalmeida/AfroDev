import java.util.Scanner;

public class GerarCitacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o segundo nome: ");
        String segundoNome = sc.nextLine();

        System.out.println("Digite o terceiro nome: ");
        String terceiroNome = sc.nextLine();

        nome = nome.toUpperCase();
        segundoNome = segundoNome.toUpperCase();
        terceiroNome = terceiroNome.toUpperCase();


        System.out.println(terceiroNome.toUpperCase() +", " + segundoNome.charAt(0)+"." + nome.charAt(0) + ".");



    }
}
