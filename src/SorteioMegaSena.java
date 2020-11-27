import java.util.Random;

public class SorteioMegaSena {
    public static void main(String[] args) {
        int numAleatorio[]=new int[6];
        Random gerar = new Random();

        int cont=0;
        int numMegaSena [] = new int [6];
        int dezena=0;

        while(cont<6){
            dezena = gerar.nextInt(60) +1;
            if (numNoArray(numMegaSena, dezena)==false){
                numMegaSena[cont]= dezena;
                cont++;
            }
        }
    }

    public static boolean numNoArray(int[] array,int numero) {
        for (int valor : array){
            if(valor==numero){
                return true;
            }
        }
        return false;

    }
}
