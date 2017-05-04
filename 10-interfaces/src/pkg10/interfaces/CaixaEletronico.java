package pkg10.interfaces;

public class CaixaEletronico implements ICaixaEletronico {
    
    // TODO: extrair a lógica da chave/valor
    
    // chave
    private Cedula[] cedulas = Cedula.values();
    // valor
    private int[] quantidades = new int[Cedula.values().length];
    
    @Override
    public void abastece(int quantidade, Cedula cedula) {
        for (int i = 0; i < cedulas.length; i++) {
            if (cedulas[i] == cedula) {
                quantidades[i] += quantidade;
                break;
            }
        }
    }

    @Override
    public int getQuantidade(Cedula cedula) {
        for (int i = 0; i < cedulas.length; i++) 
            if (cedulas[i] == cedula) 
                return quantidades[i];
        return 0;
    }

    @Override
    public int getSaldo() {
        int saldo = 0;
        for (int i = 0; i < cedulas.length; i++) {
            saldo += quantidades[i] * cedulas[i].valor;
        }
        return saldo;
    }

    @Override
    public void saque(int valor) throws CedulaIndisponivelException, SaldoInsuficienteException {
        if (valor > getSaldo()) throw new SaldoInsuficienteException();        
        // TODO: fazer sacar!
    }
    
}
