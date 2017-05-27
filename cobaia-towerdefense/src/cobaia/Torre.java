package cobaia;

public class Torre extends Peca {

    public final int alcance;
    private final Ataque ataquePadrao = new AtaquePadrao();
    private Ataque ataque;

    public Torre(int x, int y, int dano, int alcance) {
        super(x, y, dano);
        this.alcance = alcance;
    }
    // TORNANDO O ATAQUE VARIÁVEL
    public void setAtaque(Ataque ataque) {
        this.ataque = ataque;
    }
    
    public void ataca(IList<Inimigo> inimigosPossiveis) {
        Ataque a = ataque != null && ataque.getHitsRestantes() > 0 ?
                ataque : ataquePadrao;
        
        Inimigo inimigoAtacado = a.ataca(this, inimigosPossiveis);
        
        if (inimigoAtacado.taMorto()) subirNivel();
    }
    
    // MÉTODO AUXILIAR PRIVADO
    private void subirNivel() {
        this.dano++;
    }
    
    public boolean alcanca(Inimigo inimigo) {        
        return distancia(inimigo) <= this.alcance;
    }
    
    @Override
    public String toString() {
        return "Torre{" + "x=" + x + ", y=" + y + ", dano=" + dano + ", alcance=" + alcance + '}';
    }

    
    

}



