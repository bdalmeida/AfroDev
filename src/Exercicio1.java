public class Exercicio1 {
    public static void main(String[] args) {
        String nome = "Nome: Bruno";
        String endereco = "Endereço: Rua Comprida";
        int idade = 29;
        char estadoCivil = 'C';
        float salario = 1.000f;

        System.out.println(nome  + "\n" + endereco + "\n" + "Idade: " +idade + "\n" + "Estado Civil: "
                + estadoCivil );
        System.out.printf("Salário: R$ " + "%.3f", salario);

    }
}
