import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int numeroTelefone;
        int cont = 1;


        Scanner scInt = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numeroTelefone = scInt.nextInt();

        while (cont<=5) {
            System.out.println(numeroTelefone);
            cont++;
        }

        int cont2=1;
        String frase;
        Scanner scStr = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        frase = scStr.nextLine();
            while (cont2<=5) {
                System.out.println(frase);
                cont2++;
            }
    }
}
