package pkg11.towerdefense;

public class Torre extends Peca {

    public final int alcance;

    public Torre(int x, int y, int dano, int alcance) {
        super(x, y, dano);
        this.alcance = alcance;
    }

    public void ataca(IList<Inimigo> inimigosPossiveis) {
        inimigosPossiveis.getFirst().sofreDano(this.dano);
    }
        
    public boolean alcanca(Inimigo inimigo) {        
        return distancia(inimigo) <= this.alcance;
    }
    
    
   
    @Override
    public String toString() {
        return "Torre{" + "x=" + x + ", y=" + y + ", dano=" + dano + ", alcance=" + alcance + '}';
    }
    

}



