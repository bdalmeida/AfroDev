public class ExemploCharAt {
    public static void main(String[] args) {
        String teste = "Bruno";

        if (teste.charAt(3)=='n'){
            System.out.println("O caractere " + teste.charAt(3) + " está na posição 3");
        }
        else{
            System.out.println("Não encontrado");
        }
    }
}
