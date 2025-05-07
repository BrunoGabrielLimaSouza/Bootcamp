public class Carro extends Veiculo{
    private int numeroPortas;



    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Numero de Portas " + this.numeroPortas);
    }





    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
}
