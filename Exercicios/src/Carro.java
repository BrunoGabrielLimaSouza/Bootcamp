public class Carro extends Veiculo{
    private int num_portas;



    @Override
    public void exibir_info(){
        super.exibirInfo();
        System.out.println("Numero de Portas " + this.num_portas);
    }





    public Carro(String marca, String modelo, int ano, float velocidade) {
        super(marca, modelo, ano, velocidade);
        this.num_portas = num_portas;
    }

    public int getNum_portas() {
        return num_portas;
    }

    public void setNum_portas(int num_portas) {
        this.num_portas = num_portas;
    }
}
