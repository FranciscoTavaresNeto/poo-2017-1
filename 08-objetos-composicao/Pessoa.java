class Pessoa {
  final String nome;
  final Veiculo[] veiculos = new Veiculo[100];

  Pessoa(String nome) {
    this.nome = nome;
  }

  void adquirir(Veiculo v) {
    for (int i = 0; i < this.veiculos.length; i++) {
      if (this.veiculos[i] == null) {
        this.veiculos[i] = v;
        break;
      }
    }
  }

  // XGH
  Veiculo[] getVeiculos() {
    int cont = 0;
    for (int i = 0; i < this.veiculos.length; i++)
      if (this.veiculos[i] != null) cont++;
    // variável local
    Veiculo[] veiculos = new Veiculo[cont];

    for (int i = 0, j = 0; i < this.veiculos.length; i++)
      if (this.veiculos[i] != null)
        veiculos[j++] = this.veiculos[i];

    return veiculos;
  }
  // transferência de propriedade
  // o que caracteriza AGREGAÇÃO
  void transferir(Veiculo veiculo, Pessoa pessoa) {
    this.devolver(veiculo); // perder a propriedade
    pessoa.adquirir(veiculo);
  }
  // o método devolver é auxiliar
  // não é acessível fora dessa classe (Pessoa)
  // ** não faz parte da API de Pessoa **
  private void devolver(Veiculo veiculo) {
    for (int i = 0; i < this.veiculos.length; i++) {
      if (this.veiculos[i] == veiculo) {
        this.veiculos[i] = null;
        break;
      }
    }
  }









}
