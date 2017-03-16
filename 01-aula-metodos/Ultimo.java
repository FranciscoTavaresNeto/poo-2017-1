class Ultimo {

  // o char e a quantidade são parametrizados
  // o método tem uma ASSINATURA/API (contrato)
  static void imprimeSeparador(char c, int qtd) {

    for (int i = 0; i < qtd; i++) System.out.print(c);

    System.out.println();
  }
  // POLIMORFISMO AD-HOC:
  // Polimorfismo por Sobrecarga de Métodos
  // Métodos que têm o mesmo nome, mas variam
  // nos argumentos/parâmetros
  static void imprimeSeparador() {
    // DESENVOLVEDORES BUSCAM SEMPRE
    // REAPROVEITAR CÓDIGO (LÓGICA)
    imprimeSeparador('_', 15);
  }

  static void imprimeFraseComSeparador(String s) {
    System.out.println(s);
    imprimeSeparador('-', s.length());
  }

  public static void main(String[] args) {

    System.out.println("IFRS");
    imprimeSeparador('#', 4);
    String s = "Campus Rio Grande";
    System.out.println(s);
    imprimeSeparador('$', s.length());
    System.out.println("Divisão de Computação");
    imprimeSeparador('-', 21);
    System.out.println("TADS");
    imprimeSeparador('_', 4);
    System.out.println("POO");
    imprimeSeparador(); // DEFAULT '_', 15

    imprimeFraseComSeparador("Batman vs Superman");






  }
}
