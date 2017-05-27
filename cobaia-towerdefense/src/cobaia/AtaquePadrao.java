package cobaia;

// SRP
// SINGLE RESPONSIBILITY PRINCIPLE
// PRINCÍPIO DA RESPONSABILIDADE ÚNICA

public class AtaquePadrao implements Ataque {

    @Override
    public Inimigo ataca(Torre torre, IList<Inimigo> inimigosPossiveis) {
        Inimigo first = inimigosPossiveis.getFirst();
        first.sofreDano(torre.dano);
        return first;
    }    
}
