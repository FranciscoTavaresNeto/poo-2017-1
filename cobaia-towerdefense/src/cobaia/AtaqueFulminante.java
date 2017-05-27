package cobaia;

public class AtaqueFulminante implements Ataque {

    private int hits = 1;
    
    @Override
    public int getHitsRestantes() {
        return this.hits;
    }
    
    @Override
    public Inimigo ataca(Torre torre, IList<Inimigo> inimigosPossiveis) {
        if (this.hits > 0) {
            Inimigo i = inimigosPossiveis.getFirst();        
            i.sofreDano(i.getVida());
            // if (!i.taVivo()) torre.dano++;
            this.hits--;
            return i;
        }     
        
        return null;
    }
    
}
