public class Produto {
    private double preco;
    private double desconto;

    public double simularDesconto(){
        return this.preco -( this.preco*(this.desconto/100));
    }



    public Produto(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
