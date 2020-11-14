import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, digite seu peso: ");
        float peso = sc.nextFloat();
        System.out.println("Olá, digite sua Altura: ");
        float altura = sc.nextFloat();

        //System.out.println(peso);
        //System.out.println(altura);
        float imc = peso/(altura*altura);

        System.out.printf("IMC: " + "%.2f",imc);
        System.out.println("");
        if(imc<18.5){
            System.out.println("Adulto com baixo peso.");
        }
        if(imc>=18.5 && imc<25){
            System.out.println("Adulto com peso adequado.");
        }
        if(imc>=25 && imc<30){
            System.out.println("Adulto com sobrepeso");
        }
        if(imc>30){
            System.out.println("Adulto com obesidade.");
        }

    }
}
