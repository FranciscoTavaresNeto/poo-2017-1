class Main2 {
  public static void main(String[] args) {

    System.out.println("Main 2 lives!");

    Usuario u1 = new Usuario("marcio@gmail.com");
    Usuario u2 = new Usuario("flavio@outlook.com");
    // COMPOSIÇÃO
    u1.perfil.nome = "Marcio Torres";
    u1.perfil.dataNascimento = "25/10/1976";

    u2.perfil.nome = "Flavio Ricardo";
    u2.perfil.dataNascimento = "25/09/1998";

    System.out.println(u1.email);
    System.out.println(u1.perfil.nome);
    System.out.println(u2.email);
    System.out.println(u2.perfil.nome);





  }
}
