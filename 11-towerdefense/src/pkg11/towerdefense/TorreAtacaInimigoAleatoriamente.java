package pkg11.towerdefense;

public class TorreAtacaInimigoAleatoriamente extends Torre {
    
    public TorreAtacaInimigoAleatoriamente(int x, int y, int dano, int alcance) {
        super(x, y, dano, alcance);
    }

    @Override
    public void ataca(IList<Inimigo> inimigosPossiveis) {
        
        int i = (int) (Math.random() * inimigosPossiveis.count());
        
        inimigosPossiveis.get(i).sofreDano(dano);
        
    }
    
}
