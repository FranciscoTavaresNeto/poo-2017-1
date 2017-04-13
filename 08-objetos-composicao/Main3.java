class Main3 {
  public static void main(String[] args) {

    System.out.println("Main 3 up and running!");

    Funcionario f1 = new Funcionario("Victor");
    Funcionario f2 = new Funcionario("Domingos");

    f1.adicionaDependente("Quaresma");
    f1.adicionaDependente("Gustavo");

    System.out.println(f1.getDependentes()[0].nome); // Quaresma
    System.out.println(f1.getDependentes()[1].nome); // Gustavo

    
  }
}
