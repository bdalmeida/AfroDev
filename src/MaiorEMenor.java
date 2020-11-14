import java.util.Scanner;

public class MaiorEMenor {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o primeiro número: ");
    int n1 = sc.nextInt();
    System.out.println("Digite o segundo número: ");
    int n2 = sc.nextInt();
    System.out.println("Digite o terceiro número: ");
    int n3 = sc.nextInt();

    //VERIFICANDO O MENOR

    if  (n1<n2 && n1<n3) {
       System.out.println("O menor numero é o primeito : " + n1);
    }
    else if (n2<n1 && n2<n3){
       System.out.println("O menor número é o segundo: " + n2);
    }
    else  {
        System.out.println("O terceiro número é o menor : " + n3);
    }

    //VERIFICANDO O MAIOR

    if (n1>n2 && n1>n3){
        System.out.println("O primeiro número é o maior " + n1);
    }
    else if (n2>n3 && n2>n1){
        System.out.println("O segundo número é o maior " + n2);
    }
    else {
        System.out.println("O terceiro número é o maior " + n3);
    }

}
}