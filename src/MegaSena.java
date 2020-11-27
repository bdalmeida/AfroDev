import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MegaSena {
    public static void main(String[] args) {

        int dezenas = 6;
        int dezenaSorteio=0;
        int [] aposta = new int [dezenas];
        int [] sorteados = new int [60];

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as seis dezenas: ");

        for (int i=0; i<dezenas; i++){
                aposta [i] = sc.nextInt();
        }

        System.out.print("\nNumeros apostados : ");
        for (int i = 0; i < aposta.length; i++) {

            System.out.print(aposta[i] + " ");
        }

        System.out.print("\nNumeros sorteados: ");
        Random r = new Random(60);
        for (int i=0; i<dezenas; i++){
            //int valor;
            sorteados [i] = (int) r.nextInt(60);

            System.out.print(sorteados[i] + " ");
        }



        for (int i=0; i<dezenaSorteio; i++){
           // System.out.println("posicao " + (i+1) + "=" + sorteados[i]);
            System.out.println(dezenaSorteio);
        }

//        System.out.println("\nResultado do sorteio: ");
//        for (int i = 0; i < sorteados.length; i++) {
//            System.out.print(sorteados[i] + " ");
//        }

        if (sorteados.equals(aposta)){
            System.out.println("\nganhou");
        }
        else {
            System.out.println("\nnão ganhou");
        }

//        if (Arrays.equals(sorteados[],aposta[])){
//            System.out.println("teste");
//        }else{
//            System.out.println("Caiu no else");
//        }





    }
}
