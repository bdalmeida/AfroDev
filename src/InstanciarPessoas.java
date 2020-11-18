public class InstanciarPessoas {
    public static void main(String[] args) {

        Aluno Bruno = new Aluno("Bruno Diego de Almeida","123.456.789-00",
                "15/08/1991","Matemática");
        System.out.println("Nome do Aluno: " + Bruno.nome);
        System.out.println("CPF do Aluno: " + Bruno.cpf);
        System.out.println("Data de nascimento do Aluno: " + Bruno.data_nascimento);
        System.out.println("Disciplina: " + Bruno.disciplina);

        System.out.println("-------------------------------------------------------");

        Funcionario Joao = new Funcionario("Joao da Silva ","123.456.789-10","15/08/1991",
                "Analista",1.000);
        System.out.println("Nome do funcionário: " + Joao.nome);
        System.out.println("CPF do funcionário: " + Joao.cpf);
        System.out.println("Data de nascimento do funcionário: " + Joao.data_nascimento);
        System.out.println("Cargo do funcionário: " + Joao.cargo);
        System.out.printf("Salario do funcionário: R$ %.3f\n" , Joao.salario);

        System.out.println("-------------------------------------------------------");

        Professor Pedro = new Professor("Pedro Antonio","123.123.321-45","10/10/2010",
                "0001");
        System.out.println("Nome do Professor: " + Pedro.nome);
        System.out.println("CPF do Professor: " + Pedro.cpf);
        System.out.println("Data de nascimento do Professor: " + Pedro.data_nascimento);
        System.out.println("Matricula do Professor: " + Pedro.matricula);

    }
}
