package atv2;

public class Passageiro extends Veiculo{
    private int qtdPassageiros;

    public Passageiro(int qtdPassageiros, String marca, String modelo, int ano, int potencia, int carga){
        super(marca, modelo, ano, potencia, carga);
        this.qtdPassageiros = qtdPassageiros;
    }

    @Override
    public void imprime() {
        System.out.println("Marca: " + marca);
        System.out.println("modelo: " + modelo);
        System.out.println("ano: " + ano);
        System.out.println("potencia: " + potencia);
        System.out.println("carga: " + carga);
        System.out.println("Quantidade de passageiros: " + qtdPassageiros);
    }
}
