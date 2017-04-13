class Main4 {
  public static void main(String[] args) {

    CPF cpf1 = new CPF("12345678901");
    CPF cpf2 = new CPF("09876543210");
    CPF cpf3 = new CPF("12345678901");

    System.out.println(cpf1);
    System.out.println(cpf2);
    System.out.println(cpf3);

    System.out.println(cpf1 == cpf2);
    System.out.println(cpf2 == cpf3);
    System.out.println(cpf1 == cpf3);

    System.out.println(cpf1.equals(cpf3)); // true!














  }
}
