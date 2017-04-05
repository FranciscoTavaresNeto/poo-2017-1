class Main {
  public static void main(String[] args) {
    CPF cpf = new CPF("12335678901");
    Poupanca poup1 = new Poupanca(cpf, 7766, 88222, 100.0);
    System.out.println(poup1.cpf.numero);
    System.out.println(poup1.consultaSaldo());
    System.out.println(poup1.cpf.formatado()); // 123.356.789-01

    SeguroVida seg =
      new SeguroVida(new CPF("12356789012"),
                     new CPF("09875432102"), 100000.0);

    System.out.println(seg.cpfSegurado);
    System.out.println(seg.cpfBeneficiario);
    System.out.println(seg.valorSeguro);

    System.out.println(seg.cpfSegurado.formatado());
    System.out.println(seg.cpfBeneficiario.formatado());
  }
}
