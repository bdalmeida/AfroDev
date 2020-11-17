import java.util.Scanner;

public class MaiorEMenorUsandoFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        final int NUMERO_A_LER = 3;

        int minimo = Integer.MAX_VALUE;
        int maximo = Integer.MAX_VALUE;
        int num = sc.nextInt();
        for (int i=0; i<NUMERO_A_LER; i++){
            System.out.println("Digite um número: ");

            if (num<minimo){
                minimo = num;
            }
            if (num>maximo){
                maximo = num;
            }

            System.out.println("O menor numero é: " + minimo);
            System.out.println("O maior numero é: " + maximo);
        }
    }

}
