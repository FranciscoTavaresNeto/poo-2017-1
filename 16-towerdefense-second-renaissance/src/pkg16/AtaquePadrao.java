package pkg16;

// SRP
// SINGLE RESPONSIBILITY PRINCIPLE
// PRINCÍPIO DA RESPONSABILIDADE ÚNICA

public class AtaquePadrao implements Ataque {

    @Override
    public void ataca(Torre torre, IList<Inimigo> inimigosPossiveis) {
        inimigosPossiveis.getFirst().sofreDano(torre.dano);
    }    
}
