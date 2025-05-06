public class Motorista {
    private String nome;
    private String cnh;
    private Veiculo veiculo;


    public void atribuir_veiculo(){
    this.veiculo = veiculo;
    }

    public void desvicular_veiculo(){
        this.veiculo = null;
    }

    public Motorista(String nome, String cnh) {
        this.nome = nome;
        this.cnh = cnh;
        this.veiculo = null;
    }


    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
}
