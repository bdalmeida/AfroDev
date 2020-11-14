import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        System.out.println("Escolha uma liguagem: Java ou C");
        String linguagem = sc.nextLine();

        switch (linguagem){
            case "Java":
            System.out.println("Melhor escolha! Esta liguagem é Orientada a Objetos");
            break;

            case "C":
            System.out.println("Esta liguagem é estruturada.");
            break;

            default:
                System.out.println("Liguagem desconhecida.");
        }
    }
}
