class Funcionario {
  final String nome;
  private final Dependente[] dependentes = new Dependente[10];

  Funcionario(String nome) {
    this.nome = nome;
  }

  void adicionaDependente(String nome) {
    Dependente d = new Dependente(nome);
    for (int i = 0; i < this.dependentes.length; i++) {
      if (this.dependentes[i] == null) {
        this.dependentes[i] = d; break;
      }
    }
  }

  Dependente[] getDependentes() {
    int cont = 0;

    for (int i = 0; i < this.dependentes.length; i++)
      if (this.dependentes[i] != null) cont++;

    Dependente[] dependentes = new Dependente[cont];
    for (int i = 0, j = 0; i < this.dependentes.length; i++)
      if (this.dependentes[i] != null)
        dependentes[j++] = this.dependentes[i];

    return dependentes;
  }














}
