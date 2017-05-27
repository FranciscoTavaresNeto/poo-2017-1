package cobaia;

public class AtaqueDuploNoFim implements Ataque {

    private int hits = 5;
    
    @Override
    public int getHitsRestantes() {
        return this.hits;
    }

    @Override
    public Inimigo ataca(Torre torre, IList<Inimigo> inimigos) {
        if (this.hits > 0) {
            Inimigo inimigo = inimigos.getFirst();
        
            for (int i = 1; i < inimigos.count(); i++)
                if (inimigos.get(i).getVida() < inimigo.getVida())
                    inimigo = inimigos.get(i);
            
            inimigo.sofreDano(hits == 1 ? torre.dano * 2 : torre.dano);
            
            this.hits--;
            return inimigo;
        }        
        
        return null;
    }    
}
