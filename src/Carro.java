public class Carro {

    String ligar;
    String cor;
    String modelo;
    double velocidadeAtual;
    double velocidadeMaxima;
    double novaVelocidade;
    int marcha;


    public void ligar(){
        System.out.println("O carro foi ligado!");
    }

    public void acelera(double qtde){
        double novaVelocidade = velocidadeAtual + qtde;
        velocidadeAtual = novaVelocidade;
    }

    public int pegaMarcha(){
        if (velocidadeAtual<=0) {
            return -1;
        }
        else if (velocidadeAtual>0 && velocidadeAtual<40) {
            return 1;
        }
        else if(velocidadeAtual>=40 && velocidadeAtual<80) {
            return 2;
        }
        else{
            return 3;
        }
    }
    public String mostraVelocidade(){
        System.out.println("Sua velocidade é: " + velocidadeAtual);
        return null;
    }

}



