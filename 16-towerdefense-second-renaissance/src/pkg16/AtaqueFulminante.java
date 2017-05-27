package pkg16;

public class AtaqueFulminante implements Ataque {

    @Override
    public void ataca(Torre torre, IList<Inimigo> inimigosPossiveis) {
        Inimigo i = inimigosPossiveis.getFirst();        
        i.sofreDano(i.getVida());
    }
    
}
