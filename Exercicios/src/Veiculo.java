public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidade;

    public void acelerar(){
        this.velocidade +=10;
    }

    public void frear(){
        this.velocidade -=10;
        if (this.velocidade <= 0) {
            this.velocidade =0;
        }
    }

    public void exibirInfo(){
        System.out.println("Informações do veiculo: ");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Velocidade Atual: " + this.velocidade);

    }
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }
}
