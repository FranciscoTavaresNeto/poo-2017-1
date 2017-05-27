package pkg16;

public class AtaqueMaisVida implements Ataque {

    @Override
    public void ataca(Torre torre, IList<Inimigo> inimigos) {
        
        Inimigo inimigo = inimigos.getFirst();
        
        for (int i = 1; i < inimigos.count(); i++)
            if (inimigos.get(i).getVida() > inimigo.getVida())
                inimigo = inimigos.get(i);

        inimigo.sofreDano(torre.dano);
        
    }
    
}
