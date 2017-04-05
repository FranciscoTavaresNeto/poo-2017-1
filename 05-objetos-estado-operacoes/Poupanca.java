class Poupanca {
  // definição dos atributos (imutável, mutável)
  final int agencia, numero;
  final String cpf;
  private double saldo;
  private String historico = "";

  // construtor
  Poupanca(String cpf, int agencia, int numero, double depositoInicial) {
    this.cpf = cpf;
    this.agencia = agencia;
    this.numero = numero;
    // situação excepcional: depositoInicial < 100
    if (depositoInicial < 100) {
      throw new IllegalArgumentException("deposito inicial deve ser no minimo R$ 100,00");
    }
    this.deposito(depositoInicial);
  }

  double consultaSaldo() { // idempotente
    return this.saldo;
  }

  void deposito(double valor) {
    if (valor <= 0.0) throw new IllegalArgumentException("valor deve ser positivo");
    this.saldo += valor;
    this.historico += "deposito de " + valor + "\n";
  }

  void saque(double valor) {
    if (valor <= 0.0) throw new IllegalArgumentException("valor deve ser maior que zero");
    if (valor > this.saldo) throw new IllegalArgumentException("não há saldo suficiente");
    this.saldo -= valor;
    this.historico += "saque de " + valor + "\n";
  }

  void transfere(Poupanca destino, double valor) {
    this.saque(valor);
    destino.deposito(valor);
  }


  String consultaHistorico() {
    return this.toString() + "\nHistórico:\n" + this.historico;
  }

  // considerar sempre escrever o método toString
  public String toString() {
    return "agencia: " + this.agencia
         + "\nnumero: " + this.numero
         + "\nsaldo: " + this.saldo;
  }







}
