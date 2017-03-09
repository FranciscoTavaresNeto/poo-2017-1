class Parametrizavel {
  // meu primeiro método (função ou procedimento)
  // método estático sem retorno (void)
  // chamado imprimeSeparador
  // que recebe como parâmetro um char
  static void imprimeSeparador(char c) { // ABSTRAÇÃO

    for (int i = 0; i < 20; i++) System.out.print(c);

    System.out.println();

  }

  public static void main(String[] args) {

    System.out.println("IFRS");
    imprimeSeparador('#');
    System.out.println("Campus Rio Grande");
    imprimeSeparador('$');
    System.out.println("Divisão de Computação");
    imprimeSeparador('-');
    System.out.println("TADS");
    imprimeSeparador('_');


  }
}
