class Main {
  public static void main(String[] args) {

    // ArCondicionado ar = new ArCondicionado("Branco Malboro", 220, 9000);
    // System.out.println(ar.temp());
    // ar.power();
    // ar.up();
    // System.out.println(ar.temp());
    // ar.temperatura = 10; // QUEBRA DO ENCAPSULAMENTO!
    // ENCAPSULAMENTO: proteger o "estado" do objeto
    // com acesso controlado!
    // System.out.println(ar.temp());

    // Poupanca: saldo, agencia, numero, cpf (simplificada)
    Poupanca poup1 = new Poupanca("12345678901", 7766, 88222, 100.0);
    System.out.println(poup1.cpf);
    // System.out.println(poup1.saldo); // não funciona (saldo é privado)
    System.out.println(poup1.consultaSaldo()); // operação de consulta
    System.out.println(poup1.consultaSaldo()); // operação de consulta
    System.out.println(poup1.consultaSaldo()); // operação de consulta

    poup1.deposito(100.0); // comando! (geralmente são void)
    System.out.println(poup1.consultaSaldo()); // 200.0
    System.out.println(poup1.consultaSaldo() == 200.0);

    try {
      poup1.deposito(-500.0);
      System.out.println(false); // Testes formais é com JUnit
    } catch(IllegalArgumentException e) {
      System.out.println(true);
      System.err.println(e.getMessage());
    }

    System.out.println(poup1.consultaSaldo()); // 200.0

    poup1.saque(50.0); // void

    System.out.println(poup1.consultaSaldo()); // 150.0

    System.out.println(poup1);
    // equivale a:
    System.out.println(poup1.toString());

    Poupanca poup2 = new Poupanca("88877766655", 7766, 99882, 1000.0);
    System.out.println(poup2);
    // this         // destino
    poup2.transfere(poup1, 200.0); // poup2 transfere R$ 200 para poup1
    System.out.println(poup2.consultaSaldo()); // 800.0
    System.out.println(poup2.consultaSaldo() == 800.0); // 800.0

    System.out.println(poup1.consultaSaldo()); // 350.0
    System.out.println(poup1.consultaSaldo() == 350.0); // 350.0

    System.out.println(poup1.consultaHistorico());

    // outras opções!
    // poup1.depositar(100.0);
    // poup1.deposita(100.0);

    // Poupanca poup2 = new Poupanca("98765432109", 7766, 88221, 99.99);
    // System.out.println(poup2.cpf);









  }
}
