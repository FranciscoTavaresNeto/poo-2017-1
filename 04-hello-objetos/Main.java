class Main {
  public static void main(String[] args) {

    // objeto:
    // como modelar uma cadeira como um objeto?!
    // criar uma classe Cadeira [X]

    // Instanciar Cadeiras (construir Cadeiras)
    Cadeira minhacadeira = new Cadeira(); // construtor de Cadeira
    System.out.println(minhacadeira.pes); // 0
    System.out.println(minhacadeira.comBraco);
    System.out.println(minhacadeira.ehReclinavel);
    System.out.println(minhacadeira.material);
    minhacadeira.pes = 4;
    minhacadeira.comBraco = true;
    minhacadeira.ehReclinavel = false;
    minhacadeira.material = "Aço com estofado em tecido";
    System.out.println(minhacadeira);
    System.out.println(minhacadeira.pes);
    System.out.println(minhacadeira.comBraco);
    System.out.println(minhacadeira.ehReclinavel);
    System.out.println(minhacadeira.material);
    Cadeira outracadeira = minhacadeira;
    // outra e minha são referências para o mesmo objeto
    System.out.println(outracadeira.pes); // 4
    outracadeira.pes = 8;
    System.out.println(outracadeira.pes); // 8
    System.out.println(minhacadeira.pes); // 8

    ArCondicionado ar1 = new ArCondicionado("amarelo", 220, 15000);
    System.out.println(ar1.ligado); // false
    System.out.println(ar1.temperatura); // 20
    ar1.power();
    System.out.println(ar1.ligado); // true
    ar1.up();
    ar1.up();
    ar1.up();
    System.out.println(ar1.temperatura); // 23
    ar1.up();
    ar1.up();
    ar1.up();
    System.out.println(ar1.temperatura); // 25
    ar1.down();
    System.out.println(ar1.temperatura); // 24
    ar1.power();
    System.out.println(ar1.ligado); // false
    ar1.down();
    System.out.println(ar1.temperatura); // 24
    ar1.temperatura = -99;
    System.out.println(ar1.temperatura); // -99











  }
}
