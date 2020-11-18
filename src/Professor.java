public class Professor extends Pessoa {

    String matricula;
    Professor(String nome,String cpf,String data_nascimento,String matricula){
        super(nome, cpf, data_nascimento);
        this.matricula = matricula;
    }

}
