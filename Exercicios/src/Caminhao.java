public class Caminhao extends Veiculo{
    private float capacidade_carga;



    @Override
    public void exibir_info(){
    super.exibirInfo();
    System.out.println("Capacidade de carga: " + this.capacidade_carga);
    }


    public float getCapacidade_carga() {
        return capacidade_carga;
    }

    public void setCapacidade_carga(float capacidade_carga) {
        this.capacidade_carga = capacidade_carga;
    }

    public Caminhao(String marca, String modelo, int ano, float velocidade) {
        super(marca, modelo, ano, velocidade);
        this.capacidade_carga = capacidade_carga;
    }
}
