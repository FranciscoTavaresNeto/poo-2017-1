package pkg16;

public class Torre extends Peca {

    public final int alcance;
    private Ataque ataque;

    public Torre(int x, int y, int dano, int alcance) {
        super(x, y, dano);
        this.alcance = alcance;
        this.ataque = new AtaquePadrao();
    }
    // TORNANDO O ATAQUE VARIÁVEL
    public void setAtaque(Ataque ataque) {
        this.ataque = ataque;
    }
    
    

    public void ataca(IList<Inimigo> inimigosPossiveis) {
        // DELEGAR PARA A IMPLEMENTAÇÃO DE ATAQUE
        ataque.ataca(this, inimigosPossiveis);
    }
      
    public boolean alcanca(Inimigo inimigo) {        
        return distancia(inimigo) <= this.alcance;
    }
    
    
   
    @Override
    public String toString() {
        return "Torre{" + "x=" + x + ", y=" + y + ", dano=" + dano + ", alcance=" + alcance + '}';
    }
    

}



