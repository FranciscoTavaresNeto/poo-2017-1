package cobaia;

// INTERFACE SÃO ESTRUTURAS TOTALMENTE ABSTRATAS
// (SEM IMPLEMENTAÇÃO)
public interface Ataque {
    
    // DEFAULT: JAVA 8+
    public default int getHitsRestantes() {
        return 1;
    }
    
    public Inimigo ataca(Torre torre, IList<Inimigo> inimigosPossiveis);
    
}
