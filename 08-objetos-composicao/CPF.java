class CPF {
  final String numero;
  CPF(String numero) { this.numero = numero; }
  public String toString() { return numero; }

  public boolean equals(Object o) {
    // O objeto o é uma instância de CPF?
    if (!(o instanceof CPF)) return false;
    return this.numero.equals(((CPF)o).numero);
  }
}
