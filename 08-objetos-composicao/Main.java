class Main {
  public static void main(String[] args) {

    Pessoa p1 = new Pessoa("Kalleo");
    Pessoa p2 = new Pessoa("Israel");
    Pessoa p3 = new Pessoa("Penna");

    Veiculo v1 = new Veiculo("CB 300");
    Veiculo v2 = new Veiculo("Uno Fire");
    Veiculo v3 = new Veiculo("Honda Civic");

    p1.adquirir(v1); // agregação
    p1.adquirir(v2);

    Veiculo[] veiculos = p1.getVeiculos();

    System.out.println(veiculos.length);
    System.out.println(veiculos.length == 2);

    System.out.println(veiculos[0].descricao); // CB
    System.out.println(veiculos[1].descricao); // Uno
    System.out.println(veiculos[0] == v1);
    System.out.println(veiculos[1] == v2);

    System.out.println(p2.getVeiculos().length);
    System.out.println(p2.getVeiculos().length == 0);

    p1.transferir(v1, p2);

    System.out.println(p1.getVeiculos().length == 1);
    System.out.println(p1.getVeiculos()[0] == v2);

    System.out.println(p2.getVeiculos().length == 1);
    System.out.println(p2.getVeiculos()[0] == v1);







  }
}
