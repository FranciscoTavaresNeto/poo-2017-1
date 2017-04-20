package comheranca;

class Guerreiro extends Personagem {

    public Guerreiro(String nome) {
        super(nome);
    }

    @Override
    protected void dano(Personagem outro) {
       outro.vida -= 12;
    }
    
}
