package comheranca;

class Arqueiro extends Personagem {

    public Arqueiro(String nome) {
        super(nome);
    }

    @Override
    protected void dano(Personagem outro) {
        outro.vida -= 5;        
    }

    
}
