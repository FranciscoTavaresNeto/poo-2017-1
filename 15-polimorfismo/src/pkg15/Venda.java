package pkg15;

public abstract class Venda {
    
    private final String descricao;
    private final double preco;

    public Venda(String descricao, double preco) {
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
        return this.getClass().getSimpleName() 
                + " " + descricao + " " + preco;
    }
   
}
