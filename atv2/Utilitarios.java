package atv2;

public class Utilitarios extends Veiculo{
    private String tipoDecabine;

    public Utilitarios(String tipoDecabine, String marca, String modelo, int ano, int potencia, int carga){
        super(marca, modelo, ano, potencia, carga);
        this.tipoDecabine = tipoDecabine;
    }

    @Override
    public void imprime() {
        System.out.println("Marca: " + marca);
        System.out.println("modelo: " + modelo);
        System.out.println("ano: " + ano);
        System.out.println("potencia: " + potencia);
        System.out.println("carga: " + carga);
        System.out.println("tipoDecabine: " + tipoDecabine);
    }
}
