package pkg11.towerdefense;

public class TorreAtacaInimigoMaisVida extends Torre {
    
    public TorreAtacaInimigoMaisVida(int x, int y, 
                                     int dano, int alcance) {
        super(x, y, dano, alcance);
    }

    @Override
    public void ataca(IList<Inimigo> inimigosPossiveis) {
        Inimigo maisVida = inimigosPossiveis.getFirst();
        
        for (int i = 1; i < inimigosPossiveis.count(); i++)
            if (inimigosPossiveis.get(i).getVida() > maisVida.getVida())
                maisVida = inimigosPossiveis.get(i);
        
        maisVida.sofreDano(this.dano);
    }
    
}
