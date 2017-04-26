package pkg10.interfaces;

public enum Cedula {
    // Dez = new Cedula();
    // Vinte = new Cedula();
    Dez(10), Vinte(20), Cinquenta(50), Cem(100);
    
    public final int valor;
    
    Cedula(int valor) {
        this.valor = valor;
    }
}
