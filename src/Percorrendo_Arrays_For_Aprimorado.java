public class Percorrendo_Arrays_For_Aprimorado {
    public static void main(String[] args) {
        int[]arrayNum = {87,68,52,5,49,83,45,12,64};
        int somaArray = 0;

        //ADICIONA O VALOR DE CADA ELEMENTO AO TOTAL

        for (int i : arrayNum)
            somaArray +=i;

        System.out.printf("Soma dos valores do arrayNum: %d\n",somaArray);

    }
}
