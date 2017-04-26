package pkg10.interfaces;

public interface ICaixaEletronico {
    
    public void abastece(int quantidade, Cedula cedula);
    
    /**
     * Consulta a quantidade de determinada cédula
     * 
     * @param cedula a cédula a ser consultada
     * @return a quantidade desta cédula
     */
    public int getQuantidade(Cedula cedula);
    
    /**
     * Consulta o valor total em dinheiro disponível
     * 
     * @return o valor total
     */
    public int getSaldo();
    
    /**
     * Retira cédulas do ATM dada a combinação
     * para atender o valor, priorizando as 
     * cédulas de maior valor;
     * 
     * @param valor o valor desejado para saque
     * @throws CedulaIndisponivelException sempre que não for possível combinar as cédulas para atender o valor
     * @throws SaldoInsuficienteException  quando não há saldo para atender a solicitação
     */
    public void saque(int valor) throws CedulaIndisponivelException,
                                        SaldoInsuficienteException;
    
}
