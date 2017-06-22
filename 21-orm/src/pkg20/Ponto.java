package pkg20;

import java.time.*;

public class Ponto extends Entidade {

    
    private LocalDateTime entrada, saida;

    public Ponto(LocalDateTime entrada, LocalDateTime saida) {
        this.entrada = entrada;
        this.saida = saida;
    }


    public LocalDateTime getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDateTime entrada) {
        this.entrada = entrada;
    }

    public LocalDateTime getSaida() {
        return saida;
    }

    public void setSaida(LocalDateTime saida) {
        this.saida = saida;
    }

    @Override
    public String toString() {
        return "Ponto{" + "codigo=" + codigo + ", entrada=" + entrada + ", saida=" + saida + '}';
    }
    
}
