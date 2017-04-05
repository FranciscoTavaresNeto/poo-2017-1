class ArCondicionado {

  final String cor;
  final int voltagem;
  final int potencia;
  private int temperatura;
  // atributo privado! só pode ser lido e alterado a partir
  // da classe onde foi declarado (class ArCondicionado)
  private boolean ligado;

  ArCondicionado(String cor, int voltagem, int potencia) {
    this.cor = cor;
    this.voltagem = voltagem;
    this.potencia = potencia;
    this.ligado = false;
    this.temperatura = 20;
  }

  int temp() { // método "acessor" do atributo temperatura
    return this.temperatura;
  }

  void power() {
    if (this.ligado) this.ligado = false;
    else this.ligado = true;
  }

  void up() {
    if (this.ligado && this.temperatura < 25) this.temperatura++;
  }

  void down() {
    if (this.ligado && this.temperatura > 17) this.temperatura--;
  }

}
