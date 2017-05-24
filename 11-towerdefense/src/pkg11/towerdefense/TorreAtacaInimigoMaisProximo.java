package pkg11.towerdefense;

public class TorreAtacaInimigoMaisProximo extends Torre {
    
    public TorreAtacaInimigoMaisProximo(int x, int y, 
                                        int dano, int alcance) {
        super(x, y, dano, alcance);
    }

    @Override
    public void ataca(IList<Inimigo> inimigosPossiveis) {
        Inimigo maisProximo = inimigosPossiveis.getFirst();
        
        for (int i = 1; i < inimigosPossiveis.count(); i++)
            if (distancia(inimigosPossiveis.get(i)) < distancia(maisProximo))
                maisProximo = inimigosPossiveis.get(i);
        
        maisProximo.sofreDano(this.dano);        
    }
    
}
