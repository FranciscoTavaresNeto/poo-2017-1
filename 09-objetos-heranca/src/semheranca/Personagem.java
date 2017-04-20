package semheranca;

class Personagem {
    // METAS:
    private final String nome;
    private final int tipo; // TODO: acabar com o atributo de tipo através da herança
    private int vida;

    public Personagem(String nome, int tipo) {
        // TODO: flexibilizar a validação dos tipos de personagens
        if (tipo < 0 || tipo > 3) 
            throw new IllegalArgumentException("tipo invalido");
        this.nome = nome;
        this.tipo = tipo;
        this.vida = 100;
    }

    public String getNome() {
        return nome;
    }

    public int getTipo() {
        return tipo;
    }

    public int getVida() {
        return vida;
    }

    @Override
    public String toString() {
        // TODO: tornar o toString mais amigável
        return "Personagem{" + "nome=" + nome + ", tipo=" + tipo + ", vida=" + vida + '}';
    }    

    void ataque(Personagem outro) {
        // TODO: acabar com os if's
        if (this.tipo == 3) outro.vida -= 14;
        if (this.tipo == 2) outro.vida -= 5;
        if (this.tipo == 1) outro.vida -= 12;
        if (this.tipo == 0) outro.vida -= 7;
    }
    
}
