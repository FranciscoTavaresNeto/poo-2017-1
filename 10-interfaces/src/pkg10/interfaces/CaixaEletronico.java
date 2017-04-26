package pkg10.interfaces;

public class CaixaEletronico implements ICaixaEletronico {

    private int dez = 0;
    
    @Override
    public void abastece(int quantidade, Cedula cedula) {
        if (cedula == Cedula.Dez) dez += quantidade;
    }

    @Override
    public int getQuantidade(Cedula cedula) {
        return 0;
    }

    @Override
    public int getSaldo() {
        return 0;
    }

    @Override
    public void saque(int valor) throws CedulaIndisponivelException, SaldoInsuficienteException {
        
    }

    
}
