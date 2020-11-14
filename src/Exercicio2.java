import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        String nome;
        int idade;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu nome: ");
        nome = sc.nextLine();
        System.out.println("Olá " + nome + ", qual a sua idade: ");
        idade = sc.nextInt();
        System.out.println("Ah então você tem " + idade + " anos, " + nome);

        sc.close();
    }
}
