package comheranca;

class Mago extends Personagem {
    
    public Mago(String nome) {
        super(nome);
    }

    @Override
    protected void dano(Personagem outro) {
        outro.vida -= 7;
    }
    
    void cura(Personagem outro) {        
        outro.vida += 7;
        if (outro.vida > 100) outro.vida = 100;
    }
    
}