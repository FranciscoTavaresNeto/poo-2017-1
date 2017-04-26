package pkg10.interfaces;

public class Main {

    public static void main(String[] args) {

        ICaixaEletronico caixa = new CaixaEletronico();
        
        System.out.println(caixa.getSaldo() == 0);
        System.out.println(caixa.getQuantidade(Cedula.Dez) == 0);
        System.out.println(caixa.getQuantidade(Cedula.Cinquenta) == 0);
        
        caixa.abastece(10, Cedula.Dez);
        caixa.abastece(10, Cedula.Cinquenta);
        
        System.out.println(caixa.getSaldo() == 600);
        System.out.println(caixa.getQuantidade(Cedula.Dez) == 10);
        System.out.println(caixa.getQuantidade(Cedula.Cinquenta) == 10);
        
        try {
            caixa.saque(30);
            System.out.println(true);
        } catch (CedulaIndisponivelException | SaldoInsuficienteException ex) {
            System.out.println(false);
        }
        
        System.out.println(caixa.getSaldo() == 570);
        System.out.println(caixa.getQuantidade(Cedula.Dez) == 7);
        System.out.println(caixa.getQuantidade(Cedula.Cinquenta) == 10);
        
        try {
            caixa.saque(100);
            System.out.println(true);
        } catch (CedulaIndisponivelException | SaldoInsuficienteException ex) {
            System.out.println(false);
        }
        
        System.out.println(caixa.getSaldo() == 470);
        System.out.println(caixa.getQuantidade(Cedula.Dez) == 7);
        System.out.println(caixa.getQuantidade(Cedula.Cinquenta) == 8);
        
        try {
            caixa.saque(500);
            System.out.println(false);
        } catch (CedulaIndisponivelException ex) {
            System.out.println(false);
        } catch (SaldoInsuficienteException ex) {
            System.out.println(true);
        }
        
        System.out.println(caixa.getSaldo() == 470);
        System.out.println(caixa.getQuantidade(Cedula.Dez) == 7);
        System.out.println(caixa.getQuantidade(Cedula.Cinquenta) == 8);
        
        try {
            caixa.saque(55);
            System.out.println(false);
        } catch (CedulaIndisponivelException ex) {
            System.out.println(true);
        } catch (SaldoInsuficienteException ex) {
            System.out.println(false);
        }
        
    }
    
}
