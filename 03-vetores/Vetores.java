class Vetores {
  public static void main(String[] args) {
    // String[] palavras = new String[20];
    // fração
    // int n = 2, d = 3;
    // int[] f = new int[2];
    // f[0] = 2;
    // f[1] = 3;
    int[] f = {2, 3};
    System.out.println(f[0] + "/" + f[1]);

    int[] f1 = {2, 3};
    int[] f2 = {3, 4};

    int[] r = Numero.mult(f1, f2);

    System.out.println(r[0] == 6);
    System.out.println(r[1] == 12);



  }
}
