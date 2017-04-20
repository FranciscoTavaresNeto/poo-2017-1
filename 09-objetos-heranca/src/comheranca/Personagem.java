package comheranca;

// classes abstratas não podem ser instanciadas
// só suas filhas (subclasses/subtipos)
abstract class Personagem {

    private final String nome;
    // protected: atributo acessível para os subtipos (filhas)
    protected int vida; 
    
    Personagem(String nome) {
        this.nome = nome;
        this.vida = 100;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + 
                "{" + "nome=" + nome 
                + ", vida=" + vida + ", vivo=" + estaVivo() + '}';
    }

    public void ataque(Personagem outro) {
        // pré-condição para dano
        if (outro != this && this.estaVivo() && outro.estaVivo()) {
            // dano é abstrato
            dano(outro);
            // pós-condição obrigatória
            if (outro.vida < 0) outro.vida = 0;
        }
    }
    
    protected abstract void dano(Personagem outro);

    public boolean estaVivo() {
        return this.vida > 0;
    }
    
}
