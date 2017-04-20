package comheranca;

class Ladino extends Personagem {

    public Ladino(String nome) {
        super(nome);
    }

    @Override
    protected void dano(Personagem outro) {
        outro.vida -= 14;
    }

    
}
