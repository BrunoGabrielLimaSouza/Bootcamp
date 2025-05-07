public class Caminhao extends Veiculo{
    private float capacidadeCarga;



    @Override
    public void exibirInfo(){
    super.exibirInfo();
    System.out.println("Capacidade de carga: " + this.capacidadeCarga);
    }


    public float getCapacidade_carga() {
        return capacidadeCarga;
    }

    public void setCapacidade_carga(float capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public Caminhao(String marca, String modelo, int ano, float capacidadeCarga) {
        super(marca, modelo, ano);
        this.capacidadeCarga = capacidadeCarga;
    }
}
