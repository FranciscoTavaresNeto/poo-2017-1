package pkg15;

public class Produto {

    private final String descricao;
    private final double preco;

    public Produto(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return descricao + " " + preco;
    }
    
    
    
}
