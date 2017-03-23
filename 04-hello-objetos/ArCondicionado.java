class ArCondicionado {
  // características (atributos) fixos (perenes)
  final String cor; // final significa constante!
  final int voltagem;
  final int potencia; // btus
  // características (atributos) variáveis (estado!)
  int temperatura;
  boolean ligado;
  // para informar os dados básicos do objeto:
  // usamos um CONSTRUTOR (implica em uma obrigação)
  ArCondicionado(String cor, int voltagem, int potencia) {
    this.cor = cor;
    this.voltagem = voltagem;
    this.potencia = potencia;
    this.ligado = false;
    this.temperatura = 20;
  }
  // operações (o que o objeto pode fazer!)
  // operações são descritas com métodos!
  void power() {
    if (this.ligado) this.ligado = false;
    else this.ligado = true;
    // ligado = !ligado;
  }

  void up() {
    if (this.ligado && this.temperatura < 25) this.temperatura++;
  }

  void down() {
    if (this.ligado && this.temperatura > 17) this.temperatura--;
  }


}
