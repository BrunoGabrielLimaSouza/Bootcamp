public class Pessoa {
    private String nome;
    private int idade = 0;
    private String cpf;
    private double peso;
    private double altura;

    public Pessoa(String cpf, String nome, int idade, double peso, double altura) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public boolean deIdade() {
        return this.idade >= 18;
    }

    public boolean difIdade(Pessoa pessoa) {
        if (this.idade > pessoa.getIdade()) {
            return true;
        }
        return false;

    }

    public boolean validarCPF() {
        if (this.cpf.length()>11) {
            return false;
        }else {
            return true;
        }
    }
    public double calcularIMC() {
        double imc = (altura*altura)/peso;
        return imc;
    }





    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
