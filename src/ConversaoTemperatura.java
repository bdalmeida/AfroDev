import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        double c;
        double f;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        c = sc.nextDouble();

        f=(9*c+160)/5;

        System.out.println("A conversão para Fahrenheit é : " + f);
    }
}
