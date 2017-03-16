class Main {
  public static void main(String[] args) {

    System.out.println("OK!"); // string literal: ""
    char letra = 'c';
    System.out.println( (char) (letra - 32) );
    // Especificação:
    System.out.println(Texto.up('c')); // C
    System.out.println(Texto.up('c') == 'C'); // true
    System.out.println(Texto.up('A') == 'A'); // true
    System.out.println(Texto.up('1') == '1'); // true
    System.out.println(Texto.up(' ') == ' '); // true
    System.out.println(Texto.up('a') == 'A'); // true
    System.out.println(Texto.up('z') == 'Z'); // true

    System.out.println(Texto.up("tads")); // TADS
    System.out.println(Texto.up("tads") == "TADS");
    System.out.println(Texto.up("tads").equals("TADS"));

    // capitalize: capitalizar
    // exemplo => Exemplo
    // caso feliz => Caso feliz
    // ANALISE => Analise
    // taDS => Tads

    System.out.println(Texto.down('A') == 'a');
    System.out.println(Texto.down('a') == 'a');
    System.out.println(Texto.down('Z') == 'z');

    System.out.println(Texto.down("TADS").equals("tads"));
    System.out.println(Texto.down("tAdS4$").equals("tads4$"));

    // substring leniente
    // Texto.substr("palavra", indice, quantidade)
    // Texto.substr("palavra", 0, 4) => "pala"
    // Texto.substr("palavra", 2, 2) => "la"
    //  0123456
    // Texto.substr("palavra", 5, 3) => "ra"

    System.out.println(Texto.substr("palavra", 0, 4)); // pala
    System.out.println(Texto.substr("palavra", 0, 4).equals("pala"));

    System.out.println(Texto.cap("exemplo")); // Exemplo
    System.out.println(Texto.cap("exemplo").equals("Exemplo"));
    System.out.println(Texto.cap("ANALISE").equals("Analise"));

    // System.out.println( (int)c );
    // System.out.println( (int)'a' );
    // System.out.println( (char) 98);

  }
}
