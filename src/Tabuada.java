import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n1 = sc.nextInt();

        if(n1<=0){
            System.out.println("Número inválido, digite um número inteiro maior que zero");
        }
        else {
            for (int i = 0; i < 11; i++) {
                System.out.println( n1+"*"+i+ " = " + (n1 * i));
            }
        }
    }
}
