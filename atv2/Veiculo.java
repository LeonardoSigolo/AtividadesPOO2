package atv2;

public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected int potencia;
    protected double carga;

    public Veiculo(String marca, String modelo, int ano, int potencia, int carga){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.potencia = potencia;
        this.carga = carga;
    }

    public abstract void imprime();
}
