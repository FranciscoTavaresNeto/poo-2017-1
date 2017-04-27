package pkg10.interfaces;

public class CaixaEletronico implements ICaixaEletronico {

    private int dez = 0;
    
    @Override
    public void abastece(int quantidade, Cedula cedula) {
        if (cedula == Cedula.Dez) dez += quantidade;
    }

    @Override
    public int getQuantidade(Cedula cedula) {
        if (cedula == Cedula.Dez) return dez;
        return 0;
    }

    @Override
    public int getSaldo() {
        int saldo = 0;
        saldo += dez * 10;
        return saldo;
    }

    @Override
    public void saque(int valor) throws CedulaIndisponivelException, SaldoInsuficienteException {
        if (valor > getSaldo()) throw new SaldoInsuficienteException();        
        if (valor % 10 == 0) dez -= valor / 10;                    
    }
    
}
