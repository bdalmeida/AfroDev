public class Moto implements Motor,Veiculo {

    @Override
    public String getNome(){
        return "Retorna o nome da Classe (Interface) - Veiculo";
    }

    @Override
    public String getId() {
        return "Retorna o Id da Classe (Interface) - Veiculo";
    }

    @Override
    public String getModelo(){
        return "Retorna o modelo da Classe (Interface) - Motor";
    }

    @Override
    public String getFabricante() {
        return "Retorna o fabricante da Classe (Interface) - Motor";
    }
}

