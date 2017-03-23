class Numero {
  public static void main(String[] args) {
      System.out.println(Numero.mdc(12, 18) == 6);
  }

  static int[] mult(int[] f1, int[] f2) {
    if (f1.length != 2) {
      throw new IllegalArgumentException("A fracao deve ter dois numeros");
    }


    return new int[] {f1[0] * f2[0], f1[1] * f2[1]};
  }

  static int mdc(int a, int b) {
    int d = 1;
    for (int i = 2; i <= a && i <= b; i++) {
      d = a % i == 0 && b % i == 0 ? i : d;
    }
    return d;
  }
}
