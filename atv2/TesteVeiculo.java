package atv2;

public class TesteVeiculo {
    static void main(String[] args){
        Veiculo[] frota = new Veiculo[4];

        frota[0] = new Utilitarios("Tipo 1", "Chev", "Chevette", 1994, 86, 600);
        frota[1] = new Utilitarios("Tipo 2", "Ford", "Focus", 2008, 120, 800);
        frota[2] = new Passageiro(3, "BYD", "Dolphin", 2025, 100, 750);
        frota[3] = new Passageiro(5, "Hyundai", "Azera", 2026, 90, 900);

        for(Veiculo veiculo : frota){
            veiculo.imprime();
        }
    }
}
