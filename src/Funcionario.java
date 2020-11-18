public class Funcionario extends Pessoa {
    String cargo;
    double salario;

    public Funcionario(String nome,String cpf,String data_nascimento,String cargo,double salario){
        super(nome, cpf, data_nascimento);
        this.cargo = cargo;
        this.salario = salario;
    }

    public static void main(String[] args) {
        Funcionario Bruno = new Funcionario("Bruno Diego de Almeida","123.456.789-10","15/08/1991",
                "Analista",1.000);

        System.out.println(Bruno.cargo);
        System.out.println(Bruno.nome);
        System.out.println(Bruno.cpf);
        System.out.println(Bruno.data_nascimento);

    }

}
