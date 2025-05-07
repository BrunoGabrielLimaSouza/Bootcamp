public class Motorista {
    private String nome;
    private String cnh;
    private Veiculo veiculo;


    public void atribuirVeiculo(Veiculo veiculo){
    this.veiculo = veiculo;
    }

    public void desvicularVeiculo(Veiculo veiculo){
        this.veiculo = null;
    }

    public void dirigir() {
        if (veiculo != null) {
            System.out.println(this.nome + " está dirigindo um: " + this.veiculo);
        }else {
            System.out.println(this.nome + " não está dirigindo.");
        }

    }
    public Motorista(String nome, String cnh) {
        this.nome = nome;
        this.cnh = cnh;
    }

    public Motorista(String nome, String cnh, Veiculo veiculo) {
        this.nome = nome;
        this.cnh = cnh;
        this.veiculo = veiculo;
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
