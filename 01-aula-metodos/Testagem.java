class Testagem {
    // saída (retorno) // entrada do método (parâmetros)
  static int potencia(int x, int y) {
    // if (y == 0) return 1;
    int z = 1;
    for (int i = 0; i < y; i++) z *= x;
    return z;
  }

  public static void main(String[] args) {
    // potência: base, expoente: resultado
    // ex: 2^8=256
    // PROJETAR o método potência
    int base = 2;
    int expoente = 8;
    int resultado = potencia(base, expoente);
    // especificação
    System.out.println(base + "^" + expoente + "=" + resultado);
    // o que vai imprimir?
    // 2^8=256

    // Caso de Teste
    // Se eu chamar potência com base 2 e expoente 8 vai dar 256
    // ASSERTIVA: boolean   true: teste passou false: teste falhou
    System.out.println(resultado == 256);

    System.out.println(potencia(2, 10) == 1024);
    System.out.println(potencia(3, 3) == 27);
    System.out.println(potencia(9, 0) == 1);
    System.out.println(potencia(9, 1) == 9);



    // javax.swing.JOptionPane.showMessageDialog(null, r);
  }
}
