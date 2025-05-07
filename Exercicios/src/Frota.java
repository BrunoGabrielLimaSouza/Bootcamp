import java.util.ArrayList;
import java.util.List;

public class Frota {
    private List<Veiculo> veiculos;
    private List<Motorista> motoristas;

    public Frota() {
        this.veiculos = new ArrayList<>();
        this.motoristas = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        this.veiculos.add(veiculo);
    }

    public void removerVeiculo(Veiculo veiculo) {
        this.veiculos.remove(veiculo);
    }

    public void adicionarMotorista(Motorista motorista) {
        this.motoristas.add(motorista);
    }

    public void removerMotorista(Motorista motorista) {
        this.motoristas.remove(motorista);
    }

    public void listarVeiculos() {
        if (this.veiculos.isEmpty()) {
            System.out.println("A frota não possui veículos cadastrados.");
        } else {
            System.out.println("--- Listagem de Veículos da Frota ---");
            for (Veiculo veiculo : this.veiculos) {
                veiculo.exibirInfo();
            }
            System.out.println("--- Fim da Listagem ---");
        }
    }
    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public List<Motorista> getMotoristas() {
        return motoristas;
    }


}