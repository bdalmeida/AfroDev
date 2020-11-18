public class Aluno extends Pessoa {

    String disciplina;
    public Aluno (String nome,String cpf, String data_nascimento,String disciplina){
        super(nome, cpf, data_nascimento);
        this.disciplina = disciplina;


    }


    public static void main(String[] args) {
        Aluno Bruno = new Aluno("Bruno Diego de Almeida","123.456.789-00",
                "15/08/1991","Matemática");

        System.out.println("Nome do Aluno: " + Bruno.nome);
        System.out.println("CPF do Aluno: " + Bruno.cpf);
        System.out.println("Data de nascimento do Aluno: " + Bruno.data_nascimento);
        System.out.println("Disciplina: " + Bruno.disciplina);
    }
}
