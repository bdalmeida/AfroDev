import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;

public class GerarJogosSena {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quanto jogos quer fazer? ");
        int NroApostas = sc.nextInt();

        System.out.println("Quanto numeros: ");
        int dezenas = sc.nextInt();

        for (int i = 0; i < NroApostas; i++) {
            System.out.println(JogosSena(dezenas));        }


    }

    //GERA JOGOS
    public static LinkedHashSet<Integer> JogosSena(int NroApostas) {
        Random rd = new Random();
        LinkedHashSet<Integer> JogosSena = new LinkedHashSet<Integer>();
        int dezenas = 0;
        while (JogosSena.size() != NroApostas) {
            dezenas = rd.nextInt(60) + 1;
            JogosSena.add(dezenas);
        }
        return JogosSena;
    }
}